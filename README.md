# springPractice


# 프레임워크
   - 뼈대나 근간을 이루는 코드들의 묶음
   라이브러리란, 개발자가 작성해놓은 코드파일을 의미하며,
   API란, 여러 라이브러리가 모여있는 패키지(JAR)를 의미한다.
   프레임워크란 API가 굉장히 많이 모여져서 덩치가 커져있는 것을 의미한다.
   프레임워크는 API에 둘러싸여서 작업을 하고있다고 생각하면된다.
   개발자는 각 개개인의 능력차이가 큰 직종이고, 개발자 구성에 따라 프로젝트 결과 역시
   큰 차이를 낳는다. 이런상황을 극복하기 위한 코드이 결가물이 바로 프레임워크이다.
   프로그램의 기본 흐름이나 구조를 정하고 모든 팀원이 이구조에 자신의 코드를 추가하는
   방식으로 개발하게 된다.

# 프레임워크의 장점
   - 개발에 필요한 구저를 이미 코드로 만들어 놓았기 때문에, 실력이 부족한 개발자라 하더라도
   반쯤 완성한 상태에서 필요한 부분을 조립하는 형태의 개발이 가능하다.
   회사 입장에서는 프레임워크를 사용하면 일정한 품질이 보장되는 결과물을 얻을수 있고,
   개발자 입장에서는 완성된 구조에 자신이 맡은 서비스에 대한 코드를 개발해서 넣기
   때문에 개발 시간을 다축할수가 있다.
   

# 스프링 프레임워크
   - 경량 프레임워크 (light-weight)
   예전 프레임워크는 다양한 경우를 처리할수 있는 다양한 기능을 가지도록 만들다보니,
   하나의 기능을 위해서 너무 많은 구조가 필요했다.
   기술이 너무나 복잡하고 방대했기 때문에, 전체를 이해하고 개발하기에는 어려움이 많았다.
   그래서 스프링 프레임워크가 등장했고, 특정 기능을 위주로 간단한 JAR파일 등을 이용해서
   모든 개발이 가능하도록 구성되어 있다.

# 스프링 프레임워크의 장점
   - 복잡함에 반기를 들어서 만들어진 프레임워크(경량화)
   - 프로젝트 전체 구조를 설계할 때 유용한 프레임워크(서버 제작의 빠른 속도)
   - 다른 프레임워크들의 포용, 여러 프레임워크를 혼용해서 사용가능하며, 이를 접착성이라고 한다.
   - 개발 생산성과 개발도구의 지원


# 스프링 프레임워크의 특징 (*아래 다 알아야한다*)
   - POJO 기반의 구성
   - DI를 통한 객체간의 관계 구성
   - AOP 지원
   - 트랜잭션 관리
   - 편리한 MVC 구조
   - WAS에 종속적이지 않은 개발 환경

# 스프링 부트
   스프링 프레임워크를 사용함에 있어서 초기 설정 및 필요한 라이브러리에 대한 
   설정의 어려움이 많으며, 시간이 너무 많이 걸리기 때문에 자동 설정(AutoConfiguration)과
   개발에 필요한 모든 것을 관리해주는 스프링 부트를 선호한다. 각 코어 및 라이브러리의 버전
   들도 맞추어야 하지만 스피링 부트를 사용하면 이러한 복잡성을 해결하기에도 좋다.


[ POJO(Plain Old Java Object)기반의 구성 ]
   오래된 방식의 간단한 자바 객체라는 의미이며, JAVA 코드에서 일반적으로
   객체를 구성하는 방식을 스프링 프레임워크에서 그대로 사용할 수있다는 말이다.

