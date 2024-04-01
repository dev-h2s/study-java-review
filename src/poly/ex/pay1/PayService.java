package poly.ex.pay1;

public class PayService {
    // 클라이언트 변하지 않는 부분
    public void processPay(String option, int amount){
        boolean result = false;
        System.out.println("결제를 시작합니다: option =" + option+", amount"+amount);

        //결제 수단 선택
        Pay pay = PayStore.findPay(option);

        //결제
        if(pay != null){
        result = pay.pay(amount);
        }
        if(result){
            System.out.println("결제가 성공했습니다");
        }else {
            System.out.println("결제가 실패했습니다");
        }
    }


}
