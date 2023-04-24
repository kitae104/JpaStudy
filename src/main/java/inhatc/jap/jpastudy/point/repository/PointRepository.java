package inhatc.jap.jpastudy.point.repository;

import inhatc.jap.jpastudy.point.entity.Point;
import inhatc.jap.jpastudy.point.entity.PointID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<Point , PointID> {
}
