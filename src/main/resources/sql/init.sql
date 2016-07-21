create database resume;

/*
 * 页面访问统计
 * */
drop table page_view;
create table page_view(
    id int(30) primary key auto_increment not null,
    agent_type varchar(200) not null,
    request_time varchar(100) not null,
    request_count varchar(2) default "1"
)DEFAULT CHARSET=utf8;


/**
 *  个人信息
 * sex 0 男  1 女
 * diploma 0 大专  1 本科  3 研究生
 */
drop table user;
create table user(
    id int(30) primary key auto_increment not null,
    name varchar(50) not null,
    age varchar(10), 
    sex varchar(2),   
    diploma varchar(2),
    telephone varchar(20),
    email varchar(30),
    location varchar(50),
    address varchar(100)
)DEFAULT CHARSET=utf8;

insert into user(name, age, sex, diploma, telephone, email, location, address)
values ('Zender','26','0','1','15101535064','15101535064@163.com','吉林','北京市西城区健德门');
/*
 * 工作经历
 * flag 0 有效  1无效
 * */
drop table employment;
create table employment(
    id int(30) primary key auto_increment not null,
    company_name varchar(200) not null,
    start_time varchar(200),
    end_time varchar(200),
    site varchar(100),    
    site_desc varchar(500),
    work_desc varchar(1000),
    flag varchar(2),
    sort varchar(100),
    update_user varchar(50),
    update_time varchar(200),
    user_id int(30) not null
)default charset=utf8;

insert into employment(company_name,start_time,end_time,site,site_desc,work_desc,flag,sort,update_user,update_time,user_id)
values ('紫光软件有限公司','2015.9','2016.7','开发组长','开发组长','需求调研、任务分配、软件开发编码、项目维护、新技术钻研及新人培训等','0','1','zender','2016-07-21 11:06:23',1); 
insert into employment(company_name,start_time,end_time,site,site_desc,work_desc,flag,sort,update_user,update_time,user_id)
values ('摩卡软件有限公司','2014.5','2015.8','Java开发工程师','Java开发工程师','需求调研、编写文档、软件开发编码、项目维护','0','2','zender','2016-07-21 11:06:23',1); 

/**
 * 职业技能
 */
drop table skills;
create table skills(
     id int(30) primary key auto_increment not null,
     stype varchar(2) not null comment "技能类型",
     sdesc varchar(500) not null comment "技能描述",
     flag varchar(2) not null comment "是否有效， 0 有效  1无效",
     sort int(20) not null comment "排在字段",
     udpate_user varchar(50) comment "修改人",
     update_time varchar(50) comment "修改时间",
     user_id int(30) not null
)default charset=utf8;

insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','有扎实的Java基础，熟悉NIO及网络编程，熟悉Scala','0',1,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','有良好的计算机基础，熟悉常用算法、数据结构及设计模式','0',2,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','有扎实的Web基础，熟悉http、RESTful、WebService等常用web应用技术','0',3,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','熟悉Linux系统常用命令，熟悉VI编辑器','0',4,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','熟悉常用Web开发框架Spring（包括SpringMVC）、MyBatis等','0',5,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','熟悉JavaScript，熟悉AngularJS、jQuery等前端开发框架','0',6,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','熟悉MySQL、Oracle等常用数据库，了解MongoDB','0',7,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','了解Redis分布式缓存','0',8,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','熟悉Kafka、Akka、Flume，了解SparkStreaming及Hadoop等大数据框架','0',9,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','了解页面缓存OSCache及页面静态化框架Freemarker','0',10,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','对系统架构、系统高并发优化及MySQL优化有一定了解','0',11,'zender','2016-07-21 15:02:22',1);



/**
 * 教育经历
 */
drop table education;
create table education(
    id int(30) primary key auto_increment not null,
    school varchar(100) not null comment "学校名称",
    major varchar(100) not null comment "专业",
    start_time varchar(50) not null comment "开始时间",
    end_time varchar(50) not null comment "毕业时间",
    flag varchar(2) not null comment "是否有效 0 有效 1 无效",
    sort int(20) comment "排序字段",
    update_user varchar(50) comment "修改人",
    update_time varchar(50) comment "修改时间",
    user_id int(30) not null
)default charset=utf8;

insert into education(school,major,start_time,end_time,flag,sort,update_user,update_time,user_id)
values ('长春理工大学','软件工程    本科','2009.9','2013.6','0',1,'zender','2016-07-21 16:21:33',1);