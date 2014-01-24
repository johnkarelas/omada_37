/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : landreg

Target Server Type    : MYSQL
Target Server Version : 50199
File Encoding         : 65001

Date: 2014-01-24 18:42:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `lands`
-- ----------------------------
DROP TABLE IF EXISTS `lands`;
CREATE TABLE `lands` (
`landID`  int(11) NOT NULL AUTO_INCREMENT ,
`size`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`owner`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`boarders`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`type`  varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`address`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
PRIMARY KEY (`landID`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=5

;

-- ----------------------------
-- Records of lands
-- ----------------------------
BEGIN;
INSERT INTO `lands` VALUES ('1', '55', 'chrisikopoulos', 'aigaleo', 'oikopedo', '8hbwn 5'), ('2', '100', 'karelas', 'eleysina', 'oikia', 'belouxioth 6'), ('3', '150', 'mwraiths', 'alimos', 'oikia', 'alimou 15'), ('4', '200', 'chrisikopoulos', 'patra', 'oikia', 'makrinistis 8');
COMMIT;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
`userID`  int(11) NOT NULL ,
`username`  varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`password`  varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`administrator`  varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
PRIMARY KEY (`userID`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Records of users
-- ----------------------------
BEGIN;
INSERT INTO `users` VALUES ('1', 'john', '123', 'no'), ('2', 'adm', 'adm', 'yes');
COMMIT;

-- ----------------------------
-- Auto increment value for `lands`
-- ----------------------------
ALTER TABLE `lands` AUTO_INCREMENT=5;
