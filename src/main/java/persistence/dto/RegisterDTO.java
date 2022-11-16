package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class RegisterDTO {
    private int register_id;
    private String register_contents;
    private boolean register_approved;
    private String register_reason;
    private int register_managerId;
    private int register_storeId;
}