[ 의존성 주입(DI)를 통한 객체간의 관계 구성 ]
   의존성(Dependency)이란 하나의 객체가 다른 객체 없이 제대로 된 역할을 할수 없다는 것을 의미한다.
   예를 들어 A객체가 B객체 없이 동작이 불가능한 상황을 'A'가 'B'에 의존적이다 라고 표현한다.
   
   주입(Injection)은 말 그대로 외부에서 밀어 넣는 것을 의미한다.
   예를 들어 어떤 객체가 필요로하는 객체를 외부에서 밀어 넣는 것을 의미한다.
   주입을 받는 입장에서는 어떤 객체인지 신경 쓸 필요가 없고 어떤 객체에 의존하든 자신의 역할은 변하지 않는다.

   **의존성
   a---------------------------------->b
   a객체에서 b객체를 직접 생성

   **의존성 주입
   a---------------???---------------->b
   a는 b가 필요하다는 신호를 보내고, ???가 b객체를 외부에서 생성하여 주입하게 된다.

   의존성 주입방식을 사용하기 위해서는 ???라는 존재가 필요하게 된다.
   스프링 프레임워크에서는 ApplicationContext가 ???라는 존재이며,
   필요한 객체들을 생성하고, 필요한 객체들을 주입해주는 역할을 한다.
   따라서 개발자들은 기존의 프로그래밍과 달리 객체와 객체를 분리해서 생성하고,
   이러한 객체들을 엮는(wiring) 작업의 형태로 개발하게 된다.

   ApplicationContext가 관리하는 객체들을 빈(Bean)이라고 부르고, 빈과 빈사이의 의존관계를 처리하는 방식으로는
   XML, 어노테이션, JAVA 방식이 있다.


[ AOP 지원]
   - 관점 지향 프로그래밍
   좋은 개발환경에서는 개발자가 비지니스 로직에만 집중할수 있게 한다.
   스프링 프레임워크는 반복적인 코드를 제거해줌으로써 핵심 비지니스 로직에만 집중할 수 있는 방법을 제공한다.
   보안이나 로그, 트랜잭션, 예외처리와 같은 비지니스 로직은 아니지만, 반드시 처리가 필요한 부분을
   관심사(cross-concern)라고 한다. 스프링 프레임워크는 이러한 횡단 관심사를 분리해서 제작하는 것이 가능하고
   횡단 관심사를 모듈로 분리하는 프로그래밍을 AOP라고 한다. 핵심 비지니스 로직에만 집중하여 코드 개발이
   가능해지고, 각 프로젝트마다 다른 관심사 적용시 코드 수정을 최고할수 있으며,
   원하는 관심사의 유지보수가 수월한 코드로 구성이 가능해진다.   


[ 트랜잭션의 지원 ]
   - DB 작업 시 트랜잭션을 매번 상황에 맞게 코드로 작성하지 않고, 어노테이션이나 XML로
   트랜잭션을 쉽게 관리 할 수있다.
   

[ 편리한 MVC 구조 ]



[ WAS에 종속적이지 않은 개발 환경 ] 
   - 단위 테스트 
   전체 Application을 실행하지 않아도 기능별 단위 테스트가 용이하기 때문에
   버그를 줄이고 개발 시간을 단축할 수 있다.


프로젝트 기본 경로
   1) src/main/java         : 서버단 JAVA 파일
   2) test/main/java         : 단위 테스트 JAVA 파일
   3) src/main/resources      : 설정 파일 및 뷰단
   4) resources/static         : css, js 파일 경로
   5) resources/templates      : html 파일 경로
   6) pom.xml               : 라이브러리 의존성 관리
   7) application.properties   : 서버 및 DB, 라이브러리 설정 파일


Qualifier
   @Autowired를 통해 객체를 주입할 때 같은 타입의 객체가 여러개 있다면, 구분할 수 없다.
   이때, @Qualifier를 통해 식별자를 부여하면 원하는 객체를 주입받을수 있다.


# Spring MVC 패턴의 특징
   - HttpServletRequest, HttpServletResponse를 거의 사용할 필요 없이 기능 구현
   - 다양한 타입의 파라미터 처리, 다양한 타입의 리턴 타입 사용 가능
   - GET 방식, POST 방식 등 전송 방식에 대한 처리를 어노테이션으로 처리 가능
   - 상속/인터페이스 방식 대신 어노테이션으로만 설정 가능



