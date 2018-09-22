/*
Navicat MySQL Data Transfer

Source Server         : javaee
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : mobile

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-09-22 21:45:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `room_id` int(11) NOT NULL,
  `room_name` varchar(255) DEFAULT NULL,
  `room_state` varchar(255) DEFAULT NULL,
  `room_create_id` int(11) DEFAULT NULL,
  `room_create_time` datetime DEFAULT NULL,
  `room_limit` int(11) DEFAULT NULL,
  PRIMARY KEY (`room_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
