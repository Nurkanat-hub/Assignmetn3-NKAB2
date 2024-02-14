package Nurkanat;

public class Order {
    private String items;
    private int total;
    private String address;
    private String feedback;

    public Order(String items, int total, String address, String feedback) {
        this.items = items;
        this.total = total;
        this.address = address;
        this.feedback = feedback;
    }
    public String getItems() {
        return items;
    }

    public int getTotal() {
        return total;
    }

    public String getAddress() {
        return address;
    }

    public String getFeedback() {
        return feedback;
    }
}
