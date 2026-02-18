package domain;

public class Car extends Transport {

    private String color;
    private String fuelType;

    public Car(String modelName, int crewCount, double maxSpeed, String color, String fuelType) {
        this.modelName=modelName;
        this.crewCount=crewCount;
        this.maxSpeed=maxSpeed;
        this.color=color;
        this.fuelType=fuelType;
    }

    public Car() {
        this("BMW",4,210.0,"white","gasoline");
    }
    public Car(String name) {
        this(name,4,210.0,"white","gasoline");
    }

    @Override
    public void move(){
        System.out.println("Car is moving...");
    }

    @Override
    public void changeSpeed(){
        System.out.println("Car has just changed a speed...");
    }

    @Override
    public void stop(){
        System.out.println("Car isn`t moving anymore...");
    }

    public void playMusic(){
        System.out.println("Yay, there is playing great song!");
    }

    @Override
    public String toString() {
        return "Car details: \n" +
               "- Model: " + modelName + "\n" +
               "- Color: " + color + "\n" +
               "- Fuel Type: " + fuelType + "\n" +
               "- Crew: " + crewCount + " persons\n" +
               "- Max Speed: " + maxSpeed + " km/h";
    }
}
