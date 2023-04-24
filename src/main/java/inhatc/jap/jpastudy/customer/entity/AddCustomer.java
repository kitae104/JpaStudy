package inhatc.jap.jpastudy.customer.entity;

import inhatc.jap.jpastudy.utils.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class AddCustomer {

    @Id
    @Column(length = 7)
    private String customerCode;    // 고객코드

    @Column(nullable = false, length = 10)
    private String customerName;    // 고객명

    @Column(nullable = false, length = 1)
    private String flag;              //성별구분

    @Column(nullable = false, length = 8)
    private String birthDay;        // 생일

    @Column(length = 16)
    private String phoneNumber;     // 전화번호
}
