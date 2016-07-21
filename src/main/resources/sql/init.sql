create database resume;

/*
 * ҳ�����ͳ��
 * */
drop table page_view;
create table page_view(
    id int(30) primary key auto_increment not null,
    agent_type varchar(200) not null,
    request_time varchar(100) not null,
    request_count varchar(2) default "1"
)DEFAULT CHARSET=utf8;


/**
 *  ������Ϣ
 * sex 0 ��  1 Ů
 * diploma 0 ��ר  1 ����  3 �о���
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
values ('Zender','26','0','1','15101535064','15101535064@163.com','����','������������������');
/*
 * ��������
 * flag 0 ��Ч  1��Ч
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
values ('�Ϲ�������޹�˾','2015.9','2016.7','�����鳤','�����鳤','������С�������䡢����������롢��Ŀά�����¼������м�������ѵ��','0','1','zender','2016-07-21 11:06:23',1); 
insert into employment(company_name,start_time,end_time,site,site_desc,work_desc,flag,sort,update_user,update_time,user_id)
values ('Ħ��������޹�˾','2014.5','2015.8','Java��������ʦ','Java��������ʦ','������С���д�ĵ�������������롢��Ŀά��','0','2','zender','2016-07-21 11:06:23',1); 

/**
 * ְҵ����
 */
drop table skills;
create table skills(
     id int(30) primary key auto_increment not null,
     stype varchar(2) not null comment "��������",
     sdesc varchar(500) not null comment "��������",
     flag varchar(2) not null comment "�Ƿ���Ч�� 0 ��Ч  1��Ч",
     sort int(20) not null comment "�����ֶ�",
     udpate_user varchar(50) comment "�޸���",
     update_time varchar(50) comment "�޸�ʱ��",
     user_id int(30) not null
)default charset=utf8;

insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','����ʵ��Java��������ϤNIO�������̣���ϤScala','0',1,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','�����õļ������������Ϥ�����㷨�����ݽṹ�����ģʽ','0',2,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','����ʵ��Web��������Ϥhttp��RESTful��WebService�ȳ���webӦ�ü���','0',3,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','��ϤLinuxϵͳ���������ϤVI�༭��','0',4,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','��Ϥ����Web�������Spring������SpringMVC����MyBatis��','0',5,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','��ϤJavaScript����ϤAngularJS��jQuery��ǰ�˿������','0',6,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','��ϤMySQL��Oracle�ȳ������ݿ⣬�˽�MongoDB','0',7,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','�˽�Redis�ֲ�ʽ����','0',8,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','��ϤKafka��Akka��Flume���˽�SparkStreaming��Hadoop�ȴ����ݿ��','0',9,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','�˽�ҳ�滺��OSCache��ҳ�澲̬�����Freemarker','0',10,'zender','2016-07-21 15:02:22',1);
insert into skills(stype,sdesc,flag,sort,udpate_user,update_time,user_id)
values ('','��ϵͳ�ܹ���ϵͳ�߲����Ż���MySQL�Ż���һ���˽�','0',11,'zender','2016-07-21 15:02:22',1);



/**
 * ��������
 */
drop table education;
create table education(
    id int(30) primary key auto_increment not null,
    school varchar(100) not null comment "ѧУ����",
    major varchar(100) not null comment "רҵ",
    start_time varchar(50) not null comment "��ʼʱ��",
    end_time varchar(50) not null comment "��ҵʱ��",
    flag varchar(2) not null comment "�Ƿ���Ч 0 ��Ч 1 ��Ч",
    sort int(20) comment "�����ֶ�",
    update_user varchar(50) comment "�޸���",
    update_time varchar(50) comment "�޸�ʱ��",
    user_id int(30) not null
)default charset=utf8;

insert into education(school,major,start_time,end_time,flag,sort,update_user,update_time,user_id)
values ('��������ѧ','�������    ����','2009.9','2013.6','0',1,'zender','2016-07-21 16:21:33',1);