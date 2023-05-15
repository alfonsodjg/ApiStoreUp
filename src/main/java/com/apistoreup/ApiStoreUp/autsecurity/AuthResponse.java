package com.apistoreup.ApiStoreUp.autsecurity;

//Clase que nos devuelve un json para el inicio de sesion
public class AuthResponse {
    private boolean success;
    private String message;

    public AuthResponse() {
    }

    public AuthResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
