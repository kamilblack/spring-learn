package pl.kazimierczak.jakub.spring.learn.service;

import org.springframework.stereotype.Service;
import pl.kazimierczak.jakub.spring.learn.web.DashboardController;
import pl.kazimierczak.jakub.spring.learn.web.model.DashboardModel;

import java.util.Optional;
import java.util.logging.Logger;

@Service
public class DashboardService {//logika biznesowa aplikacji np. czy można wykonać przelew danego dnia, czy user ma konto w systemie

    private static final Logger LOGGER = Logger.getLogger(DashboardService.class.getName());

    public DashboardModel dashboard(DashboardModel dashboardModel) {
        LOGGER.info("dashboard(" + dashboardModel + ")");

        return null;
    }

    public Optional<DashboardModel> change(String name) {
        LOGGER.info("change(" + name + ")");
        if (name == null) {
            Optional<DashboardModel> empty = Optional.empty();
            return empty;
        } else {
            Optional<DashboardModel> optionalDashboardModel = Optional.of(new DashboardModel(name, "10"));
            return optionalDashboardModel;
        }

    }
}
// TODO: 27.03.2023
// Zaprezentować działanie Optional na przykładzie własnych klas i metod