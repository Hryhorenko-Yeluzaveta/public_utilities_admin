package ua.com.public_utilities_admin.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "roleSet")
    private Set<User> userSet;
}