package DesignPattern.Observer;

public class Test {
    public static void main(String[] args) {
        WeatherStationInterface weatherStation = new WsObservableImp();

        DisplayObserver phoneDisplay = new MobileDisplayObserver(weatherStation);
        DisplayObserver windowDisplay = new TVDisplayObserver(weatherStation);
        DisplayObserver anotherWindowDisplay = new TVDisplayObserver(weatherStation);

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(windowDisplay);
        weatherStation.addObserver(anotherWindowDisplay);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);

        weatherStation.removeObserver(phoneDisplay);

        weatherStation.setTemperature(20);
    }
}
