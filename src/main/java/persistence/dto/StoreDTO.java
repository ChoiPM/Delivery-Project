package persistence.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString

public class StoreDTO {
    private int id;
    private String name;
    private int type; //이거 머임?
    private String category;
    private String address;
    private String picture;
    private String phoneNum;
    private int minDeliveryPrice;
    private int deliveryTip;
    private int deliveryTime;
    private int rating; //2진수, ??
    private int likeCnt;
    private int reviewCnt;
    private String operationHour;
    private String closedDay;
    private String deliveryRange;
    private LocalDateTime createdDate;
    private LocalDateTime modifyDate;
    private String status;
}
