package inhatc.jap.jpastudy.grade.repository;

import inhatc.jap.jpastudy.grade.entity.Grade;
import inhatc.jap.jpastudy.grade.entity.GradeID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, GradeID> {
}
