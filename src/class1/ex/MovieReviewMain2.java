package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션" ;
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        MovieReview[] movieReviews = {inception, aboutTime};
        //영화 리뷰 정보 선언
        // 영화 리부 정보 출력

        for(MovieReview m : movieReviews){
            System.out.println("영화 제목:"+m.title+", 리뷰:"+m.review);
        }
    }
}
