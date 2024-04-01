package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true){
            System.out.println("결제 수단을 입력하세요");
            String payOption = scanner.nextLine();
            if(payOption.equals("exit")){
                System.out.println("프로그램 종료");
             return;
            }
            System.out.println("결제 금액을 입력하시오");
            int amount = scanner.nextInt();
            scanner.nextLine();
            payService.processPay(payOption,amount);
        }

//        //kakao 결제
//        String payOption1 = "kakao";
//        int amount1 = 5000;
//        payService.processPay(payOption1, amount1);
//
//        //네이버 결제
//        //kakao 결제
//        String payOption2 = "naver";
//        int amount2 = 10000;
//        payService.processPay(payOption2, amount2);
//
//        // 잘못된 결제 수단 선택
//        String payOption3 = "bad";
//        int amount3 = 15000;
//        payService.processPay(payOption3, amount3);
//
//        // 새로운 결제 수단 선택
//        String payOption4 = "newPay";
//        int amount4 = 12000;
//        payService.processPay(payOption4, amount4);


    }
}
