package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class StoreDTO {
    private int storeId;
    private String name;
    private String address;
    private String phoneNum;
    private String content;
    private int reviewCnt;
}
