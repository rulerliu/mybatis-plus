DROP TABLE IF EXISTS user;
CREATE TABLE user
(
	id BIGINT(20) NOT NULL COMMENT '主键ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    `create_time` datetime(3) NULL DEFAULT NULL,
    `update_time` datetime(3) NULL DEFAULT NULL,
	PRIMARY KEY (id)
);

INSERT INTO user (id, name, age, email,create_time, update_time) VALUES
(1, 'Jone', 18, 'test1@baomidou.com', now(), now()),
(2, 'Jack', 20, 'test2@baomidou.com', now(), now()),
(3, 'Tom', 28, 'test3@baomidou.com', now(), now()),
(4, 'Sandy', 21, 'test4@baomidou.com', now(), now()),
(5, 'Billie', 24, 'test5@baomidou.com', now(), now());

alter table user add column create_timestamp bigint(11) null default null;
update resource_instance set create_timestamp = UNIX_TIMESTAMP(create_time)*1000;