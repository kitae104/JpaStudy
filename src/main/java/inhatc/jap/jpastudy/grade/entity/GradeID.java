package inhatc.jap.jpastudy.grade.entity;

import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
public class GradeID implements Serializable {
    private String classCode;   // 반코드
    private int studentNo;      // 학생 번호
}
