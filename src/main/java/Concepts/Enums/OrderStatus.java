package Concepts.Enums;

public enum OrderStatus {
    SELL("sell",1),
    BUY("buy",2),
    PENDING("pending",3),
    REJECTED("rejected",4);

    private int orderStatus;
    private String name;

    OrderStatus(String name, int id) {
        this.name = name;
        this.orderStatus = id;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
