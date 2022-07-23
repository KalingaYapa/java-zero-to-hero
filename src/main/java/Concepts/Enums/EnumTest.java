package Concepts.Enums;

public class EnumTest {
    public static void main(String args[]) {
        OrderStatus status = OrderStatus.BUY;
        switch (status) {
            case PENDING:
                System.out.println(status.getOrderStatus());
                break;
            case BUY:
                System.out.println(status.getName());
                break;
            default:
                break;
        }
    }
}
