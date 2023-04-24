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
public class Grade {

    @Id
    @Column(name = "customer_code", length = 1)
    private String classCode;    // 반코드

    @Column(precision = 10, scale = 0, columnDefinition = "NUMBER(2)")
    private double studentNo;       // 학생 번호

    @Column(nullable = false, length = 10)
    private String studentName;    // 학생명

    @Column(precision = 10, scale = 0, columnDefinition = "NUMBER(3)")
    private double kor;       // 국어

    @Column(precision = 10, scale = 0, columnDefinition = "NUMBER(3)")
    private double eng;       // 국어

    @Column(precision = 10, scale = 0, columnDefinition = "NUMBER(3)")
    private double math;       // 국어

    @Column(precision = 10, scale = 0, columnDefinition = "NUMBER(3)")
    private double tot;       // 국어

    @Column(precision = 10, scale = 0, columnDefinition = "NUMBER(5, 1)")
    private double avg;       // 국어
}
