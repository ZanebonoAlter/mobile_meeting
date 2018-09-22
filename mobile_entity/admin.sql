/*
Navicat MySQL Data Transfer

Source Server         : javaee
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : mobile

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-09-22 21:45:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_account` varchar(255) NOT NULL,
  `admin_password` varchar(255) NOT NULL,
  `admin_username` varchar(255) DEFAULT NULL,
  `admin_img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
