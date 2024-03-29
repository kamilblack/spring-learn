package pl.kazimierczak.jakub.spring.learn.service.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.kazimierczak.jakub.spring.learn.repository.entity.DashboardEntity;
import pl.kazimierczak.jakub.spring.learn.web.model.DashboardModel;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Component
public class DashboardMapper {

    private static final Logger LOGGER = Logger.getLogger(DashboardMapper.class.getName());

    public DashboardEntity from(DashboardModel dashboardModel) {
        LOGGER.info("from(" + dashboardModel +")");

//        DashboardEntity dashboardEntity = new DashboardEntity();
//        dashboardEntity.setName(dashboardModel.getName());
//        dashboardEntity.setSize(dashboardModel.getSize());

        ModelMapper modelMapper = new ModelMapper();
        DashboardEntity dashboardEntity = modelMapper.map(dashboardModel, DashboardEntity.class);

        LOGGER.info("from(...) = " + dashboardEntity);

        return dashboardEntity;
    }

    public DashboardModel from(DashboardEntity dashboardEntity){
        LOGGER.info("from(" + dashboardEntity + ")");

//        DashboardModel dashboardModel = new DashboardModel();
//        dashboardModel.setName(dashboardEntity.getName());
//        dashboardModel.setSize(dashboardEntity.getSize());

        ModelMapper modelMapper = new ModelMapper();
        DashboardModel dashboardModel = modelMapper.map(dashboardEntity, DashboardModel.class);


        LOGGER.info("from(...) = " + dashboardModel);

        return dashboardModel;
    }

    public List<DashboardModel> mapList(List<DashboardEntity> dashboardEntityList) {

//        ModelMapper modelMapper = new ModelMapper();
        List<DashboardModel> mappedDashboardList = dashboardEntityList.stream()
//                .map(dashboardEntity -> modelMapper.map(dashboardEntity, DashboardModel.class))
                .map(this::from)
                .collect(Collectors.toList());

        return mappedDashboardList;
    }
}
