package extend1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA",1000,"han","12345");
        Album album = new Album("앨범1",15000,"seo");
        Movie movie = new Movie("영희", 10000,"감독1","배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice()+ album.getPrice() + movie.getPrice();
        System.out.println("상품 거격의 합"+sum);
    }
}
