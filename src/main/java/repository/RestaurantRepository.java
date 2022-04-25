package repository;

import model.Meal;
import model.Restaurant;

import java.util.List;

public interface RestaurantRepository {
    // null if updated meal does not belong to userId
    Restaurant save(Restaurant restaurant);

    // false if meal does not belong to userId
    boolean delete(int id);

    // null if meal does not belong to userId
    Restaurant get(int id);

    // ORDERED dateTime desc
    List<Restaurant> getAll();
}
