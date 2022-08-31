package com.jjeanjacques10.comics.gateway.controller;

import com.jjeanjacques10.comics.adapter.database.entity.CharacterEntity;
import com.jjeanjacques10.comics.domain.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterController {

    @Autowired
    CharacterService characterService;

    @GetMapping
    public ResponseEntity<List<CharacterEntity>> getCharacter() {
        return ResponseEntity.ok(characterService.getAllCharacters());
    }

    @GetMapping("/profile/{nickname}")
    public ResponseEntity<CharacterEntity> getCharacter(@PathVariable(name = "nickname") String nickname) {
        return ResponseEntity.ok(characterService.getProfile(nickname));
    }

}
