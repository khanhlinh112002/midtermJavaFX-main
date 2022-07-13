package com.example.demo;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class PetSupplies {
    private final StringProperty id;
    private final StringProperty supplies;

    private final IntegerProperty quantity;

    private final IntegerProperty price;



    public PetSupplies()
    {
        id = new SimpleStringProperty(this, "id");

        supplies = new SimpleStringProperty(this, "supplies");
        quantity = new SimpleIntegerProperty(this, "quantity");
        price = new SimpleIntegerProperty(this, "price");




    }

    public StringProperty idProperty() { return id; }
    public String getId() { return id.get(); }
    public void setId(String newId) { id.set(newId); }


    public StringProperty suppliesProperty() { return supplies; }
    public String getSupplies() { return supplies.get(); }
    public void setSupplies(String newSupplies) { supplies.set(newSupplies); }

    public IntegerProperty quantityProperty() { return quantity; }
    public Integer getQuantity() { return quantity.get(); }
    public void setQuantity(Integer newQuantity) { quantity.set(newQuantity); }

    public IntegerProperty priceProperty() { return price; }
    public Integer getPrice() { return price.get(); }
    public void setPrice(Integer newPrice) { price.set(newPrice); }


}
