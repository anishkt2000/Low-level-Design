package DesignPattern.Observer;

public interface WeatherStationInterface {
    public void addObserver(DisplayObserver observer);
    public void removeObserver(DisplayObserver observer);
    public void notifyObservers();
    public void setData(int data);
    public float getData();
}
