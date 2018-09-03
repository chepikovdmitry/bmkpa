package by.st.bmkpa.webapp.bmkpa.service;

import by.st.bmkpa.webapp.bmkpa.domain.DateRange;
import by.st.bmkpa.webapp.bmkpa.domain.Group;
import by.st.bmkpa.webapp.bmkpa.domain.SKU;
import by.st.bmkpa.webapp.bmkpa.domain.Shop;

import java.time.LocalDate;
import java.util.List;

public interface CommonService {
     DateRange getDateRange();
     List<Shop> getShopList(LocalDate date);
     List<Group> getGroupList();
     List<SKU> getSKUList();
}
