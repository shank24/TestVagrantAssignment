package com.weather.testvagrant.phase3.exception;

/**
 * This class is for creating user defined custom Exception.
 */
public class MatcherException extends Exception {

    private String message;

    public MatcherException(String message){
        this.message=message;
    }

    @Override
    public String
    getMessage() {
        return message;
    }
}
