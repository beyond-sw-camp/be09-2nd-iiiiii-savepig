package com.iiiiii.accountbook.accbook.command.domain.aggregate.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CreateAccCommentDTO {
    private String createdAt;
    private String detail;
    private Integer parentCode;
    private Integer memberCode;
}
