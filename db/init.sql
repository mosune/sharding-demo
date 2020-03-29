create database demo_ds_0;
create database demo_ds_1;
create database demo_ds_master;
create database demo_ds_slave_0;
create database demo_ds_slave_1;

-- order表
CREATE TABLE "t_order" (
  "id" bigint(20) NOT NULL AUTO_INCREMENT,
  "order_id" int(11) NOT NULL,
  "user_id" int(11) NOT NULL,
  "status" varchar(50) DEFAULT NULL,
  PRIMARY KEY ("id")
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- order_item表
CREATE TABLE "t_order_item" (
  "order_item_id" bigint(20) NOT NULL AUTO_INCREMENT,
  "order_id" bigint(20) NOT NULL,
  "user_id" int(11) NOT NULL,
  "status" varchar(50) DEFAULT NULL,
  PRIMARY KEY ("order_item_id")
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- a表
CREATE TABLE "a" (
  "id" bigint(20) NOT NULL AUTO_INCREMENT,
  "status" varchar(50) DEFAULT NULL,
  PRIMARY KEY ("id")
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- b表
CREATE TABLE "b" (
  "id" bigint(20) NOT NULL AUTO_INCREMENT,
  "a_id" bigint(20) NOT NULL,
  "status" varchar(50) DEFAULT NULL,
  PRIMARY KEY ("id")
) ENGINE=InnoDB DEFAULT CHARSET=utf8;