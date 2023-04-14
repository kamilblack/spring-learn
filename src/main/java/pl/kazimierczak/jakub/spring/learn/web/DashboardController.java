package pl.kazimierczak.jakub.spring.learn.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kazimierczak.jakub.spring.learn.service.DashboardService;
import pl.kazimierczak.jakub.spring.learn.web.model.DashboardModel;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/dashboards") //URI
public class DashboardController {//służy do przyjmowania danych od usera oraz ich weryfikacji i walidacji

    private static final Logger LOGGER = Logger.getLogger(DashboardController.class.getName());

//    @Autowired
    private DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping
    public String listView(ModelMap modelMap) {
        LOGGER.info("listView()");
        modelMap.addAttribute("elements", List.of("Dog","Cat","Lion"));
        List<DashboardModel> dashboards = dashboardService.list();
        modelMap.addAttribute("dashboards", dashboards);

        return "dashboards.html";
    }

    @GetMapping(value = "/create")
    public String createView(){
        LOGGER.info("createView()");

        return "dashboard.html";
    }

    @PostMapping // GET http://localhost:8080/dashboards/create?name=monitoring&size=99
//    public String dashboard(String name, String size) {
    public String create(DashboardModel dashboardModel) {
        LOGGER.info("create(" + dashboardModel + ")");
//        LOGGER.info("dashboard(" + size + ")");

        dashboardService.dashboard(dashboardModel);

        return "dashboard.html";
    }
}
// TODO: 03.03.2023
// Analogicznie do dashboardcontroller stworzyć nowy włąsny kontroler obsługujący żadanie get protokołu http oraz przyjmujący parametry żądania

// TODO: 14.04.2023
// https://www.baeldung.com/thymeleaf-list - wyświetlić listę dashboardów w formie tabeli
// weryfikacja cars - czy mapper jest ok