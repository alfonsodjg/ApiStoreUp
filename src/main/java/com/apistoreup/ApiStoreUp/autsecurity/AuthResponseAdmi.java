package com.apistoreup.ApiStoreUp.autsecurity;

import lombok.Getter;
import lombok.Setter;

//Clase que nos responsera con un json
public class AuthResponseAdmi {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private boolean success;
    @Getter @Setter
    private String message;

    public AuthResponseAdmi() {
    }

    public AuthResponseAdmi(String name, boolean success, String message) {
        this.name = name;
        this.success = success;
        this.message = message;
    }
}
