package com.jjeanjacques10.comics.gateway.controller;

import com.jjeanjacques10.comics.adapter.database.entity.ComicsEntity;
import com.jjeanjacques10.comics.domain.service.ComicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comics")
public class ComicsController {

    @Autowired
    ComicsService comicsService;

    @GetMapping
    public ResponseEntity<List<ComicsEntity>> getComics() {
        return ResponseEntity.ok(comicsService.getAllComics());
    }

    @GetMapping("/{nickname}")
    public ResponseEntity<List<ComicsEntity>> getComicsByNickName(@PathVariable String nickname) {
        return ResponseEntity.ok(comicsService.getComics(nickname));
    }

}
