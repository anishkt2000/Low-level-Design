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

        weatherStation.setData(25);
        weatherStation.setData(30);

        weatherStation.removeObserver(phoneDisplay);

        weatherStation.setData(20);
    }
}
