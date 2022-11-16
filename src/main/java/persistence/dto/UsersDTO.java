package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class UsersDTO {
    private Long user_id;
    private String user_loginId;
    private String user_name;
    private String user_pwd;
    private Long user_phone;
    private String user_email;
    private int age;
}
