package br.com.edu.java.eks.helloworld.api.v1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloWorldController {

  @GetMapping
  public ResponseEntity<String> index() {
    return ResponseEntity.ok("Hello World");
  }

}