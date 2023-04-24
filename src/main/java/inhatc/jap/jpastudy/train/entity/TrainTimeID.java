package inhatc.jap.jpastudy.train.entity;

import jakarta.persistence.Id;

import java.io.Serializable;

public class TrainTimeID implements Serializable {

    private String trainNo;         // 열차 번호

    private int runOrder;           // 운행 순서
}
