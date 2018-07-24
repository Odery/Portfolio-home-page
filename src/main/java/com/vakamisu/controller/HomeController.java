package com.vakamisu.controller;

import com.vakamisu.service.ReportService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

@Controller
@Scope("session")
public class HomeController {

    @PostConstruct
    //FIXME: to @Autowired
    public void initialize(ReportService service, HttpServletRequest request) {
        if (!service.isRunning()) {
            service.runDailyReport();
        }
        service.persistUser(request);
    }

    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }
}
