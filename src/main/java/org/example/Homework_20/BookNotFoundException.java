package Homework_20;

public class BookNotFoundException extends Exception{

    private final String message;

    public BookNotFoundException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
