package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class OwnerDTO {
    private Long owner_id;
    private String owner_loginId;
    private String owner_name;
    private String owner_pwd;
    private String owner_phone;
    private String owner_email;
}
