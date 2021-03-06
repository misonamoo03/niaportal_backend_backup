package com.misonamoo.niaportal.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class BoardContent extends BasePaging {

    private String boardContentNo;
    private String orgBoardContentNo;
    private Long boardNo;
    private Long userNo;
    private String title;
    private String content;
    private String secYn;
    private Long viewCnt;
    private String contentGroup;
    private LocalDateTime regDate;
    private LocalDateTime updDate;
}
