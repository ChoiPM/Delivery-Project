package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class OrderDTO {
    private int orderId;
    private int totalPrice;
    private int menuId;
    private int menuOptionId;
    private int storeId;
    private int userId;
}
