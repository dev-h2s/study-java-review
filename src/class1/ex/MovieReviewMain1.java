package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.review = "인생은 무한 루프";
        inception.title = "인셉션";

        MovieReview aboutTime = new MovieReview();
        aboutTime.review = "인생은 무한 루프";
        aboutTime.title = "인셉션";

        System.out.println("영화 제목:"+inception.title+",리뷰:"+ inception.review);
        System.out.println("영화 제목:"+aboutTime.title+",리뷰:"+ aboutTime.review);

    }
}
