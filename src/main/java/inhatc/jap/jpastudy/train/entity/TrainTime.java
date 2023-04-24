package inhatc.jap.jpastudy.train.entity;

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
@IdClass(TrainTimeID.class)
public class TrainTime {

    @Id
    @Column(length = 5)
    private String trainNo;         // 열차 번호

    @Id
    private int runOrder;           // 운행 순서

    @Column(length = 20)
    private String stationName;     // 역명

    @Column(length = 6)
    private String arrivalTime;     // 도착 시간

    @Column(length = 6)
    private String departureTime;   // 출발 시간
}