- Dispatcher Servlet에서 Dispatch는 사전적 의미로 '보내다' 라는 의미를 사지고 있습니다. 
클라이언트의 모든 요청을 한 곳으로 받아서 처리하는 역할을 수행합니다. 
즉, 서버 가장 앞단에서 사용자의 요청을 가장 먼저 받아 요청에 알맞는 Hendler, 
즉, Controller에서 위임해주는 역할을 수행합니다.
Handler의 실행 결과는 HTTP Response 형태로 만들어서 다시 반환을 합니다.
사용자의 요청은 Dispatcher Servlet에서 시작해서 Dispatcher Servlet에서 끝납니다.
사용자의 요청이 Dispatcher Servlet으로 전달된다.
Handler Mapping 또는 Controller 에 전달을 한다.
처리된 결과 값을 Model 형태로 Dispatcher에 반환하고,
사용자에게 보여주고자 하는 View 형태로 ViewResolver가 Page를 생성을 하고,
이러한 Page 값에 Model을 포함시켜서 전달을 하게 된다.

# 3-tier
   스프링 프로젝트는 3-tier 방식으로 구성한다.

   [Presentation Tier - 화면 계층]
      - 화면에 보여주는 기술을 사용하는 영역.
      - 컨트롤러에서 사용자의 요청에 맞는 응답처리를 진행하며,
      - HTML엔진(Thymeleaf),HTML등이 담당하는 영역이다.
      - 화면 구성이 이에속한다.

   [Business Tier - 비지니스 계층]
      - 순수한 비지니스 로직(메인로직)을 담고 있는 영역.
      - 고객이 원하는 요구사항을 반영하는 계층이기 떄문에 서비스에 있어서 가장 중요한 영역이다.
      - 이영역의 설계는 고객의 요구 사항과 정확히 일치해야 하며, 서비스 영역이다.

   [Persistence Tier - 영속 계층 혹은 데이터 계층]
      - 데이트가 어떤 방식으로 보관하고, 사용하는 가에 대한 설계가 들어가는 게층.
      - 일반적으로 DBMS를 많이 이용하지만, 상황에 따라서 네트워크 호출 혹은
      - 원격 호출등의 기술이 접목될 수 있다.

각 영역은 독립적으로 설계되어 나중에 특정한 기술이 변하더라도 필요한 부분을 전자제품의 부품처럼
쉽게 교환하루 있게 하자는 방식이다. 각 연결 부위는 인터페이스를 이용해서 설계하는 것이 일반적인 구성 방식이다.


      Presentation ----> Business ----> Persistence ----> DBMS
               Controller        Service(interface)    Mapper(interface)    

              

# 비지니스 계층
   - 프레젠테이션 계층과 영속 계층의 중간 다리 역할을 한다.
   영속 계층은 DBMS를 기준으로, 비지니스 계층은 로직을 기준으로 처리한다.
   예를 들어 쇼핑몰에서 상품 구매시 포인트 적립을 한다고 가정한다면,
   영속 계층의 설계는 상품,회원으로 나누어 설계하지만 비지니스 계층은
   상품 영역과 회원 영역을 동시에 사용해서 하나의 로직을 처리하게 된다.
   이때 하나의 서비스에 필요한 여러개의 쿼리 메소드를 하나로 묶어주는 역할이 필요한데,
   이를 Service 객체로 사용한다.


순서 -> MAPPER-> 인터페이스MAPPER -> DAO -> SERVICE -> CONTROLLER
                  단위test         단위test   단위test         단위test

# PATTERN
![PATTERN](./pattern.jfif)


# ORM(Object Relational Mapping)
	객체 진영과 RDB 진영을 자동으로 매핑하여 구조의 불일치를 개발자 대신 해결주는 기술의 총칭이다.
	객체지향 구조에서 프로그래밍 언어를 사용하여 RDB의 데이터를 조작하는 방법이다.
	ORM을 사용하면 개발자가 SQL문을 직접 작성하지 않아도 RDB와 상호작용할 수 있다.

# JPA(Java Persistence API)
	ORM을 사용하기 위한 설계도(틀)이다.
	Java Application용 RDB 매핑 관리를 위한 인터페이스이며, DBMS 벤더사에 의존하지 않고 독립적으로 ORM을 사용할 수 있는 ORM 표준이다.
	인터페이스이기 때문에 구현되어 있지 않은 틀만 제공하며, 자체적인 작업을 수행하지 않는다.
	JPA에 설계된 구조에 맞춰서 각 메소드를 재정의하여 직접 ORM을 구현하여 사용해야 한다.
	JPA는 ORM을 사용할 수 있는 JAVA 인터페이스를 제공하는 ORM 접근 방식이며, 구현되지 않은 JPA를 ORM이라고 말하기는 어렵다.

