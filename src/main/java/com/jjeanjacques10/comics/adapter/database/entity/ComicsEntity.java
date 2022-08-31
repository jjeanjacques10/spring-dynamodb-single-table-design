package com.jjeanjacques10.comics.adapter.database.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.*;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

@Data
@Builder
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class ComicsEntity {

    public static String TABLE_NAME = "tb_comics";
    public static String INDEX = "comics_index";

    @Getter(onMethod_ = {@DynamoDbPartitionKey, @DynamoDbAttribute("PK")})
    public String pk;

    @Getter(onMethod_ = {@DynamoDbSortKey, @DynamoDbAttribute("SK")})
    public String sk;

    @Getter(onMethod_ = {@DynamoDbAttribute("nickname")})
    private String nickName;

    @Getter(onMethod_ = {@DynamoDbAttribute("comic_id")})
    private String comicId;

    @Getter(onMethod_ = {@DynamoDbAttribute("title")})
    private String title;

    @Getter(onMethod_ = {@DynamoDbAttribute("description")})
    private String description;
}
