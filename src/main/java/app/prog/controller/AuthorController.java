package app.prog.controller;

import app.prog.controller.mapper.AuthorRestMapper;
import app.prog.controller.response.AuthorResponse;
import app.prog.controller.response.CreateAuthorResponse;
import app.prog.controller.response.UpdateAuthorResponse;
import app.prog.model.Author;
import app.prog.service.AuthorService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AuthorController {
  private final AuthorService service;
  private final AuthorRestMapper mapper;

  @GetMapping("/authors")
  public List<AuthorResponse> getAuthors() {
    return service.getAuthors()
        .stream()
        .map(mapper::toRest).toList();
  }

  @PostMapping("/authors")
  public List<AuthorResponse> createAuthors(@RequestBody List<CreateAuthorResponse> toCreate) {
    List<Author> domain = toCreate.stream()
        .map(mapper::toDomain).toList();
    return service.createAuthors(domain).stream()
        .map(mapper::toRest)
        .toList();
  }

  @PutMapping("/authors")
  public List<AuthorResponse> updateBooks(@RequestBody List<UpdateAuthorResponse> toUpdate) {
    List<Author> domain = toUpdate.stream()
        .map(mapper::toDomain)
        .toList();
    return service.updateAuthors(domain).stream()
        .map(mapper::toRest)
        .toList();
  }

  @DeleteMapping("/authors/{authorId}")
  public AuthorResponse deleteAuthor(@PathVariable Integer authorId) {
    return mapper.toRest(service.deleteAuthor(authorId));
  }
}
