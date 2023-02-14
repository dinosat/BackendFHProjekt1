package com.example.backendfhprojekt.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userPassword;
    private String userRole;


    @OneToOne(mappedBy = "user")
    private ShoppingBasket shoppingBasket;
}