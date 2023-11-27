package domain;

import java.util.UUID;

public class TemperatrueSensor extends Sensor{

    public TemperatrueSensor(String name, UUID id, double value)
    {
        super(name, id, value);
    }

    @Override
    public double getValue(){
        return super.getValue();
    }

    @Override
    public String toString()
    {
        return "Name: " + getName() + "\n id: " + getId() + "\n value: " + getValue();

    }
}
