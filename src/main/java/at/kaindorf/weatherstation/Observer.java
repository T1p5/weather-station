package at.kaindorf.weatherstation;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
