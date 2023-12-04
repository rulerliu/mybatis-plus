package com.itmayiedu.entity;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class User {
	private Long id;
	private String name;
	private Integer age;
	private String email;

	private LocalDateTime createTime;
	private LocalDateTime updateTime;

//	private Date createTime;
//	private Date updateTime;

//	private Timestamp createTime;
//	private Timestamp updateTime;
}
