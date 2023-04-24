package inhatc.jap.jpastudy.sale.entity;

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
public class Sales09 {

    @Id
    private int seqNo;              // 일련 번호

    @Column(length = 20)
    private String productName;     // 상품명

    @Column(length = 7)
    private String customerCode;    // 고객 코드

    private int salesCount;         // 판매 개수
}
