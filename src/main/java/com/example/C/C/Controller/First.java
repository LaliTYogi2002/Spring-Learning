package com.example.C.C.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value = "/api/")
public class First {

    @GetMapping (path = "/fetch")
    public ResponseEntity<String> get(@RequestParam(name = "firstName") String fristName,
                      @RequestParam(name = "lastName") String lastName,
                      @RequestParam(name = "age") int age){
        System.out.println("lalit");
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        String output = "Hey " + fristName + " " + lastName + " Your age is " + age;
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }

    @GetMapping( path = "/fetchUser/{id}")
    public ResponseEntity<String> getUserById(@PathVariable(value = "id") int id){
        return ResponseEntity.status(HttpStatus.OK).body("gameover");

    }
}
