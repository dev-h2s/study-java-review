package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();
        speaker.volumeUp();

        speaker.showVolume();
        speaker.volumeUp();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200; // public이기 때문에 직접 접근이 가능해버린다 -> private로 변경으로 접근을 막을 수 있다
        speaker.showVolume();
    }
}