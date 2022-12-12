package app.prog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "author")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int authorId;
  private String name;
  private String particularity;
  private LocalDate birthdate;
  public boolean hasParticularity() {
    return particularity != null;
  }
}
