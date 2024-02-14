package access;

public class Speaker {
    private int volume; // private를 사용함으로써 외부에서 필드에 접근할 수 없게된다

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가 합니다.");
        }
    }

    void volumeDown(){
        volume -=10;
        System.out.println("음량을 10 감소 합니다.");
    }

    void showVolume(){
        System.out.println("현재 음량:"+volume);
    }
}
