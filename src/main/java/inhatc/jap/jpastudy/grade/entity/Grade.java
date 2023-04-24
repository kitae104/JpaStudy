package inhatc.jap.jpastudy.grade.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
@IdClass(GradeID.class)
public class Grade {

    @Id
    @Column(length = 1)
    private String classCode;   // 반코드

    @Id
    private int studentNo;      // 학생 번호

    @Column(nullable = false, length = 10)
    private String studentName; // 학생명

    private int kor;            // 국어

    private int eng;            // 영어

    private int math;           // 수학

    private int tot;            // 총점

    private double avg;         // 평균
}
