# basic-board

## 📋 목표 
- 스프링의 기본 기능으로 게시판 구현해보기

<br>

## 진행방식
- 해당 레포지토리를 본인의 로컬 환경으로 `fork` - `clone` 후 각자 브랜치를 만들어서 기능 구현
- 구현이 끝난 다음에는 `master` 브랜치로 PR 으로 보내고 오프라인으로 서로 코드리뷰
- 진행했던 코드리뷰는 PR에 기록

<br>

## 🛠️ 개발 환경
- Spring 2.7.8
- Java 11
- Gradle

<br>

## 요구사항

### 공통 요구사항

- `Lombok 사용금지 ❌
  - `Lombok`은 편의를 위한 라이브러리 이므로 어느정도 스프링을 자유롭게 사용할 줄 알때 도입할  예정
-  용도에 맞는 패키지를 생성해서 그 안에 클래스를 만들 것
- 용도가 비슷한 클래스들은 패키지로 묶어서 관리할 수 있도록 설계하기
- 코딩컨벤션을 지키기 ✅
  - ex) [캠퍼스 핵데이 Java 코딩 컨벤션](https://naver.github.io/hackday-conventions-java/)
- 구현이 끝난다음에는 `master` 브랜치로 PR 보내기
- ‼️만약 Merge 를 해야한다면 꼭 스터디원들과 상의‼️


<br>
<hr>

#### 1주차 요구사항

- <u>글을 등록하고 읽고 수정하고 삭제할 수 있는 게시판 만들기(CRUD)</u>
- 글을 나타내는 `Post` 클래스는 다음과 같이 이루어져 있음

  ```java
  public class Post {

    Long id;
    String author;
    String title;
    String content;

    //write your code here
    //...
  }
  ```
  - 필드들의 타입과 변수명은 유지하되, 접근제한자나 필요힌 메소드들은 추가 가능
  - 필수 클래스인 `Post` 클래스 이외에는 자유롭게 설계 가능

    <br>
  
<hr>

#### 2주차 요구사항

- <u>구현했던 게시판에 DB 연동해서 DB를 사용한 CRUD 게시판 구현하기</u>
- 1주차와 
- 데이터베이스는 `H2`  1.4.200 버전으로 사용  (2023.02.15 기준 [mvnrepository](https://mvnrepository.com/artifact/com.h2database/h2) 에서 가장 다운로드 횟수가 많기 때문)  
- 1주차 미션 결과물 클래스들에 `v1` 을 붙이고 2주차에 구현한 클래스들에는 `v2`를 붙여서 작성 
- DB 연결은 `JDBC template` 사용

<br>
<br>

<hr>

#### 3주차 요구사항

- <u> DB연동한 게시판에 Validation추가하고 Pagination하기 </u>
- Validation은 Spring Validation 사용
- Pagination 해서 view에서 확인
- 기존 v2에서 이어서 구현
- 부족한 부분 리팩토링 하기
