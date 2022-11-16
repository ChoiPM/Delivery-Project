package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class OrderMenuDTO {
    private Long orderMenu_id;
    private int orderMenu_delivery;
    private Long orderMenu_menuId;
    private Long orderMenu_storeId;
    private Long orderMenu_userId;
}
