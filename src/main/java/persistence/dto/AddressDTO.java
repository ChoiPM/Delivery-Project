package persistence.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString

public class AddressDTO {
    private int adressID;
    private String adress;
    private LocalDateTime createdDate;
    private LocalDateTime modifyDate;
    private String status;
    private int userID;
}
