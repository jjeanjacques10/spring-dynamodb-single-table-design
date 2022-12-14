package com.jjeanjacques10.comics.domain.service.impl;

import com.jjeanjacques10.comics.adapter.database.entity.CharacterComicsEntity;
import com.jjeanjacques10.comics.adapter.database.entity.CharacterEntity;
import com.jjeanjacques10.comics.adapter.database.repository.CharacterComicsRepository;
import com.jjeanjacques10.comics.adapter.database.repository.CharacterRepository;
import com.jjeanjacques10.comics.domain.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private CharacterComicsRepository characterComicsRepository;

    @Override
    public List<CharacterEntity> getAllCharacters() {
        return characterRepository.findAll().stream().filter(c -> c.getSk().contains("PROFILE#")).toList();
    }

    @Override
    public CharacterEntity getProfile(String nickname) {
        return characterRepository.getProfile(nickname);
    }

    @Override
    public List<CharacterComicsEntity> getComicsAndProfile(String nickname) {
        return characterComicsRepository.getComicsProfile(nickname);
    }
}
