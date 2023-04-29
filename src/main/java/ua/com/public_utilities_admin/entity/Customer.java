package ua.com.public_utilities_admin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;

@Data

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 14, message = "Кількість символів повинна бути більша 2, але менша 14 символів")
    @Column(name = "first_name")
    private String firstName;

    @Size(min = 2, max = 14, message = "Кількість символів повинна бути більша 2, але менша 14 символів")
    @Column(name = "last_name")
    private String lastName;

    @Email(message = "Невірний email")
    private String email;

    @Min(value = 8, message = "Мінімальна кількість символів має бути 8" )
    private int phone;

    @NotEmpty
    private String address;

    @OneToOne
    @MapKey
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;
}
