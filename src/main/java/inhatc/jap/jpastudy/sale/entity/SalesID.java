package inhatc.jap.jpastudy.sale.entity;

import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
public class SalesID implements Serializable {

    private String salesDate;       // 등록일

    private int seqNo;              // 일련 번호
}
