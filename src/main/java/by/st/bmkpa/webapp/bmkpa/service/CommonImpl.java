package by.st.bmkpa.webapp.bmkpa.service;

import by.st.bmkpa.webapp.bmkpa.dao.CommonDao;
import by.st.bmkpa.webapp.bmkpa.domain.DateRange;
import by.st.bmkpa.webapp.bmkpa.domain.Group;
import by.st.bmkpa.webapp.bmkpa.domain.SKU;
import by.st.bmkpa.webapp.bmkpa.domain.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CommonImpl implements CommonService {
    @Autowired
    CommonDao commonDao;
    @Override
    public DateRange getDateRange() {
        return commonDao.getDateRange();
    }

    @Override
    public List<Shop> getShopList(LocalDate date) {
        return commonDao.getShopList(date);
    }

    @Override
    public List<Group> getGroupList() {
        return commonDao.getGroupList();
    }

    @Override
    public List<SKU> getSKUList() {
        return commonDao.getSKUList();
    }
}
