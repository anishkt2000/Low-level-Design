package DesignPattern.Observer;

public class TVDisplayObserver implements DisplayObserver{
    private WeatherStationInterface weatherStation;

    public TVDisplayObserver(WeatherStationInterface weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("TV Display: Temperature updated to " + weatherStation.getTemperature() + "°C");
    }
}
