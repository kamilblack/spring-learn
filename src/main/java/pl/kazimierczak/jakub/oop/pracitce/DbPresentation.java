package pl.kazimierczak.jakub.oop.pracitce;

import java.util.logging.Logger;

public class DbPresentation {

    private static final Logger LOGGER = Logger.getLogger(DbPresentation.class.getName());
    protected DbService dbService;

    public DbPresentation(DbService dbService) {
        this.dbService = dbService;
    }

    public void Foo(){
        LOGGER.info("DbPresentation.class; Foo()");

        dbService.Foo();
    }
}
