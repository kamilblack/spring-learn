package pl.kazimierczak.jakub.spring.learn.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import pl.kazimierczak.jakub.spring.learn.api.exception.DashboardException;

import java.util.logging.Logger;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = Logger.getLogger(GlobalExceptionHandler.class.getName());

    //    @ExceptionHandler(value = Exception.class)
    public void handle(Exception exception) {
        LOGGER.info("handle(" + exception + ")");

    }

    @ExceptionHandler(value = DashboardException.class)
    public ModelAndView handleWithView(Exception exception) {
        LOGGER.info("handleWithView(" + exception + ")");

        ModelAndView modelAndView = new ModelAndView("custom-error");

        LOGGER.info("handleWithView(...) " + modelAndView);

        return modelAndView;
    }

}
// https://spring.io/blog/2013/11/01/exception-handling-in-spring-mvc - wszystkie sposoby globalnej obsługi wyjątków