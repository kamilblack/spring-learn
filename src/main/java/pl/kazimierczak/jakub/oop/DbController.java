package pl.kazimierczak.jakub.oop;

import pl.kazimierczak.jakub.spring.learn.web.AccountController;

import java.util.logging.Logger;

public class DbController {

    private static final Logger LOGGER = Logger.getLogger(DbController.class.getName());
    private DbService dbService;

    public DbController(DbService dbService) {
        this.dbService = dbService;
    }

    public void dashboard(){
        LOGGER.info("dashboard()");

        dbService.dashboard();
    }
}
