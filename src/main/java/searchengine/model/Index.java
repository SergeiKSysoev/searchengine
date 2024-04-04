package searchengine.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity
@Table(name = "index", uniqueConstraints = @UniqueConstraint(columnNames = {"page_id", "lemma_id"}))
public class Index {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT")
    private int id;
    private Page page;
    private Lemma lemma;
    private Float score;
}
