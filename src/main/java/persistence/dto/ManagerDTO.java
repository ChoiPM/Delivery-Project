package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class ManagerDTO {
    private Long manager_id;
    private String manager_loginId;
    private String manager_name;
    private String manager_pwd;
    private Long manager_phone;
    private String manager_email;
}
