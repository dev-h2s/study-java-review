package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요:");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[]orders = new ProductOrder[n];
        for(int i = 0; i< orders.length-1; i++){
            System.out.println((i+1)+"번쨰 주문 정보를 입력하세요");

            System.out.println("상품 명:");
            String productName = scanner.nextLine();

            System.out.println("가격:");
            int price = scanner.nextInt();

            System.out.println("수량:");
            int quantity = scanner.nextInt();
            scanner.nextLine();//입력 버퍼 비우기 위함

            orders[i] = createOrcer(productName,price,quantity);
        }


        int totalAmount = getTotalAmount(orders);
        printOrders(orders);
        System.out.println("총 결제 금액:"+totalAmount);

    }
// 여러 상품의 주문 정보를 담는 배열 생성 메서드
//   createOder()를 여러번 사용해서 상품  주문 정보들을 생성하고 배열에 저장

    static ProductOrder createOrcer(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    //    printOrders()를 사용해서 상품 주문 정보를 출력
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명:"+ order.productName+", 가격:"+order.price+", 수량:"+order.quantity);
        }
    }

    //    getTotalAmount()를 사용해서 총 결제 금액 계산
static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for(ProductOrder order: orders){
            totalAmount+= order.price*order.quantity;
        }
        return totalAmount;
}
}
