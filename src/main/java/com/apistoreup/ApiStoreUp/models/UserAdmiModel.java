package com.apistoreup.ApiStoreUp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users_admi")
public class UserAdmiModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Getter @Setter @Column(name = "id")
    private Long id;
    @Getter @Setter @Column(name = "name")
    private String name;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "password")
    private String password;

    public UserAdmiModel() {
    }

    public UserAdmiModel(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
