package com.acl.microservice.web.dto.messages.response;

public class ResponseDTO<T> {

    private String message;
    private T data;
    private boolean success;
    private int statusCode;

    // Constructeur par défaut
    public ResponseDTO() {
    }

    // Constructeur avec message, données, succès et code de statut
    public ResponseDTO(String message, T data, boolean success, int statusCode) {
        this.message = message;
        this.data = data;
        this.success = success;
        this.statusCode = statusCode;
    }

    // Getters et Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    // Méthodes utilitaires pour créer une réponse de succès ou d'erreur
    public static <T> ResponseDTO<T> success(T data) {
        return new ResponseDTO<>("Request successful", data, true, 200);
    }

    public static <T> ResponseDTO<T> failure(String message) {
        return new ResponseDTO<>(message, null, false, 400);
    }

    public static <T> ResponseDTO<T> error(String message, T data) {
        return new ResponseDTO<>(message, data, false, 500);
    }
}

