package inhatc.jap.jpastudy.point.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class Point2018 {

    @Id
    @Column(length = 7)
    private String customerCode;    // 고객코드

    @Id
    private Long seqNo;

    @Column(length = 50)
    private String pointMemo;

    private int point;

    @Column(length=14)
    private String regDate;
}
