package inhatc.jap.jpastudy.point.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
@IdClass(PointID.class)
public class Point {

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
