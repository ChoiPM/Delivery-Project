package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class ReviewDTO {
    private int reviewId;
    private int rating;
    private String content;
    private int menuId;
    private int storeId;
    private int userId;
}
