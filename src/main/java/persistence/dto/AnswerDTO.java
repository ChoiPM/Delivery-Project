package persistence.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString

public class AnswerDTO { //이거 테이블 이름 오타낫숴
    private int answerId;
    private String answer;
    private String status;
    private int reviewId;
}
