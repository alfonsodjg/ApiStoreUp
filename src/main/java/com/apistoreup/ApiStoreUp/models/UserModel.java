package com.apistoreup.ApiStoreUp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
public class UserModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") @Getter @Setter
    private Long id;
    @Column(name = "email") @Getter @Setter
    private String email;
    @Column(name = "password") @Getter @Setter
    private String password;

    public UserModel() {
        // Constructor vacío requerido por JPA
    }

    public UserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
