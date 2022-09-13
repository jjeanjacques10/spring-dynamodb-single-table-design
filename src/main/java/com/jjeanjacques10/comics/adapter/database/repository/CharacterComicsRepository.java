package com.jjeanjacques10.comics.adapter.database.repository;

import com.jjeanjacques10.comics.adapter.database.entity.CharacterComicsEntity;

import java.util.List;

public interface CharacterComicsRepository {
    List<CharacterComicsEntity> getComicsProfile(String nickname);
}
