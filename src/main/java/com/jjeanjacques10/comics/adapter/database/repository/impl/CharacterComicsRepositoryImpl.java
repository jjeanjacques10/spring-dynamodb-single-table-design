package com.jjeanjacques10.comics.adapter.database.repository.impl;

import com.jjeanjacques10.comics.adapter.database.entity.CharacterComicsEntity;
import com.jjeanjacques10.comics.adapter.database.repository.CharacterComicsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.Key;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;
import software.amazon.awssdk.enhanced.dynamodb.model.QueryConditional;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@Repository
public class CharacterComicsRepositoryImpl implements CharacterComicsRepository {

    @Autowired
    private DynamoDbEnhancedClient client;

    private DynamoDbTable<CharacterComicsEntity> table;

    @PostConstruct
    public void init() {
        table = client.table(CharacterComicsEntity.TABLE_NAME, TableSchema.fromBean(CharacterComicsEntity.class));
    }

    @Override
    public List<CharacterComicsEntity> getComicsProfile(String nickname) {
        var key = Key.builder().partitionValue("CHARACTER#" + nickname).build();
        return table.query(QueryConditional.keyEqualTo(key)).items().stream().toList();
    }

}
