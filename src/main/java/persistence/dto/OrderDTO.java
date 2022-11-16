package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//이걸 쓰나 마나... 흐음 안 쓸 것 같기도
@Getter
@Setter
@ToString

public class OrderDTO {
    private Long order_id;
    private Long order_totalPrice;
    private int order_delivery;
    private Long order_menuId;
    private Long order_optionId1;
    private Long order_optionId2;
    private Long order_userId;
    private Long order_storeId;
}
