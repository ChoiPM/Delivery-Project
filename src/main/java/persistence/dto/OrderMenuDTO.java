package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class OrderMenuDTO {
    private int price;
    private int menuId;
    private int menuOptionId;
}
