package pl.javastart.task.model;

public class Room {
    private double area;
    private double temperature;
    private boolean hasAirConditioner;
    private double minTemperature;

    public Room(double area, double temperature, boolean hasAirConditioner, double minTemperature) {
        this.area = area;
        this.temperature = temperature;
        this.hasAirConditioner = hasAirConditioner;
        this.minTemperature = minTemperature;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    public void setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public boolean lowerTemperature() {
        if (hasAirConditioner && temperature > minTemperature) {
            if (temperature >= minTemperature + 1) {
                temperature--;
            } else if (temperature < minTemperature + 1) {
                temperature = minTemperature;
            }
            return true;
        }
        return false;
    }

    public String info() {
        return "Pokój " + area + " m2, temperatura aktualna: " + temperature + " st.C., temperatura graniczna: "
                + minTemperature + "st.C.";
    }
}
