package com.jjeanjacques10.comics.domain.service.impl;

import com.jjeanjacques10.comics.adapter.database.entity.ComicsEntity;
import com.jjeanjacques10.comics.adapter.database.repository.ComicsRepository;
import com.jjeanjacques10.comics.domain.service.ComicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicsServiceImpl implements ComicsService {

    @Autowired
    private ComicsRepository comicsRepository;

    @Override
    public List<ComicsEntity> getAllComics() {
        return null;
    }

    @Override
    public List<ComicsEntity> getComics(String nickname) {
        return comicsRepository.getComics(nickname);
    }
}
