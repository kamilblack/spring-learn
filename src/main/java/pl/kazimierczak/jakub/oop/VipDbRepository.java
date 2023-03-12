package pl.kazimierczak.jakub.oop;

import java.util.logging.Logger;

public class VipDbRepository extends DbRepository {

    private static final Logger LOGGER = Logger.getLogger(VipDbRepository.class.getName());

    @Override
    public void dashboard() {
        LOGGER.info("VipDbRepository.class; dashboard()");

    }

}
