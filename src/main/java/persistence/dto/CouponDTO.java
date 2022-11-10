package persistence.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString

public class CouponDTO {
    private int coupon;
    private String name;
    private String content;
    private int deductedPrice;
    private int minDeliveryPrice;
    private LocalDateTime createdDate;
    private LocalDateTime expiredDate;
    private LocalDateTime modifyDate;
    private String status;
    private int userId;

}
