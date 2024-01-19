import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //책 대여 가능 상태 변화에 대한 데이터를 저장하고 그 데이터를 사용해야 한다.
        //이런 데이터는 어디에다 어떻게 저장하지?
        //클래스를 나눠서 책에 대한 상태를 표현하자.
        //그럼 어떤 클래스를 사용해야할까? 어떤 상태와 어떤 함수로 책의 상태를 표현할까?
        //어떻게 나머지는 그대로 출력하고 입력값에 따라 "대여 가능"에서 "대여 중"으로만 바꾸지?

        Book book = new Book();

        //book.books.add("1. 클린코드(Clean Code)");
        //book.books.add("2. 객체지향의 사실과 오해");
        //book.books.add("3. 테스트 주도 개발(TDD)");
        book.setBooks();

        while(true){
            System.out.println("대여할 책의 번호를 입력하세요.");
            /*for(int i = 0; i < book.books.size(); i++){
                if(book.bookNumbers.contains(i+1)){
                    System.out.println(book.books.get(i) + " - " + "대여 중");
                    continue;
                }
                System.out.println(book.books.get(i) + " - " + "대여 가능");
            }*/
            book.getCurrentState();
            Scanner input = new Scanner(System.in);
            book.bookNumber = input.nextInt();
            System.out.println(book.getAvailableMessage(book.bookNumber));
            //System.out.println(getAvailableMessage(book.bookNumber));
            book.bookNumbers.add(book.bookNumber);
        }
    }
    /*public static boolean isAvailable(int bookNumber){
        Book book = new Book();
        return !book.bookNumbers.contains(bookNumber);
    }*/
    /*public static String getAvailableMessage(int bookNumber){
        if(isAvailable(bookNumber)){
            return "정상적으로 대여가 완료되었습니다.";
        }
        return "대여 중인 책은 대여할 수 없습니다.";
    }*/

}