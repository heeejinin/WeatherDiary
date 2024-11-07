# 📓 WeatherDiary
### 📌 간략 소개
#### Spring Boot와 Java를 이용하여 오늘의 날씨와 일기를 적을 수 있는 다이어리(일기 작성, 수정, 조회, 삭제)를 구현한다.

## ⚙Tech Stack
- **Framework** : Spring Boot 3.3.5
- **Language** : Java
- **Build** : Gradle
- **JDK** : JDK 1.8
- **Database** : Maria DB
- **Open API** : Open Weather Map API
- **Library** : Lombok, JSON, JUnit, JPA, Springdoc(Swagger), JDBC(연습용)
  

## 💡 주요 기능
### ✅ 일기 API
#### 1. 일기 작성 API
- POST / create / diary
- 파라미터 : 날짜(형식 : yyyy-MM-dd), 일기 내용
- 정책: 외부 API 에서 받아온 날씨 데이터(or DB의 과거 날씨 데이터)와 함께 DB에 저장
  
#### 2. 일기 조회 API
- GET /read/diary
- 파라미터 : 조회할 날짜(형식 : yyyy-MM-dd)
- 정책 : 해당 날짜의 일기를 List 형태로 반환

- GET /read/diaries
- 파라미터 : 조회할 날짜 기간의 시작일, 종료일(형식 : yyyy-MM-dd)
- 정책 : 해당 날짜의 일기를 List 형태로 반환

#### 3. 일기 수정
- PUT / update / diary
- 파라미터 : 수정할 날짜(형식 : yyyy-MM-dd), 수정할 일기 내용
- 정책 : 해당 날짜의 첫 번째 일기 글을 수정

#### 4. 일기 삭제
- DELETE /delete/diary
- 파라미터 : 삭제할 날짜(형식 : yyyy-MM-dd)
- 정책 : 해당 날짜의 모든 일기 삭제

### ✅ Spring Scheduler
- 매일 새벽 1시에 날씨 데이터를 외부 API 에서 받아다 DB에 저장해두는 로직을 구현

### ✅ logback
- logback을 이용하여 프로젝트 로그와 에러 로그를 파일로 저장

### ✅ API documentation
- Swagger를 이용하여 API documentation 생성

## 📝 구현 시 문제점
#### Spring Boot 3.x 이상 버전에서는 springfox 라이브러리가 호환되지 않는 문제점 발생

- 해결방안 : 기존 springfox 대신 springdoc을 사용하여 해결
    

