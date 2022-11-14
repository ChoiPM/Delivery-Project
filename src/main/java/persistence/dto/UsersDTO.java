package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class UsersDTO {
    private Long idNum;
    private String id;
    private String password;
    private String phoneNum;
    private String email;
}
