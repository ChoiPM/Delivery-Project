package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class MenuDTO {
    private Long menu_id;
    private String menu_name;
    private String menu_category;
    private Long menu_price;
    private int menu_stock;
    private Long menu_storeId;
    private Long menu_optionId;
}