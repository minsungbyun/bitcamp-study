# bitcamp-study

## 1일차(2021-06-28/월)

- 수업내용

  - 교육과정의 목표: 웹 개발자 역량 습득
  - 웹 개발자의 진로: SI/SM, 스타트업, 서비스, 공사 등
  - 소프트웨어 개요
    - System S/W, Application S/W
    - Standalone, Client/Server, Web Application
    - Web application 구성 요소: Java App, HTML/CSS/JavaScript
    - Back-end 개발: Java Application을 작성할 때 사용되는 기술 개요
    - Front-end 개발: HTML/CSS/JavaScript 기술 개요
  - 개발 학습 도구 준비
    - WebEx 온라인 화상 통신 설치
    - github.com 계정 생성
    - github.com에 개인 저장소 생성
    - 강사의 저장소 가져오기
    - 저장소에 추가된 파일 가져오기

- 공부하면서 이해가 안되었거나 실수한 부분 정리

  - git pull할 때 해당 directory에 가지 않고 pull했더니 error발생
  - git push할 때 git config --global user.email "enjoy8939@naver.com" (github email)
  - git config --global.user.name "minsungbyun"(github name) 하지 않고 commit
  - git add . 는 local에 백업되었다는 뜻이다. remote에는 올라가지 않음.
  - commit message는 최대한 상세하게 적는다.
  - git clone할 때 git clone "url"
  - token 설정 & 사용
  - root directory 설정 & 즐겨찾기

- 해결방법

  - 항상 받아오고자 하는 repo.명을 잘 기억하자. (어느 directory에 들어가서 가져올건지 확인!)
  - user.email과 user.name은 한 번만 설정하면 다음 번에는 하지 않아도 된다.
  - url = https://github.com/minsungbyun/bitcamp-study(repo. name)
  - token은 email에 저장해놓고 확인한다. (email은 기록에 남기 때문)
  - root directory는 보통 C:\Users\minsung(본인경로)에서 git directory를 생성하여 작업한다.

- 느낀점
  - git의 작동원리에 대해 궁금했는데 실습하게 되어서 유용한 시간이였다. (**\***)
  - token에 대해서 알 수 있었다. (통행권)
  - 앞으로의 교육과정에 대한 전반적인 내용을 알 수 있었다.
  - 강사님이 매우 열정적이다 passion
- git code

```
//최초 1회 수행
git config --global user.email "enjoy8939@naver.com"
git config --global user.name "minsungbyun"

//현재폴더 및 하위폴더의 백업
git add .

//로컬저장소 백업
git commit -m "first commit"

//원격저장소 백업
git push
	id : user.name
	pwd : token

//가져오기(복제)
git clone url
git pull
```

## 2일차(2021-06-29/화)

- git 저장소 다루기

  - git 서버 저장소를 로컬로 복제
  - 작업 파일을 로컬 저장소에 백업
  - 로컬 저장소의 내용을 서버 저장소에 업로드
  - 서버 저장소의 변경 내용을 로컬 저장소로 가져오기

- 프로그램 만들고 실행하기
  - VSCode 편집기 설치
  - 컴파일 방식
    - mingw64 윈도우 gcc 컴파일 설치
    - C 언어로 "Hello, world!" 를 출력하는 프로그램 만들기
    - 소스와 기계어, 컴파일, 컴파일러의 관계
    - 기계어란?
      - CPU instruction set
      - 기계어와 CPU의 관계
      - 기계어와 OS의 관계
  - 인터프리터 방식
    - node.js 자바스크립트 인터프리터 설치
    - JavaScript 언어로 "Hello, world!" 를 출력하는 프로그램 만들기
- 공부하면서 이해가 안되었거나 실수한 부분 정리

  - git clone 할 때 현재 `directory`를 확인해라!
  - 실행이 되지 않는다면 `오타를 확인`해라
  - github를 `협업`할 때 어떻게 사용하는가? (여러명이 동시에 개발할 때)
    - `commit`하는 규칙이 있는가? <br>남의 코드를 언제 pull하는가?
    - 두 개발자의 작업이 연관되어 있다면?
    - 두 개발자의 작업이 독립적이라면?
  - git push 인증시 token 복사 잘 할것

