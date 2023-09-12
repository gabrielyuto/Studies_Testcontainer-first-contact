package com.example.testcontainer.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("people")
public class PersonController {

  @Autowired
  private PersonRepository repository;

  @GetMapping
  public Iterable<Person> get() {
    return repository.findAll();
  }

  @PostMapping
  public Person post(@RequestBody Person person) {
    return repository.save(person);
  }

  @DeleteMapping("{id}")
  public void deleteById(@PathVariable UUID id) {
    repository.deleteById(id);
  }
}
