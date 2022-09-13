package com.jjeanjacques10.comics.adapter.database.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.*;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.*;

@Data
@Builder
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class ComicsEntity {

    public static final String TABLE_NAME = "tb_comics";
    public static final String INDEX_COMICS = "comics_index";

    @Getter(onMethod_ = {@DynamoDbPartitionKey, @DynamoDbAttribute("PK")})
    public String pk;

    @Getter(onMethod_ = {@DynamoDbSortKey, @DynamoDbAttribute("SK"), @DynamoDBIndexRangeKey})
    public String sk;

    @Getter(onMethod_ = {@DynamoDbAttribute("type"), @DynamoDbSecondaryPartitionKey(indexNames = {INDEX_COMICS})})
    private String type;

    @Getter(onMethod_ = {@DynamoDbAttribute("nickname")})
    private String nickName;

    @Getter(onMethod_ = {@DynamoDbAttribute("comic_id")})
    private String comicId;

    @Getter(onMethod_ = {@DynamoDbAttribute("title")})
    private String title;

    @Getter(onMethod_ = {@DynamoDbAttribute("description")})
    private String description;
}
