package app.prog.controller.mapper;

import app.prog.controller.response.AuthorResponse;
import app.prog.controller.response.CreateAuthorResponse;
import app.prog.controller.response.UpdateAuthorResponse;
import app.prog.model.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorRestMapper {

  public AuthorResponse toRest(Author domain) {
   return AuthorResponse
       .builder()
       .id(domain.getAuthorId())
       .name(domain.getName())
       .particularity(domain.getParticularity())
       .hasParticularity(domain.hasParticularity())
       .build();
  }

  public Author toDomain(CreateAuthorResponse rest) {
    return Author
        .builder()
        .name(rest.getName())
        .particularity(rest.getParticularity())
        .build();
  }

  public Author toDomain(UpdateAuthorResponse rest) {
    return Author
        .builder()
        .authorId(rest.getId())
        .name(rest.getName())
        .particularity(rest.getParticularity())
        .build();
  }
}
