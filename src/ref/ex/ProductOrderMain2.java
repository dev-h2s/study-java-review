package ref.ex;

import ref.ex.ProductOrder;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[]orders = new ProductOrder[3];
        orders[0] = createOrcer("두부",2000,2);
        orders[1] = createOrcer("김치",1500,1);
        orders[2]= createOrcer("콜라",3500,3);

//        product1.productName = "두부";
//        product1.price = 2000;
//        product1.quantity = 2;

//        ProductOrder product2 = new ProductOrder();
//        product2.productName = "김치";
//        product2.price = 5000;
//        product2.quantity = 1;
//
//        ProductOrder product3 = new ProductOrder();
//        product3.productName = "콜라";
//        product3.price = 1500;
//        product3.quantity = 3;

//        ProductOrder [] productOrders ={product1,product2,product3};
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
