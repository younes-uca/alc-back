package ma.learn.quiz.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SectionItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String imageUrl;
    private String response;
    private String translation;
    private String explanation;
    private String example;
    @ElementCollection
    private List<String> synonyms;
    @ManyToOne()
    private Section section;


}
