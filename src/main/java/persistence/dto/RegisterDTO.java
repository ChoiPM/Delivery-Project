package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class RegisterDTO {
    private int register_id;
    private String register_contents;
    private boolean approved;
    private String reason;
    private int register_managerId;
    private int register_storeId;
}
