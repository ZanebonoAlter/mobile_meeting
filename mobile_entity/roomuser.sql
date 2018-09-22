/*
Navicat MySQL Data Transfer

Source Server         : javaee
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : mobile

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-09-22 21:46:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for roomuser
-- ----------------------------
DROP TABLE IF EXISTS `roomuser`;
CREATE TABLE `roomuser` (
  `ra_id` int(11) NOT NULL,
  `ra_room_id` int(11) DEFAULT NULL,
  `ra_user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`ra_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
