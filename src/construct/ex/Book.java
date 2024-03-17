package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    //기본 생성자
    Book(){
    this("","",0);
    }

    //모든 인수를 받는 생성자
    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page =page;
    }

    //두개만 받는 생성자
    Book(String title, String author){
        this(title, author, 0);
    }

    //출력 메서드
    void displayInfo(){
        System.out.println("제목:"+title+", 저자:"+author+", 페이지:"+page);
    }
}
