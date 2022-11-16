package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class StoreDTO {
    private Long store_id;
    private String store_name;
    private String store_phone;
    private String store_address;
    private String store_contents;
    private boolean store_registered;
    private Long store_reviewCnt;
    private Long store_ownerId;
}
