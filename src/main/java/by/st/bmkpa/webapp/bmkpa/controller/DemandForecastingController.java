package by.st.bmkpa.webapp.bmkpa.controller;

import by.st.bmkpa.webapp.bmkpa.domain.DateRange;
import by.st.bmkpa.webapp.bmkpa.domain.Group;
import by.st.bmkpa.webapp.bmkpa.domain.SKU;
import by.st.bmkpa.webapp.bmkpa.domain.Shop;
import by.st.bmkpa.webapp.bmkpa.service.CommonService;
import by.st.bmkpa.webapp.bmkpa.service.DemandForecastingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DemandForecastingController {
    @Autowired
    CommonService commonService;
    @Autowired
    DemandForecastingService demandForecastingService;


    @GetMapping("/home")
    public String home() {
        System.out.println("load home");
        return "home";
    }

    /*@GetMapping("/getGraphData")
    @ResponseBody
    public DateRange getData() {

        return demandForecastingService;
    }*/

}
