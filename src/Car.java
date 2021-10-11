public class Car {
    private String model;
    private int year;
    private int bhp;
    private String color;
    private int door;

    // Attributes i konstruktorn för att kunna ange model,year..

    public Car(String model, int year, int bhp, String color, int door) {
        this.model = model;
        this.year = year;
        this.bhp = bhp;
        this.color = color;
        this.door = door;
    }


    // get metoder för model,year,bhp,color,doors

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getBhp() {
        return bhp;
    }

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }







}
