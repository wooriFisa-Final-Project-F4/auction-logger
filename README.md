# Auction-Logger
![image](https://user-images.githubusercontent.com/119636839/267515508-5e1d0209-aec5-41c8-8211-337bf50f87dd.png)
> Auction-Price-Updater에서 발행한 이벤트를 구독하는 컨슈머가 포함된 서버입니다.
<br>


## 🛠️ Dependency
|       기능       | 기술 스택                                                                       |
|:--------------:|:----------------------------------------------------------------------------|
|  Spring Boot   | - Spring Framework 2.7.15<br> - Java 17 <br> - Gradle 8.0 <br> - Spring Web |
|  Spring Cloud  | - Eureka <br> - Config <br> - Gateway <br> - OpenFeign        |
|Kafka|- Confluent Kafka 7.4.0<br> - Zookeeper 7.4.0 |
|    Database    | - Mysql 8.33                      |
|      ORM       | - JPA                             |

<br>

## 📝 Auction-Logger 기능

|   기능   | 내용                                                                                                 |
|:------:|:---------------------------------------------------------------------------------------------------|
|  입찰 결과 저장     | Record의 Value를 사용하여 입찰 결과 저장     |

<br>

```
- 입찰 결과 (SUCCESS, FAIL, ERROR)포함된 입찰 요청 정보 저장
```
</details>
<br>



## Auction-Logger Prooperties

```properties
#Basic
server.port=[port 번호]
server.servlet.context-path=[base url]
# EUREKA
eureka.client.service-url.defaultZone=[Eureka-Server-ip]

# MYSQL
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=[database url]
spring.datasource.username=[user name]
spring.datasource.password=[user password]

# JPA
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update

# KAFAK PRODUCER 
spring.kafka.bootstrap-servers=[Kafka Broker ip]
spring.kafka.consumer.group-id=[Consumer group id]
spring.kafka.consumer.auto-offset-reset=earliest
spring.kafka.consumer.key-deserializer=org.springframework.kafka.support.serializer.ErrorHandlingDeserializer
spring.kafka.consumer.value-deserializer=org.springframework.kafka.support.serializer.ErrorHandlingDeserializer
spring.kafka.consumer.properties.spring.deserializer.key.delegate.class=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.properties.spring.deserializer.value.delegate.class=org.springframework.kafka.support.serializer.JsonDeserializer
spring.kafka.consumer.properties.spring.json.trusted.packages=*

# LOGGING
logging.pattern.console=%green(%d{yyyy-MM-dd HH:mm:ss.SSS}) %magenta([%thread]) %highlight(%-5level) %cyan(%logger{36}) - %yellow(%msg%n)
logging.level.org.hibernate.SQL=debug
logging.file.path=logs

#Value
kafka.topic.name=[Consumer topic name]
```

