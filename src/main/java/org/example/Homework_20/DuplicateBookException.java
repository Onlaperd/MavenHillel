package Homework_20;

public class DuplicateBookException extends Exception{

    private final String message;

    public DuplicateBookException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}