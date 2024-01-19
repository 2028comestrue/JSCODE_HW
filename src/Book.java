import java.util.ArrayList;
import java.util.List;

public class Book {
    //Book의 상태에는 무엇이 있을까? 빠지면 안되는 상태가 무엇이 있을까?
    //1. 책의 번호
    //2. 책의 이름
    //3. 대여 가능 여부
    private List<String> books = new ArrayList<>();
    public List<Integer> bookNumbers = new ArrayList<>();
    public int bookNumber;

    public void setBooks(){
        this.books.add("1. 클린코드(Clean Code)");
        this.books.add("2. 객체지향의 사실과 오해");
        this.books.add("3. 테스트 주도 개발(TDD)");
    }

    public void getCurrentState(){
        for(int i = 0; i < this.books.size(); i++){
            if(bookNumbers.contains(i+1)){
                System.out.println(this.books.get(i) + " - " + "대여 중");
                continue;
            }
            System.out.println(this.books.get(i) + " - " + "대여 가능");
        }
    }
    public boolean isAvailable(int bookNumber){
        return !bookNumbers.contains(bookNumber);
    }
    public String getAvailableMessage(int bookNumber){
        if(isAvailable(bookNumber)){
            return "정상적으로 대여가 완료되었습니다.";
        }
        return "대여 중인 책은 대여할 수 없습니다.";
    }

}