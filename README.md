# Auction-Service

## Overview

Confluent Kafka를 이용한 프로젝트입니다. 이 프로젝트는 다음과 같은 주요 기능 및 라이브러리를 활용하고 있습니다

- Confluent Kafka
- OpenFeign Client
- Eureka Client for service discovery
- Spring Cloud Config for centralized configuration

## Requirements

- Java 17
- Spring Boot
- Confluent Kafka
- OpenFeign Client

## Stack

<p align="left">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="java" width="40" height="40"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" alt="spring" width="40" height="40"/>
  <img src="https://companieslogo.com/img/orig/CFLT-c4a50286.png?t=1627024622" alt="redis" width="40" height="40"/>
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/gradle/gradle-plain.svg" width="40" height="40"/>
</p>

## 데이터베이스

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-plain.svg" width="40" height="40"/>
          

## Mechanism

![image](https://github.com/wooriFisa-Final-Project-F4/auction-logger/assets/119636839/5e1d0209-aec5-41c8-8211-337bf50f87dd)

Auction-Price-Updater에서 발행한 Kafka Event의 Value를 사용하여 입찰 결과를 저장<br>
경매 내역 조회

- Event의 Value 데이터 정제 후 저장
- 관리자가 경매 내역 조회 시 전체 경매 내역 반환
- 사용자가 경매 내역 조회 시 사용자의 경매 내역 반환

<br><br>

---
