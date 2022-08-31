# Single Table Design + Spring Boot

Demo project for Spring Boot + DynamoDB Single Table Design

## Tecnologies

- Java 17
- Spring Boot
- DynamoDb

**Libs**

- AWS Java SDK Dynamodb
- Dynamodb Enhanced

## Table

Access **tb_comics** in [./environment/dynamodb/tables.json](./environment/dynamodb/tables.json)

<img src="./files/table.png"/>

## Request Examples

- GET - http://localhost:8080/character
- GET - http://localhost:8080/character/profile/{nickname}
- GET - http://localhost:8080/comics/{nickname}

``` bash
curl --location --request GET 'http://localhost:8080/character/profile/greenlantern'
```

---
Developed by [jjeanjacques10]()