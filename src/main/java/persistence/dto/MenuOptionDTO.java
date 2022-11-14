package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class MenuOptionDTO {
    private int menuOptionId;
    private String option;
    private int price;
}
