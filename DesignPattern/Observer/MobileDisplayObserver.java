package DesignPattern.Observer;

public class MobileDisplayObserver implements DisplayObserver{
    private WeatherStationInterface weatherStation;

    public MobileDisplayObserver(WeatherStationInterface weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Mobile Display: Temperature updated to " + weatherStation.getTemperature() + "°C");
    }
}
