package com.jjeanjacques10.comics.adapter.database.entity;

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
public class CharacterEntity {

    public static String TABLE_NAME = "tb_comics";

    @Getter(onMethod_ = {@DynamoDbPartitionKey, @DynamoDbAttribute("PK")})
    public String pk;

    @Getter(onMethod_ = {@DynamoDbSortKey, @DynamoDbAttribute("SK")})
    public String sk;

    @Getter(onMethod_ = {@DynamoDbAttribute("nickname")})
    private String nickName;

    @Getter(onMethod_ = {@DynamoDbAttribute("real_name")})
    private String realName;

    @Getter(onMethod_ = {@DynamoDbAttribute("description")})
    private String description;

}
