package pl.kazimierczak.jakub.oop;

import java.util.logging.Logger;

public class VipDbService extends DbService {

    private static final Logger LOGGER = Logger.getLogger(VipDbService.class.getName());

    public VipDbService(DbRepository dbRepository) {
        super(dbRepository);
    }

    @Override
    public void dashboard() {
        LOGGER.info("VipDbService.class; dashboard()");

        dbRepository.dashboard();
    }
}
