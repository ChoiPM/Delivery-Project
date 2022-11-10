package persistence.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString

public class LikesDTO {
    private int likesID;
    private LocalDateTime createdDate;
    private LocalDateTime modifyDate;
    private String status;
    private int storeID;
    private int userID;
}
