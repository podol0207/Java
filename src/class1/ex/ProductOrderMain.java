package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        int total = 0;

        ProductOrder[] productOrders = {tofu, kimchi, cola};
        for(int i=0; i<productOrders.length; i++) {
            System.out.println("상품명: " + productOrders[i].productName + ", 가격: " + productOrders[i].price + ", 수량: " + productOrders[i].quantity);
            total += productOrders[i].price * productOrders[i].quantity;
        }
        System.out.println("총 결제 금액: " + total);
    }
}
