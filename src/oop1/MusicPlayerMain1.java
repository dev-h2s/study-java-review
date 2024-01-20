package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //음악플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

//        볼륨 증가
        volume++;
        System.out.println("볼륨 상태:"+volume);
//        볼륨 증가
        volume++;
        System.out.println("볼륨 상태:"+volume);

//        볼륨 감소
        volume--;
        System.out.println("볼륨 상태:"+volume);
isOn = true;
//        음악 플레이어 상태
        if(isOn) {
            System.out.println("음악 플레이 on, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 off") ;
        }
//        음악 플레이어 끄기

        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");


    }
}
