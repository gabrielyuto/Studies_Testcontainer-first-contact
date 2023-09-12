package com.example.testcontainer.person;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@RedisHash("people")
public class Person {
  @Id
  private UUID id;

  private String name;

  private Integer age;

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }
}
