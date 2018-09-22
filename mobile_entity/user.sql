/*
Navicat MySQL Data Transfer

Source Server         : javaee
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : mobile

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-09-22 21:46:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_iphone` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_img` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) NOT NULL,
  `user_state` int(11) DEFAULT '0' COMMENT '0是离线，1是在线',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
