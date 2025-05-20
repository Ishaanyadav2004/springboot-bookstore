package com.codewithishaan.blog.payloads;

public class ApiResponse {

    private String message;
    private boolean success;

    // ✅ Constructor with parameters
    public ApiResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    // Optional: No-args constructor (needed for serialization frameworks like Jackson)
    public ApiResponse() {
    }

    // ✅ Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
