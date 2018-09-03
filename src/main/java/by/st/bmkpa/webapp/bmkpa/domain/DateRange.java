package by.st.bmkpa.webapp.bmkpa.domain;

import java.time.LocalDate;

public class DateRange {
    public LocalDate startDate;
    public LocalDate endDate;

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
