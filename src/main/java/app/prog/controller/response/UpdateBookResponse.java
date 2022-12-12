package app.prog.controller.response;

import app.prog.model.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class UpdateBookResponse {
    private int id;
    private Author author;
    private String title;
}
