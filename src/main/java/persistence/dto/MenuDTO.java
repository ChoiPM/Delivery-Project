package persistence.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString

public class MenuDTO {
    private int id;
    private String category;
    private String name;
    private int price;
    private String picture; //사진 url은 없어도 될듯
    private int popularity;
    private LocalDateTime created;
    private LocalDateTime modified;
    private String status;
    private String content;
    private int storeId;

}