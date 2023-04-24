package inhatc.jap.jpastudy.info.repository;

import inhatc.jap.jpastudy.info.entity.ClassInfo;
import inhatc.jap.jpastudy.info.entity.ClassInfoID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassInfoRepository extends JpaRepository<ClassInfo, ClassInfoID> {
}
