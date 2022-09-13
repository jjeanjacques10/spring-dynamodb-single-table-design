package com.jjeanjacques10.comics.gateway.controller;

import com.jjeanjacques10.comics.adapter.database.entity.CharacterComicsEntity;
import com.jjeanjacques10.comics.domain.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterComicsController {

    @Autowired
    CharacterService characterService;

    @GetMapping("/comics/{nickname}")
    public ResponseEntity<List<CharacterComicsEntity>> getCharacterComicsProfile(@PathVariable(name = "nickname") String nickname) {
        return ResponseEntity.ok(characterService.getComicsAndProfile(nickname));
    }

}
