package com.example.demo.exceptions;

public class DemoApplicationException extends RuntimeException{
    public DemoApplicationException(String exMessage){
        super(exMessage);
    }
}
