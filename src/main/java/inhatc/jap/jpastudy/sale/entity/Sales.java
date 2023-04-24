package inhatc.jap.jpastudy.sale.entity;

import inhatc.jap.jpastudy.grade.entity.GradeID;
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
@IdClass(SalesID.class)
public class Sales {

    @Id
    @Column(length = 8)
    private String salesDate;       // 등록일

    @Id
    private int seqNo;              // 일련 번호

    @Column(length = 20)
    private String productName;     // 상품명

    private int price;              // 단가(원)

    private int salesCount;         // 판매 개수
}
