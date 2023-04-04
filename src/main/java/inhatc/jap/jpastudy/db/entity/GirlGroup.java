package inhatc.jap.jpastudy.db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@ToString
@Builder
public class GirlGroup {

    @Id
    @Column(name = "girl_group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 32)
    private String name;

    @Column(nullable = false)
    private LocalDate debut;

    private Integer hitSongId ;
}
