package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class UserDTO {
    private Long user_id;
    private String user_loginId;
    private String user_name;
    private String user_pwd;
    private String user_phone;
    private String user_email;
    private int age;
}
