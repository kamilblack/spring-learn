package pl.kazimierczak.jakub.spring.learn.api.exception;

public class DashboardException extends Exception{

    public DashboardException(String message) {
        super(message);
    }

    public DashboardException(String message, Throwable cause) {
        super(message, cause);
    }
}
