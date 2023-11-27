package domain;

import java.util.UUID;

public class Actuator extends Unit{

    private double value;

    public Actuator(String name, UUID id, double value){
        super(name, id);
        this.value = value;

    }

    public double getValue (){return value;}

    public void setValue(double value){
        this.value = value;
    }
}
