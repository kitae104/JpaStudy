package inhatc.jap.jpastudy.item.entity;

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
public class ItemInfo {

    @Id
    @Column(name = "item_code", length = 7)
    private String itemCode;    // 관심 품목 코드

    @Column(nullable = false, length = 10)
    private String itemName;    // 관심 상품명
}
