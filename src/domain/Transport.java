package domain;

public class Transport {
    protected String modelName;
    protected int crewCount;
    protected double maxSpeed;

    public Transport() {
        modelName="BMW";
        crewCount=4;
        maxSpeed=210;
    }

    public void move(){
        System.out.println("Transport is moving...");
    }
    
    public void changeSpeed(){
        System.out.println("Transport has just changed a speed...");
    }
    
    public void stop(){
        System.out.println("Transport isn`t moving anymore...");
    }

    
    @Override
    public String toString() {
        return "I have a transport, its model is "+modelName+", there are "+crewCount+" sits and its max speed is "+maxSpeed+".";
    }

 
}
