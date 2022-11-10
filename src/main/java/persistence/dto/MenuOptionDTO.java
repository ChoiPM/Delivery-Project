package persistence.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString

public class MenuOptionDTO {
    private int menuOptionId;
    private String option;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifyDate;
    private String status;
}
