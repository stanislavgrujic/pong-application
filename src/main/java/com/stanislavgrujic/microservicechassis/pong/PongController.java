package com.stanislavgrujic.microservicechassis.pong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PongController {

  @GetMapping("/pong")
  public ResponseEntity<String> pong() {
    log.info("pong");
    return ResponseEntity.ok("pong");
  }
}
