package com.jjeanjacques10.comics.adapter.database.repository.impl;

import com.jjeanjacques10.comics.adapter.database.entity.CharacterEntity;
import com.jjeanjacques10.comics.adapter.database.repository.CharacterRepository;
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
public class CharacterRepositoryImpl implements CharacterRepository {

    @Autowired
    private DynamoDbEnhancedClient client;

    private DynamoDbTable<CharacterEntity> table;

    @PostConstruct
    public void init() {
        table = client.table(CharacterEntity.TABLE_NAME, TableSchema.fromBean(CharacterEntity.class));
    }

    @Override
    public CharacterEntity getProfile(String nickName) {
        var key = Key.builder().partitionValue("CHARACTER#" + nickName).sortValue("PROFILE#").build();
        return table.query(QueryConditional.sortBeginsWith(key)).items().iterator().next();
    }

    @Override
    public List<CharacterEntity> findAll() {
        return table.scan().items().stream().toList();
    }

}
