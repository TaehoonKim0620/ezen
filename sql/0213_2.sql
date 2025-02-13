create database EZEN;
use EZEN;
create table FOOD_INFO(
FI_NUM INT primary  key auto_increment,
FI_NAME VARCHAR(30) not null,
FI_PRICE INT not null
);

drop table FOOD_INFO;

insert into FOOD_INFO(FI_NAME,FI_PRICE)
VALUES('김밥',3500),
('떡볶이',4000),
('순대',4500),
('라면',5000),
('해장라면',6000);

select * from FOOD_INFO;

where FI_PRICE>=4000;

select * from FOOD_INFO
where FI_PRICE>=4000 and FI_NAME like '%라%';

update FOOD_INFO
set FI_PRICE = FI_PRICE + 500;
delete from FOOD_INFO
where FI_NUM >= 6
select * from FOOD_INFO;

update FOOD_INFO
set FI_PRICE = FI_PRICE * 1.1;

select * from FOOD_INFO 
order by FI_NAME asc,
 FI_PRICE ASC