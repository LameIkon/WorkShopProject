package domain;

import java.util.UUID;

public abstract class Unit {

    private String name;
    private UUID id;

    public Unit(String name, UUID id)
    {
        this.name = name;
        this.id = id;
    }

    public String getName(){return name;}

    public UUID getId(){return id;}

    @Override
    public String toString()
    {
        return "Name: " + getName() + " \n id: " + getId() "\n";
    }

}
