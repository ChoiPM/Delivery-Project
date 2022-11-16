package persistence.dto;

import lombok.*;

@Getter
@Setter
@ToString

public class OrderOptionDTO {
    private Long orderOption_id;
    private Long orderOption_optionId;
    private Long orderOption_storeId;
    private Long orderOption_orderMenuId;
}
