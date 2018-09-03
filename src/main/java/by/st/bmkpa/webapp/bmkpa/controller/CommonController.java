package by.st.bmkpa.webapp.bmkpa.controller;

import by.st.bmkpa.webapp.bmkpa.domain.DateRange;
import by.st.bmkpa.webapp.bmkpa.domain.Group;
import by.st.bmkpa.webapp.bmkpa.domain.SKU;
import by.st.bmkpa.webapp.bmkpa.domain.Shop;
import by.st.bmkpa.webapp.bmkpa.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class CommonController {
    @Autowired
    CommonService commonService;

    @GetMapping("/getDateRange")
    public DateRange getDateRange() {
        return commonService.getDateRange();
    }

    @GetMapping("/getShopList")
    public List<Shop> getShopList(@DateTimeFormat(iso= DateTimeFormat.ISO.DATE)@RequestParam("date") LocalDate date) {
        System.out.println("date="+date);
        return commonService.getShopList(date);
    }

    @GetMapping("/getGroupList")
    public List<Group> getGroupList() {
        return commonService.getGroupList();
    }
    @GetMapping("/getSKUList")
    public List<SKU> getSKUList() {
        return commonService.getSKUList();
    }
}
