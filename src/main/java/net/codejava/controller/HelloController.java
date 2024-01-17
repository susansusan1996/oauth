package net.codejava.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        return new ResponseEntity<>("成功", HttpStatus.OK);
    }

    @GetMapping("/403")
    public ResponseEntity<String> fail() {
        return new ResponseEntity<>("登入失敗!", HttpStatus.OK);
    }
}
