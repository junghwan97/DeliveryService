# 배달 API

## 음식<br/>
### 개별 음식 조회 : GET foods/{id} (사장, 주문자 입장) <br/>
### 음식 등록 : POST foods (사장 입장) <br/>
### 음식 수정 : PUT foods/{id} (사장 입장) <br/>
### 음식 삭제 : DELETE foods/{id} (사장 입장) <br/>
### </br>
#### 음식명, 가격, 간단한 설명, 추가 옵션, 추천, 소속 식당

### </br>

| 필드            | 데이터 타입    |null |Key| Extra          |
|-----------------|-------------|----|---|----------------|
| id              | INT         | NO |PRI| AUTO_INCREMENT |
| foodName        | VARCHAR(30) | NO |
| foodPrice       | INT         | NO |
| foodDescription | VARCHAR(50) | NO |
| belong          | VARCHAR(30) | NO |

[//]: # (### 음식 DB)

[//]: # (#### id INT PRIMARY KEY AUTO_INCREMENT)

[//]: # (#### foodName VARCHAR&#40;30&#41; NOT NULL,)

[//]: # (#### foodPrice INT NOT NULL,)

[//]: # (#### foodDescription VARCHAR&#40;50&#41; NOT NULL,)

[//]: # (#### belong VARCHAR&#40;30&#41; NOT NULL)

### </br>

## 주문 <br/>
### 주문 등록 : POST orders (주문자 입장) <br/>
### 주문 조회 : GET orders/{id} (주문자, 사장 입장) </br>
### 주문 삭제(취소) : DELETE orders/{id} (주문자, 사장 입장)<br/>

### </br>

## 식당 <br/>
### 식당 조회 : GET stores/{storeId} (사장, 주문자 입장) <br/>
### 식당 정보 등록 : POST stores (사장 입장) <br/>
### 식당 수정 : PUT stores/{storeId} (사장 입장) <br/>
### 식당 삭제 : DELETE stores/{storeId} (사장 입장) <br/>
#### 식당명, 최소주문비, 배달비, 매장 및 원산지 정보, 음식 리스트, 즐겨찾기, 리뷰 리스트, 평점, 카테고리 <br/>


## 회원 <br/>
### 회원 등록 : POST members
### 회원 정보 조회 : GET members/{memberId}
### 회원 정보 수정 : PUT members/{memberId}
### 회원 탈퇴(삭제) : DELETE members/{memberId}

[//]: # (## 주문 중계 <br/>)

[//]: # (### 주문 상태 &#40;접수중 / 주문 수락 or 거절 / 배달중 / 배달 완료&#41; 등록 &#40;사장 입장&#41; <br/>)

[//]: # (### 주문 상태 &#40;접수중 / 주문 수락 or 거절 / 배달중 / 배달 완료&#41; 조회 &#40;주문자, 사장 입장&#41; <br/>)

[//]: # (## 리뷰 <br/>)

[//]: # (### 리뷰 및 별점 조회 &#40;사장, 주문자 입장&#41; <br/>)

[//]: # (### 리뷰 및 별점 등록 / 수정 / 삭제 &#40;주문자 입장&#41; <br/>)


[//]: # (## 결제 <br/>)
