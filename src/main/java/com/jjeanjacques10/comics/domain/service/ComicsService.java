package com.jjeanjacques10.comics.domain.service;

import com.jjeanjacques10.comics.adapter.database.entity.ComicsEntity;

import java.util.List;

public interface ComicsService {
    List<ComicsEntity> getAllComics();

    List<ComicsEntity> getComics(String nickname);
}
