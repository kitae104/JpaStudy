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
