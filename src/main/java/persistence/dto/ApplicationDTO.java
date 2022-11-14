package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class ApplicationDTO {
    private int applicationId;
    private String text;
    private int approve;
    private String reason;
    private boolean check;
    private int menuId;
    private int storeId;
}
