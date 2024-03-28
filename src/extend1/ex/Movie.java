package extend1.ex;

public class Movie extends Item {
String director;
String actor;

    @Override
    public void print() {
        System.out.println("-감독:"+director+"배우:"+actor);
    }

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }
}
