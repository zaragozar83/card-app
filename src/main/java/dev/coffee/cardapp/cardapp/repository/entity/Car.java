package dev.coffee.cardapp.cardapp.repository.entity;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.FetchType;
import java.util.Objects;
import java.util.Set;

@Entity
public class Car {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;
    private String brand;
    private String model;
    private String color;
    private String registerNumber;
    private Integer modelYear;
    private Integer price;
    @ManyToMany(mappedBy = "cars", fetch = FetchType.EAGER)
    private Set<Owner> owners;

    public Car() {
    }

    public Car(String brand, String model, String color, String registerNumber, Integer modelYear, Integer price, Set<Owner> owners) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.modelYear = modelYear;
        this.price = price;
        this.owners = owners;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cardId=" + cardId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", registerNumber='" + registerNumber + '\'' +
                ", modelYear=" + modelYear +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(cardId, car.cardId) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(registerNumber, car.registerNumber) && Objects.equals(modelYear, car.modelYear) && Objects.equals(price, car.price) && Objects.equals(owners, car.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, brand, model, color, registerNumber, modelYear, price, owners);
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Set<Owner> getOwners() {
        return owners;
    }

    public void setOwners(Set<Owner> owners) {
        this.owners = owners;
    }
}
