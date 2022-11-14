package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class MenuDTO {
    private int menuId;
    private String category;
    private String name;
    private int price;
    private int storeId;

}