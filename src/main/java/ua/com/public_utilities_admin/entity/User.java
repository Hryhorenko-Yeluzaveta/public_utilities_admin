package ua.com.public_utilities_admin.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roleSet;

}
