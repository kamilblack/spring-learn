package pl.kazimierczak.jakub.oop;

import java.util.logging.Logger;

public class DbService {

    private static final Logger LOGGER = Logger.getLogger(DbService.class.getName());
    protected DbRepository dbRepository;

    public DbService(DbRepository dbRepository) {
        this.dbRepository = dbRepository;
    }

    public void dashboard(){
        LOGGER.info("dashboard()");

        dbRepository.dashboard();
    }
}
