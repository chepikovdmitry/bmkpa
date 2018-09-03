package by.st.bmkpa.webapp.bmkpa.dao;

import by.st.bmkpa.webapp.bmkpa.configuration.BasicConfiguration;
import by.st.bmkpa.webapp.bmkpa.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


import java.time.LocalDate;
import java.util.List;

@Repository
public class CommonDaoImpl implements CommonDao {
    @Autowired
    BasicConfiguration basicConfiguration;

    @Override
    public DateRange getDateRange() {
            RestTemplate restTemplate = new RestTemplate();
            DateRange dateRange = restTemplate.getForObject(basicConfiguration.getUrl()+"/info", DateRange.class);
        return dateRange;
    }

    @Override
    public List<Shop> getShopList(LocalDate date) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Shop>> rateResponse =
                restTemplate.exchange(basicConfiguration.getUrl()+date.toString()+"/stores",
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Shop>>() {});
        List<Shop> shopList = rateResponse.getBody();

        return shopList;
    }

    @Override
    public List<Group> getGroupList() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Group>> rateResponse =
                restTemplate.exchange(basicConfiguration.getUrl(),
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Group>>() {});
        List<Group> groupList = rateResponse.getBody();
        return groupList;
    }

    @Override
    public List<SKU> getSKUList() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<SKU>> rateResponse =
                restTemplate.exchange(basicConfiguration.getUrl(),
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<SKU>>() {});
        List<SKU> skuList = rateResponse.getBody();
        return skuList;
    }
}
