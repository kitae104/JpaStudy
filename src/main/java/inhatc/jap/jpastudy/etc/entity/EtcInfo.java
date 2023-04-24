package inhatc.jap.jpastudy.etc.entity;

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
public class EtcInfo {

    @Id
    @Column(name = "customer_code", length = 7)
    private String customerCode;    // 고객코드

    @Column(length = 20)
    private String customerEnglishName;    // 영문 고객명

    @Column(length = 40)
    private String itemList;
}
