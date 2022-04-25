package model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "meals")
public class Meal extends AbstractNamedEntity {

    @Column(name = "price", nullable = false)
    private Float price;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    private LocalDateTime dateTime;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Meal(Integer id, String name, Float price, String description, Restaurant restaurant, LocalDateTime dateTime) {
        super(id, name);
        this.price = price;
        this.description = description;
        this.restaurant = restaurant;
        this.dateTime = dateTime;
    }

    public Meal(Float price, String description, Restaurant restaurant, LocalDateTime dateTime) {
        this.price = price;
        this.description = description;
        this.restaurant = restaurant;
        this.dateTime = dateTime;
    }

    public Meal(Integer id, String name) {
        super(id, name);
    }

    public Meal() {
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
