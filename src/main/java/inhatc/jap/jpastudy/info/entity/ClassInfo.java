package inhatc.jap.jpastudy.info.entity;

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
@IdClass(ClassInfoID.class)
public class ClassInfo {

    @Id
    @Column(length = 1)
    private String classCode;

    @Id
    @Column(length = 20)
    private String className;
}
