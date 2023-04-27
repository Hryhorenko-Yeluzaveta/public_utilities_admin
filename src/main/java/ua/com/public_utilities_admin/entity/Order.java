package ua.com.public_utilities_admin.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id //PK //NN
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AI
    private Long id;
    private Date date;
    private String payment;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<RateHasOrder> ratesHasOrder;
}