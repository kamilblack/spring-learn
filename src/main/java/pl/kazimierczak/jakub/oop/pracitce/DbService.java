package pl.kazimierczak.jakub.oop.pracitce;

import java.util.logging.Logger;

public class DbService {

    private static final Logger LOGGER = Logger.getLogger(DbService.class.getName());
    protected DbLayer dbLayer;

    public DbService(DbLayer dbLayer) {
        this.dbLayer = dbLayer;
    }

    public void Foo() {
        LOGGER.info("DbService.class; Foo()");

        dbLayer.Foo();
    }
}
