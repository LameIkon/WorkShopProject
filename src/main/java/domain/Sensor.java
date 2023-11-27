package domain;

import java.util.UUID;

public class Sensor extends Unit{

    private double value;

    public Sensor(String name, UUID id, double value){
        super(name,id);
        this.value = value;
    }
}
