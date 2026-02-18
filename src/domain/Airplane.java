package domain;

public class Airplane extends Transport {

    private double Wingspan;
    private double maxAtlitude;
    private int payloadCopacity;

    public Airplane(String modelName, int crewCount, double maxSpeed, double Wingsplan, double maxAtlitude, int payloadCopacity) {
        this.modelName=modelName;
        this.crewCount=crewCount;
        this.maxSpeed=maxSpeed;
        this.Wingspan=Wingspan;
        this.maxAtlitude=maxAtlitude;
        this.payloadCopacity=payloadCopacity;
        ;
    }

    public Airplane() {
        this("Boeing 747", 2, 900.0, 68.4, 13000.0, 180000);
    }
    public Airplane(String name) {
        this(name, 2, 900.0, 68.4, 13000.0, 180000);
    }

    @Override
    public void move(){
        System.out.println("Airplane is moving...");
    }

    @Override
    public void changeSpeed(){
        System.out.println("Airplane has just changed a speed...");
    }

    @Override
    public void stop(){
        System.out.println("Airplane isn`t moving anymore...");
    }

    public void deployChassis(){
        System.out.println("Chassis were deployed...");
    }

    public void broadcastMessage(String Message){
        System.out.println("\n\nАХТУНГ АХТУНГ ПОВІДПОМЛЕННЯ ВІД ПІЛОТА!!!");
        System.out.println(Message);
    }

    @Override
    public String toString() {
        return "Airplane details: \n" +
                   "- Model: " + modelName + "\n" +
                   "- Crew: " + crewCount + " persons\n" +
                   "- Max Speed: " + maxSpeed + " km/h\n" +
                   "- Wingspan: " + Wingspan + " m\n" +
                   "- Max Altitude: " + maxAtlitude + " m\n" +
                   "- Payload Capacity: " + payloadCopacity + " kg";
    }
}