- 해결방법

  - `경험`을 많이 해봐야 할 것 같다.
  - 타자를 칠 때 `오타`를 줄일 수 있도록 인지해야겠다.

- 느낀점

  - `기계어`가 작동하는 원리에 대해서 알 수 있었다.
  - `호환성(compatible)`에 대해서 알 수 있었다.
  - 앞으로 어떤 과정을 듣게될지 맛보기가 되어서 좋았다.

- 새로 알게 된 개념
  - Context -> 상황
  - Context menu(상황에 맞는 메뉴) -> 오른쪽 마우스 클릭
  - README.md = 현재 폴더가 무엇을 나타내는지 간략하게 설명
  - 왜 README는 대문자로 쓸까?
    - 리눅스에서는 대문자가 소문자보다 먼저 위치한다.<br>(전통)
    - 윈도우에서는 대소문자 구별이 없다.
  - .git -> local repo.
    - `절대 지우면 안됨` !!
    - 지우게 되면 git을 사용하는 의미가 없다.
  - git은 사용자의 모든 행위를 기억하고 백업한다.
  - `운영체제가 다르고 cpu가 같으면?`
    - 운영체제마다 기계어 배치방법이 다르다.
  - `운영체제가 같고 cpu가 다르면?`
    - 배치방법이 같아도 기계어 자체가 다르다.

## 3일차(2021-06-30/수)

- 프로그래밍 도구 준비(계속)
  - Java 11 JDK 설치
    - JAVA_HOME 환경 변수 설정
    - PATH 환경 변수 설정
- 프로그램 만들고 실행하기(계속)
  - 컴파일 방식과 인터프리터 방식 비교
    - 프로그래밍 언어와 컴파일, 컴파일러
  - 자바의 프로그래밍 방식 소개
    - 컴파일과 실행
- 자바 애플리케이션 프로젝트 폴더 준비
  - 애플리케이션과 프로젝트의 관계
  - git 저장소에서 프로젝트 관리하기
    - 1단계: 소스파일과 .class 파일을 구분하지 않는다.
    - 2단계: src 폴더와 bin 폴더를 사용하여 소스 파일과 .class 파일을 분리한다.
    - 3단계: Maven 프로젝트 표준 디렉토리 구조
    - 4단계: git 저장소에 여러 개의 프로젝트 두기
- 수업 자료 준비하기

  - 자바 프로그래밍 기본 문법 예제
    - https://github.com/eomcs/eomcs-java
  - 개발 도구 설정 및 사용 안내서
    - https://github.com/eomcs/eomcs-docs
  - 서블릿/JSP 예제
    - https://github.com/eomcs/eomcs-java-web
  - Spring 프레임워크 예제
    - https://github.com/eomcs/eomcs-spring-webmvc
  - 미니 프로젝트 관리 시스템 단계별 구현 예제
    - https://github.com/eomcs/eomcs-java-project-2021

- 공부하면서 이해가 안되었거나 실수한 부분 정리
  - cmd에서 `git pull`할 때 해당 repo.에 가지않고 git directory에서 git pull을 하였다.
  - compile시 저장을 누르지 않았다. (`*****`)
- 해결방법
  - 어느 repo.에 있는 것을 가져올지 파악한다.
    - 인지해라 너가 어디에 있는지
- 느낀점

  - 타자연습은 매일매일 해야한다.
  - 꼼꼼함이 필요하다.

