package inhatc.jap.jpastudy.grade.entity;

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
public class Grade2020 {

    @Id
    @Column(length = 2)
    private String testMonth;   // 월

    private String testCode;    // 시험 코드

    private int kor;            // 국어

    private int eng;            // 영어

    private int math;           // 수학
}
