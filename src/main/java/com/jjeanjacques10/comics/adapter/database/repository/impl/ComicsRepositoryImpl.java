package com.jjeanjacques10.comics.adapter.database.repository.impl;

import com.jjeanjacques10.comics.adapter.database.entity.ComicsEntity;
import com.jjeanjacques10.comics.adapter.database.repository.ComicsRepository;
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
public class ComicsRepositoryImpl implements ComicsRepository {

    @Autowired
    private DynamoDbEnhancedClient client;

    private DynamoDbTable<ComicsEntity> table;

    @PostConstruct
    public void init() {
        table = client.table(ComicsEntity.TABLE_NAME, TableSchema.fromBean(ComicsEntity.class));
    }

    @Override
    public List<ComicsEntity> getAllComics() {
        var key = Key.builder().partitionValue("COMIC").build();
        return table.index(ComicsEntity.INDEX_COMICS).query(QueryConditional.keyEqualTo(key))
                .stream().findFirst().orElseThrow().items();
    }

    @Override
    public List<ComicsEntity> getComics(String nickName) {
        var key = Key.builder().partitionValue("CHARACTER#" + nickName).sortValue("COMIC#").build();
        return table.query(QueryConditional.sortBeginsWith(key)).items().stream().toList();
    }

}
