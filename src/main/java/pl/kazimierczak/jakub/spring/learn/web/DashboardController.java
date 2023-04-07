package pl.kazimierczak.jakub.spring.learn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kazimierczak.jakub.spring.learn.service.DashboardService;
import pl.kazimierczak.jakub.spring.learn.web.model.DashboardModel;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/dashboard")
public class DashboardController {//służy do przyjmowania danych od usera oraz ich weryfikacji i walidacji

    private static final Logger LOGGER = Logger.getLogger(DashboardController.class.getName());

//    @Autowired
    private DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping
    public String dashboardView(){
        LOGGER.info("dashboardView()");

        return "dashboard.html";
    }

    @PostMapping // GET http://localhost:8080/dashboard?name=monitoring&size=99
//    public String dashboard(String name, String size) {
    public String dashboard(DashboardModel dashboardModel) {
        LOGGER.info("dashboard(" + dashboardModel + ")");
//        LOGGER.info("dashboard(" + size + ")");

        dashboardService.dashboard(dashboardModel);

        return "dashboard.html";
    }
}
// TODO: 03.03.2023
// Analogicznie do dashboardcontroller stworzyć nowy włąsny kontroler obsługujący żadanie get protokołu http oraz przyjmujący parametry żądania