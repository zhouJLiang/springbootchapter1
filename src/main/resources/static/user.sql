CREATE  TABLE  `t_user`(
`id` int(8) not NULL auto_increment comment '自增主键',
`usename` VARCHAR(50) not NULL  comment '用户名',
`password` VARCHAR(50) not NULL  comment '密码',
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT charset=utf8 comment='用户表';