package inhatc.jap.jpastudy.train.repository;

import inhatc.jap.jpastudy.train.entity.TrainTime;
import inhatc.jap.jpastudy.train.entity.TrainTimeID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainTimeRepository extends JpaRepository<TrainTime, TrainTimeID> {
}
