package persistence.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString

public class ReviewDTO {
    private int reviewId;
    private int rating;
    private String content;
    private String picture;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private String status;
    private int menuId;
    private int storeId;
    private int userId;
}
