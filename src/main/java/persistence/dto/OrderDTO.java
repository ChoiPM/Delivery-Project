package persistence.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString

public class OrderDTO {
    private int orderId;
    private String payMethod;
    private int totalPrice;
    private String request;
    private LocalDateTime createdDate;
    private LocalDateTime modifyDate;
    private String status;
    private int menuId;
    private int menuOptionId;
    private int storeId;
    private int userId;
}
