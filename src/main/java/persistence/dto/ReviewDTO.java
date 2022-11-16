package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class ReviewDTO {
    private Long review_id;
    private int review_rating;
    private String review_contents;
    private Long review_userId;
    private Long review_storeId;
    private Long review_orderOptionId;
    private Long review_orderMenuId;
}
