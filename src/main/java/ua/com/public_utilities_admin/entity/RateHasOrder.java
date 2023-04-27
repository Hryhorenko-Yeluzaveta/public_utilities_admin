package ua.com.public_utilities_admin.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

@Entity
@Table(name = "rate_has_order")
public class RateHasOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "rate_id")
    private Rate rate;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private int totalBill;

}