- 새로 알게 된 개념
  - Naver D2Coding Font
  - `.gitignore` 는 백업에서 제외할 대상을 지정한다.
    - _.class , _.exe ....
    - 컴파일 된 파일은 넘길 필요 없겠죠?
  - 라즈베리파이
  - REST API (소프트웨어 아키텍처)
  - Javascript는 산출물을 납품할 때 소스코드를 제공해야함(인터프리터 방식)
    - 실무에서는 소스코드를 직접 주지 않는다.
    - 중요한 부분을 js로 짜지 않겠죠?
  - 윈도우 `환경변수`설정 (제일 위 부터 읽는다)
  - 어떤 프로그램이던 명령창에서 실행할 때 도움말을 보고 어떤 값을 넣어야 하는지 확인한다.
  - 그냥 배우는 것이 아닌 왜 사용하는가를 고민하라 -> `비용절감, 유지보수(관리의 용이성)`
  - Project (프로젝트를 왜 만들어야 하는가?)
    - 작업 단위
    - 시작과 끝이 존재한다. (성과측정)
    - 의존관계가 있는지? 없는지?
    - 이 세상의 모든것은 프로젝트로 돌아간다.
      - 작게 보면 너의 생활까지
  - 빈 폴더는 백업이 되지 않는다.
    - `README.md`를 넣는다.

```
// 컴파일
./repo./javac -encoding utf-8 -d bin/main src/main/java/Hello.java

// 실행
./repo./java -cp bin/main Hello

// 패키지가 있을 때
.repo./java -cp bin/main packageName.className


```

## 4일차(2021-07-01/목)

- 프로그래밍 도구 준비(계속)
  - Gradle 설치
    - PATH 환경 변수 등록
- 프로젝트 관리
  - 애플리케이션과 프로젝트
  - 루트 프로젝트와 서브 프로젝트
  - 프로젝트와 작업
  - 프로젝트 산출물을 보관하기 위한 디렉토리 구조
  - 팀 프로젝트와 깃 저장소
  - 깃 저장소로 프로젝트를 관리하는 다양한 유형
- 교육 과정 진행
  - 이론과 실전 프로젝트를 병행하여 학습
  - 실전 프로젝트(study-project)의 로드맵
- 빌드 도구
  - 빌드 도구 개요
  - 다양한 빌드 도구: Ant, Maven, Gradle
  - Gradle 빌드 도구를 이용하여 프로젝트 폴더 준비
    - `gradle init`
  - Gradle 빌드 도구로 생성한 디렉토리의 구조 및 파일 설명
- Gradle 빌드 도구 사용법
  - 빌드 스크립트 파일의 용도
    - settings.gradle : 여러 프로젝트에 공통으로 적용할 설정 정보.
    - app/build.gradle : 서브 프로젝트에만 적용하는 빌드 설정 정보.
  - Gradle 기본 작업
    - init : 현재 폴더를 프로젝트 폴더로 구성
    - wrapper : Gradle 설치 및 실행 파일 생성
    - gradle에 플러그인을 장착하면 더 많은 작업을 수행할 수 있다.
  - 'java' gradle 플러그인
    - compileJava
      - src/main/java 폴더에 있는 소스 파일을 모두 컴파일
      - build/classes/java/main 폴더에 .class 파일을 둔다.
    - compileTestJava
      - src/test/java 폴더에 있는 소스 파일을 모두 컴파일
      - build/classes/java/test 폴더에 .class 파일을 둔다.
    - processResources
      - src/main/resources 폴더에 있는 파일을 build/resources/main 폴더에 복사한다.
    - processTestResources
      - src/test/resources 폴더에 있는 파일을 build/resources/test 폴더에 복사한다.
    - clean
      - build 폴더를 삭제한다.
    - classes
      - compileJava와 processResources를 모두 수행
    - testClasses
      - classes + compileTestJava + processTestResources 수행
    - check
      - test + 단위 테스트 수행
    - javadoc
      - 소스 파일에서 javadoc 주석을 추출하여 HTML된 API 문서를 생성한다.
    - build
      - check + assemble(배포 파일 생성 작업) 수행
  - 'application' gradle 플러그인
    - run
      - 'java' 플러그인의 classes 작업을 먼저 실행한다.
      - 그런 후 application 설정에 지정한 클래스를 실행한다.
    - build
      - 이 플러그인을 장착한 상태에서 build 작업을 수행하면<br> 고객에게 배포할 수 있는 파일을 build/distributions 폴더에 생성한다.
      - 자바 프로그램을 실행시킬 수 있는 스크립트 파일도 자동 생성된다.
  - 정리
    1.  init 작업을 통해 프로젝트 폴더를 준비한다.
    2.  build.script에 빌드 작업이 들어 있는 플러그인을 설정한다.
    3.  각 플러그인의 작업을 실행할 때 필요한 정보를 등록한다.
    4.  프로젝트에서 사용할 외부 라이브러리 파일을 등록한다.
    5.  필요한 작업을 실행하여 애플리케이션을 빌드한다.

