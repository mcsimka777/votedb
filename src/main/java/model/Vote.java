package model;

import java.time.LocalDateTime;

public class Vote {
    private int userId;

    private LocalDateTime voteDate;

    private int restaurantId;

    public int getUserId() {
        return userId;
    }

    public LocalDateTime getVoteDate() {
        return voteDate;
    }

    public int getRestaurantId() {
        return restaurantId;
    }
}
