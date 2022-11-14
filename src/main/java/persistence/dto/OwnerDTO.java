package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class OwnerDTO {
    private int idNum;
    private int id;
    private String password;
    private String name;
    private String phoneNum;
}
