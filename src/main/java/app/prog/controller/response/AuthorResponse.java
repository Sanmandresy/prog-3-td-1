package app.prog.controller.response;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AuthorResponse {
  private int id;
  private String name;
  private String particularity;
  private LocalDate birthdate;
  private boolean hasParticularity;
}