# Hibernate Framework
	모든 Java Application에 대해 객체 관계를 그대로 유지한 채 쿼리 서비스를 제공하는 오픈 소스(비용 없이 공개적으로 사용가능)의 경량 ORM이다.
	JPA를 구현한 구현체이며, 여러 구현체 중 가장 대표적인 구현체이다.
	객체 간 관계 구성을 지원하며, 상속, 지연성, 페이징 처리, 예외 처리 불필요를 지원한다.
	예외 처리 불필요란, JPA만의 독자적인 예외를 생성하여 try catch 및 throws를 강제시키지 않고
	트랜잭션을 지원하는 Spring Framework가 추상화한 예외로 변환 시켜 커밋하지 않고 롤백시키도록 해준다.

	Application ---------> JPA 표준 인터페이스
					▲
					│
					│
			 	┌────── ┼──────────┐
			 	│	│	   │
	        	Hibernate   EclipseLink    DataNucleus

# Spring Data JPA
	JPA를 추상화한 Repository 인터페이스를 제공하여 JPA를 쓰기 편하게 다양한 기능을 지원한다.
	내부적으로는 JPA를 사용한다. 그래서 JPA를 모르면 내부 구조를 이해하기 힘들 수 있다.


# 객체와 관계형 데이터베이스의 차이

1. 상속
	※ OA: 사무 자동화(엑셀, 한글, 워드, ppt 등)

	[개발자]	[기획자]

	번호		번호
	
	이름		이름
	생년월일	생년월일
	경력		경력
	기술등급	OA등급
	프로젝트 수	클라이언트 수

	●●●●●●●●●●●● 또는 ●●●●●●●●●●●●

	[사원]

	번호
	--------
	이름
	생년월일
	경력
	기술등급
	프로젝트 수
	OA등급
	클라이언트 수

	▷ 슈퍼 - 서브 타입 도출

	[사원] - 슈퍼

	번호(PK)
	
	이름
	생년월일
	경력

	[개발자] - 서브		[기획자] - 서브

	번호(PK, FK)		번호(PK, FK)
	
	기술등급		OA등급
	프로젝트 수		클라이언트 수


	1:1 관계에서 INSERT를 하기 위해서는 쿼리를 2번 작성해야하는 불편함이 생긴다.
	게다가 조회를 할 때에는 JOIN을 사용해야 하는데 쿼리가 굉장히 복잡해진다.
	만약에 이런 RDB의 테이블 관계를 자바 컬렉션으로 바꿀 수 있다면,

	Developer developer = list.get(developerId);
	위와 같이 간단하게 조회할 수 있다.


2. 연관관계
	객체는 하위 연산자(.)를 사용하여 참조를 한다.
	
	▶ 객체 연관 관계: 단방향으로 흘러간다(Flower에서 Pot 접근은 가능하지만 Pot에서 Flower를 접근할 수 없다)

	Flower 	→ 	Pot
	
	id		id
	name		shape
	Pot pot		color


	▶ RDB 연관 관계: 양방향으로 흘러간다(FLOWER에서 POT을, POT에서 FLOWER를 접근할 수 있다)

	FLOWER	↔	POT

	FLOWER_ID(PK)	POT_ID(PK)
	
	FLOWER_NAME	POT_SHAPE
	POT_ID(FK)	POT_COLOR

	
	▶ 객체를 테이블에 맞추어 설계

	Class Flower{
		String flowerId;
		String flowerName;
		String potId; // FK는 RDB방식에서의 연관관계이기 때문에 객체방식으로 바꿔야 함.
	}


	▶ 테이블을 객체에 맞추어 설계

	Class Flower{
		String flowerId;
		String flowerName;
		Pot pot; // 참조로 연관관계를 맺도록 함.
	}

	위와 같이 RDB를 객체방식으로 설계하면,
	조회 시 JOIN을 하여 FLOWER와 POT에서 각각 필요한 정보를 가져와
	각 객체에 담아준 뒤, flower.setPot(pot) 형태와 같이 복잡하게 작업해야 한다.

	하지만 만약 자바 컬렉션으로 관리가 가능하다면,

	list.add(flower);
	Flower flower = list.get(flowerId);
	Pot pot = flower.getPot();

	훨씬 편하게 작업이 가능하다.


