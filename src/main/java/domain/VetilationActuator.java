package domain;

import java.util.UUID;

public class VetilationActuator extends Actuator{

    public VetilationActuator(String name, UUID id, double value){

        super(name, id, value);
    }

    @Override
    public void setValue(double value) {
        super.setValue(value);
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "id: " + getId() + "value: " + getValue();
    }
}
