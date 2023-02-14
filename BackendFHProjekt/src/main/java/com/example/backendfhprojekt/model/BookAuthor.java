package com.example.backendfhprojekt.model;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class BookAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookAuthorId;
    private String authorFirstName;
    private String authorLastName;


}
