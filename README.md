# bitcamp-study

## 1일차(21.06.28)

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
	- git의 작동원리에 대해 궁금했는데 실습하게 되어서 유용한 시간이였다. (*****)
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
```	

## 2일차(21.06.29)
		
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
	- .git -> local repo. 
		- `절대 지우면 안됨` !!
		- 지우게 되면 git을 사용하는 의미가 없다.
	- git은 사용자의 모든 행위를 기억하고 백업한다.
	- `운영체제가 다르고 cpu가 같으면?`
		- 운영체제마다 기계어 배치방법이 다르다.
	- `운영체제가 같고 cpu가 다르면?`
		- 배치방법이 같아도 기계어 자체가 다르다.
	

	 