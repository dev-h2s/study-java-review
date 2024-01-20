package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
//        ProductOrder[]orders = new ProductOrder[3];
        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 3;

        ProductOrder [] productOrders ={product1,product2,product3};
        int totalAmount = 0;
    for(ProductOrder product : productOrders){
        System.out.println("상품명:"+ product.productName+", 가격:"+product.price+", 수량:"+product.quantity);
        totalAmount +=product.price*product.quantity;
    }
        System.out.println("총 결제 금액:"+totalAmount);
    }
}
