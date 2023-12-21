package com.example.juice;

public class JuiceNotFoundException extends RuntimeException{
    public JuiceNotFoundException(String message) {
        super(message);
    }
}
