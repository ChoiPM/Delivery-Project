package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class optionDTO {
    private Long option_id;
    private String option_name;
    private Long option_price;
    private Long option_storeId;
}
