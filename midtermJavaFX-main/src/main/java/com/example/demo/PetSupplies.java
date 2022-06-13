package com.example.demo;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class PetSupplies {
    private final StringProperty id;
    private final StringProperty supplies;


    public PetSupplies()
    {
        id = new SimpleStringProperty(this, "id");

        supplies = new SimpleStringProperty(this, "supplies");


    }

    public StringProperty idProperty() { return id; }
    public String getId() { return id.get(); }
    public void setId(String newId) { id.set(newId); }


    public StringProperty suppliesProperty() { return supplies; }
    public String getSupplies() { return supplies.get(); }
    public void setSupplies(String newSupplies) { supplies.set(newSupplies); }



}
