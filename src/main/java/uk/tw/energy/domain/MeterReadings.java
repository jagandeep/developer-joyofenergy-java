package uk.tw.energy.domain;

import java.util.List;

public class MeterReadings {

    private List<ElectricityReading> electricityReadings;
    private String smartMeterId;

    public MeterReadings() { }

    public MeterReadings(String smartMeterId, List<ElectricityReading> electricityReadings) {
        this.smartMeterId = smartMeterId;
        this.electricityReadings = electricityReadings;
    }

    public List<ElectricityReading> getElectricityReadings() {
        return electricityReadings;
    }

    public String getSmartMeterId() {
        return smartMeterId;
    }

    public boolean isValid() {
        return isSmartMeterEmpty()
                && isElectricityReadingEmpty();
    }

    private boolean isElectricityReadingEmpty() {
        return getElectricityReadings() != null && !getElectricityReadings().isEmpty();
    }

    private boolean isSmartMeterEmpty() {
        return getSmartMeterId() != null && !getSmartMeterId().isEmpty();
    }
}
