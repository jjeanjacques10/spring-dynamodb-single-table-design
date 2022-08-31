package com.jjeanjacques10.comics.domain.service;

import com.jjeanjacques10.comics.adapter.database.entity.CharacterEntity;
import com.jjeanjacques10.comics.adapter.database.entity.ComicsEntity;

import java.util.List;

public interface CharacterService {
    List<CharacterEntity> getAllCharacters();

    CharacterEntity getProfile(String nickname);
}
