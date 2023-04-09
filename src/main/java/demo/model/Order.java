package demo.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Order {

    private Integer id;
    private Date date;
    private double cost;
    private List<Product> products;

    public Order() {
        this.date = new Date();
        this.products = new ArrayList<>();
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