3. 그래프 탐색
	
		Market
		   │
		   │
		Flower──Pot
		   │
		   │
		Order──Client
		   │
		   │
		Delivery	

	객체는 모든 객체 그래프를 탐색할 수 있어야 한다.

	market.getFlower();
	flower.getPot();
	...

	하지만 SQL 작성 시 이미 탐색 범위가 결정된다.
	만약 Market과 Flower를 JOIN해서 조회를 한다면,

	market.getFlower()는 사용 가능하지만
	market.getPot()는 null일 수 밖에 없다.

	따라서 엔티티에 대한 신뢰가 무너질 수 밖에 없다.
	
	Market market = marketDAO.find(marketId);
	market.getFlower(); // null이 아니라고 확신할 수 없다.
	market.getOrder().getClient(); // null이 아니라고 확실할 수 없다.

	marketDAO에 있는 find()를 분석해보지 않는 이상 각 엔티티에 대해 신뢰할 수 없다.

	따라서 상황에 따라 조회에 대한 메소드를 여러 개 선언해놓아야 한다.
	
	marketDAO.getFlower();
	marketDAO.getMemberWithFlower();
	marketDAO.getMemberWithOrderWithClient();
	...

	하지만 위와 같은 방법은 사실상 불가능에 가깝다.


4. 값 비교
	SQL 실행 결과를 담은 뒤 생성자를 호출하여 객체에 담으면 매번 new가 사용되기 때문에
	동일한 조회 결과의 객체일지라도 주소가 모두 다르다.

	하지만 만약 자바 컬렉션에서 객체 조회가 가능하다면
	list.get(memberId) == list.get(memberId)
	같은 객체를 가져오기 때문에 주소가 같다.

즉, 객체지향으로 설계할 수록 작업이 오히려 복잡해지고 늘어나기 때문에 RDB 중심으로 설계할 수 밖에 없다.
RDB를 자바 컬렉션에 저장하듯 사용하면 굉장히 편해지고 많은 문제가 해결되는데,
바로 이 기술을 JPA(Java Persistence API)라고 한다.


# JPA를 사용해야 하는 이유
	1. SQL 중심 개발에서 객체 중심으로 개발

	2. 생산성
		저장 : jpa.persist(market);
		조회 : jpa.find(marketId);
		수정 : market.setMarketName("새로운 이름");
		삭제 : jpa.remove(market);

	3. 유지보수
		클라이언트가 새로운 필드를 요청하여 새로운 필드 추가 시
		클래스 안에 필드만 한 개 추가하면 끝. SQL문을 수정할 필요 없음.

	4. 패러다임의 불일치 해결

		▶ JPA와 상속
		
			Employee		Developer extends Employee
	
			employeeId		developerId
			employeeName		developerLevel
						projectCount


			-INSERT
			
				▷ 개발자
					jpa.persist(developer);

				▷ JPA
					JPA가 알아서 INSERT 두 번 해줌.

				자식 필드에 부모 필드가 포함되어 있기 때문에 필요한 데이터를 자식 객체에 채우기만 하면 됨.


			-SELECT
				▷ 개발자
					jpa.find(Developer.class, developerId);

				▷ JPA
					JPA가 알아서 부모 테이블(Employee)과 JOIN해서 데이터를 가져옴.



		▶ JPA와 연관관계
			
			Flower	→	Pot

			flowerId	potId
			name		shape
			pot		color

			flower.setPot(pot);
			jpa.persist(flower);

			jpa.find(Flower.class, flowerId);


		▶ JPA와 객체 그래프 탐색

			Market
		 	   │
		 	   │
			Flower──Pot
			   │
			   │
			Order──Client
			   │
			   │
			Delivery
	
			Flower flower = jpa.find(Flower.class, flowerId);
			Pot pot = flower.getPot();

			marketDAO.find(marketId);
			market.getFlower();
			market.getOrder().getClient();

			※ SELECT 결과가 없으면 문제가 생기기 때문에 NPE 체크는 반드시 해야 한다.

		▶ JPA와 값 비교
			Market market1 = jpa.find(Market.class, marketId);
			Market market2 = jpa.find(Market.class, marketId);

			market1 == market2;
			
			동일한 트랜잭션에서 조회한 엔티티는 무조건 같다.
