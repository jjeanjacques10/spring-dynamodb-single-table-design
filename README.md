# Single Table Design + Spring Boot

<p align="center">
    <img src="./files/logo-spring-dynamodb.png" width="500"/>
    <br />
    <br />
    <a href="https://github.com/jjeanjacques10/spring-dynamodb-single-table-design/issues">Report Bug</a>
    ·
    <a href="https://github.com/jjeanjacques10/spring-dynamodb-single-table-design/issues">Request Feature</a>
</p>

<p align="center">
   <a href="https://www.linkedin.com/in/jjean-jacques10/">
      <img alt="Jean Jacques Barros" src="https://img.shields.io/badge/-JeanJacquesBarros-6DB33F?style=flat&logo=Linkedin&logoColor=white" />
   </a>
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/jjeanjacques10/spring-dynamodb-single-table-design?color=6DB33F">

  <a href="https://github.com/jjeanjacques10/spring-dynamodb-single-table-design/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/jjeanjacques10/spring-dynamodb-single-table-design?color=6DB33F">
  </a>
  <img alt="License" src="https://img.shields.io/badge/license-MIT-s">
  <img alt="GitHub Pull Requests" src="https://img.shields.io/github/issues-pr/jjeanjacques10/spring-dynamodb-single-table-design?color=6DB33F" />
  <a href="https://github.com/jjeanjacques10/spring-dynamodb-single-table-design/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/jjeanjacques10/spring-dynamodb-single-table-design?color=6DB33F&logo=github">
  </a>
</p>

Demo project for Spring Boot + DynamoDB Single Table Design

## Tecnologies

- Java 17
- Spring Boot
- DynamoDb

**Libs**

- [AWS Java SDK Dynamodb](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/CodeSamples.Java.html)
- Dynamodb Enhanced

## Table

Access **tb_comics** in [./environment/dynamodb/tables.json](./environment/dynamodb/tables.json)

<img src="./files/table.png"/>

## Get Started

Create Table in DynamoDb simulator using Localstack.

``` bash
docker-compose up -d --build
```

- Access DynamoDb Admin: http://localhost:8001/

## Request Examples

- GET - http://localhost:8080/character
- GET - http://localhost:8080/character/profile/{nickname}
- GET - http://localhost:8080/comics
- GET - http://localhost:8080/comics/{nickname}

``` bash
curl --location --request GET 'http://localhost:8080/character/profile/greenlantern'
```

Postman Collection: [Comics.postman_collection.json](./files/Comics.postman_collection.json)

## Notes

- You can't use ``begin_with`` with PartitionKey, you can only use on the SortKey.
- Primary keys in DynamoDB can be either simple or composite.
    - Simple primary keys are consist of a partition key and no sort key.
    - Composite primary keys have both a partition key and a sort key.

## Article

- [[PT-BR] DynamoDB Single-Table Design com Spring Boot](https://jjeanjacques10.medium.com/dynamodb-single-table-design-com-spring-boot-4d4af58221b6)

## References

- [The What, Why, and When of Single-Table Design with DynamoDB](https://www.alexdebrie.com/posts/dynamodb-single-table/)
- [Amazon DynamoDB single-table design using DynamoDBMapper and Spring Boot](https://aws.amazon.com/blogs/database/amazon-dynamodb-single-table-design-using-dynamodbmapper-and-spring-boot/)
- [Single-table vs. multi-table design in Amazon DynamoDB](https://aws.amazon.com/blogs/database/single-table-vs-multi-table-design-in-amazon-dynamodb/)

---
Developed by [Jean Jacques Barros](https://github.com/jjeanjacques10)