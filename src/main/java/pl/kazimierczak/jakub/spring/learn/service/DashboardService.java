package pl.kazimierczak.jakub.spring.learn.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import pl.kazimierczak.jakub.spring.learn.api.exception.DashboardException;
import pl.kazimierczak.jakub.spring.learn.repository.DashboardRepository;
import pl.kazimierczak.jakub.spring.learn.repository.entity.DashboardEntity;
import pl.kazimierczak.jakub.spring.learn.service.mapper.DashboardMapper;
import pl.kazimierczak.jakub.spring.learn.web.model.DashboardModel;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class DashboardService {//logika biznesowa aplikacji np. czy można wykonać przelew danego dnia, czy user ma konto w systemie

    private static final Logger LOGGER = Logger.getLogger(DashboardService.class.getName());

    private final DashboardRepository dashboardRepository;
    private final DashboardMapper dashboardMapper;

    public DashboardService(DashboardRepository dashboardRepository, DashboardMapper dashboardMapper) {
        this.dashboardRepository = dashboardRepository;
        this.dashboardMapper = dashboardMapper;
    }

    public DashboardModel dashboard(DashboardModel dashboardModel) {
        LOGGER.info("dashboard(" + dashboardModel + ")");

//        DashboardEntity dashboardEntity = new DashboardEntity();
//        dashboardEntity.setName(dashboardModel.getName());
//        dashboardEntity.setSize(dashboardModel.getSize());

        DashboardEntity dashboardEntity = dashboardMapper.from(dashboardModel);
        DashboardEntity savedDashboardEntity = dashboardRepository.save(dashboardEntity);
        DashboardModel mappedDashboardModel = dashboardMapper.from(savedDashboardEntity);

        LOGGER.info("dashboard(...) = " + mappedDashboardModel);

//        return mappedDashboardModel;
        return dashboardModel;
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

    public List<DashboardModel> listAll() {
        LOGGER.info("listAll()");

        List<DashboardEntity> dashboardEntityList = dashboardRepository.findAll();
        List<DashboardModel> mappedDashboardModelList = dashboardMapper.mapList(dashboardEntityList);

        LOGGER.info("listAll(...) " + mappedDashboardModelList);

        return mappedDashboardModelList;
    }

    public DashboardModel read(Long id) throws DashboardException {
        LOGGER.info("read()");

        Optional<DashboardEntity> optionalDashboardEntity = dashboardRepository.findById(id);
        DashboardEntity dashboardEntity = optionalDashboardEntity.orElseThrow(
                () -> new DashboardException("Unable to find dashboard with id " + id));

        DashboardModel mappedDashboardModel = dashboardMapper.from(dashboardEntity);

        LOGGER.info("read(...) " + mappedDashboardModel);

        return mappedDashboardModel;
    }

    public void delete(Long id) throws Exception {
        LOGGER.info("delete(" + id + ")");
        if (id == null) throw new Exception("Delete id is null");

        dashboardRepository.deleteById(id);

        LOGGER.info("delete(...)");
    }

    public void update(DashboardModel dashboardModel) throws DashboardException {
        LOGGER.info("update(" + dashboardModel + ")");

        Optional<DashboardEntity> optionalDashboardEntity = dashboardRepository.findById(dashboardModel.getId());
        DashboardEntity dashboardEntity = optionalDashboardEntity.orElseThrow(
                () -> new DashboardException("Unable to find dashboard with id " + dashboardModel.getId()));

        dashboardEntity.setName(dashboardModel.getName());
        dashboardEntity.setSize(dashboardModel.getSize());

        dashboardRepository.save(dashboardEntity);

        LOGGER.info("update(...) " + dashboardEntity);

    }
}
// TODO: 27.03.2023
// Zaprezentować działanie Optional na przykładzie własnych klas i metod

// TODO: 03.04.2023
// Zrobić formularz dla CarController i zapisać w bazie danych - analogicznie jak dla DashboardService

// TODO: 07.04.2023
// Zrobić mapper dla Car
// Dopisać testy - mapper'a