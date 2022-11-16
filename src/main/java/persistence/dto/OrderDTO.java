package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class OrderDTO {
    private Long orderOption_id;
    private Long orderOption_optionId;
    private Long orderOption_storeId;
    private Long orderOption_orderMenuId;

    private Long orderMenu_id;
    private int orderMenu_delivery;
    private Long orderMenu_menuId;
    private Long orderMenu_storeId;
    private Long orderMenu_userId;
}
