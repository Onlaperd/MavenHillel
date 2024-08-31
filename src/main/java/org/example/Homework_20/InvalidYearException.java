package Homework_20;

public class InvalidYearException extends Exception{

    private final String message;

    public InvalidYearException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
