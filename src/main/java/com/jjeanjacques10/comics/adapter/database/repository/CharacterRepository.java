package com.jjeanjacques10.comics.adapter.database.repository;

import com.jjeanjacques10.comics.adapter.database.entity.CharacterEntity;

import java.util.List;

public interface CharacterRepository {
    CharacterEntity getProfile(String tweetId);

    List<CharacterEntity> findAll();
}