<br >

- 공부하면서 이해가 안되었거나 실수한 부분 정리
  - git repo.를 github에서 만들지 않고 cmd에서 명령어로 만들 수 없을까?
- 해결방법
  - 아직 해결 못함.
- 느낀점
  - 잘못된 것이 없는데 실행이 되지 않을 때
    - 오타확인해, ctrl+s 확인해
- 새로 알게 된 개념

  - gradlew(리눅스,유닉스)
  - gradlew.bat(windows)

    - Gradle 설치 안한 개발자들을 위해서 대비해서 들어가있다.

  - Gradle plugin 설정시 `java`와 `application`의 차이
    - java는 build 명령 시 distributions이 생성되지 않고, application로 설정하면 build 명령 시 distributions이 생성되어 배포할 수 있다.
  - 사용자 홈 폴더는 영어로 만든다.
  - 바탕화면 가는 방법 -> C:\Users\userName\Desktop

```
// 컴파일한 class파일 실행해줘
gradle run

// 조용히 좀 해
gradle -q run

// gradle폴더, gradlew, gradlew.bat이 없을 때
gradle wrapper

// - 프로젝트 세부정보
gradle projects

// task 종류좀 알려줘
gradle tasks --all

// 빌드 날려
gradle clear
```

## 5일차(2021-07-01,금)

- 프로그래밍 도구 준비(계속)
  - eclipse.org 에서 개발 도구 다운로드 및 설치
  - eclipse IDE 환경 설정
    - eomcs-docs/devtool/개발도구준비.md 파일 참조
- git 다루기
  - 로컬 저장소 만들기
    - `git init`
  - 서버 저장소 만들기
    - `github.com`에서 new 버튼 클릭
  - 로컬 저장소에 서버 저장소의 위치를 등록하기
    - `git remote origin 서버저장소URL`
  - 로컬 저장소의 내용을 서버에 올리기
    - `git push`
- 자바 기초 문법(eomcs-java)
  - ex01
    - 패키지 다루기
    - 자바 소스 파일과 클래스 블록
    - 소스 파일의 인코딩
    - main() 메서드
  - ex02
    - 여러 줄 주석, 한 줄 주석
    - javadoc 주석
    - 애노테이션
- 실전 프로젝트(eomcs-java-project-2021)

  - 01-b : 프로젝트 준비하기 : `이클립스 IDE`로 임포트

- 공부하면서 이해가 안되었거나 실수한 부분 정리
  - github에서 repo.를 생성할 때 README.md를 생성하면 안된다.
    - git init으로 로컬에 저장소가 생성되어 있음.
- 해결방법
  - 로컬 저장소는 디렉토리가 비어있고 <br >서버 저장소는 README.md 가 있기 때문에 URL등록시 에러가 발생한다.
    - 강제로 push하는 방법이 있고 <br >제일 좋은 방법은 서버 저장소 생성 시 빈 저장소를 만들면 된다.
- 느낀점

  - pro git pdf를 보니 git에 관련된 명령어가 정말 많구나를 느꼈다.

- 새로 알게 된 개념
  - `git clone`이 아닌 `git init`으로 원격 저장소랑 연결하는 방법
  - eclipse 관련 세부설정을 알 수 있었다.

```
// .project 파일 생성
gradle eclipseProject

// .classpath 파일 생성

// .settings 파일 생성
gradle eclipseJdt

// eclipse 설정 파일 생성
gradle eclipse

// eclipse 설정 파일 제거
gradle cleanEclipse
```
