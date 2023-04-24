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
public class Point {

    @Id
    @Column(name = "customer_code", length = 7)
    private String customerCode;    // 고객코드

    @Id
    @Column(precision = 10, scale = 0, columnDefinition = "NUMBER (10)")
    private double seqNo;

    @Column(length = 50)
    private String pointMemo;

    @Column(precision = 10, scale = 0, columnDefinition = "NUMBER (10)")
    private double point;

    @Column(length=14)
    private String regDate;
}
