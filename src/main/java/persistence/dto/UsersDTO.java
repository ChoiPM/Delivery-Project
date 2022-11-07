package persistence.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString

public class UsersDTO {
    private Long idNum;
    private String id;
    private String password;
    private String phoneNum;
    private String email;
    private String graded;
    private String role;
    private String address;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String status;
}
