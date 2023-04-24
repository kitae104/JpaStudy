package inhatc.jap.jpastudy.info.entity;

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
public class PointInfo {

    @Id
    @Column(length = 4)
    private String year;            // 연도

    @Id
    private int ranks;               // 순위

    @Column(length = 7)
    private String customerCode;    // 고객 코드

    private int point;              // 포인트

    @Column(length = 8)
    private String lastPointDate;   // 최종 포인트 적립일
}
