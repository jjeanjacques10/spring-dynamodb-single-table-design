package com.jjeanjacques10.comics.adapter.database.repository;

import com.jjeanjacques10.comics.adapter.database.entity.ComicsEntity;

import java.util.List;

public interface ComicsRepository {

    List<ComicsEntity> getAllComics();

    List<ComicsEntity> getComics(String nickName);

}
