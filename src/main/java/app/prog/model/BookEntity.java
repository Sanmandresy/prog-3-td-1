package app.prog.model;

import jakarta.persistence.*;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "book")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @ManyToOne
    @JoinColumn(name = "author_name", referencedColumnName = "name")
    private AuthorEntity author;
    private Integer pageNumber;
    private LocalDate releaseDate;
    @ManyToMany
    private List<CategoryEntity> categories;
    public boolean hasAuthor() {
        return author != null;
    }

}
