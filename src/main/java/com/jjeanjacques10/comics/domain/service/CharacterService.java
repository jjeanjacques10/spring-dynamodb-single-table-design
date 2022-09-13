package com.jjeanjacques10.comics.domain.service;

import com.jjeanjacques10.comics.adapter.database.entity.CharacterComicsEntity;
import com.jjeanjacques10.comics.adapter.database.entity.CharacterEntity;

import java.util.List;

public interface CharacterService {
    List<CharacterEntity> getAllCharacters();

    CharacterEntity getProfile(String nickname);

    List<CharacterComicsEntity> getComicsAndProfile(String nickname);
}
