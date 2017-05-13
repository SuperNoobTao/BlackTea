/*
Navicat MySQL Data Transfer

Source Server         : 112.74.42.19
Source Server Version : 50621
Source Host           : 112.74.42.19:3306
Source Database       : blacktea_blog

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2017-05-13 19:49:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_article
-- ----------------------------
DROP TABLE IF EXISTS `tb_article`;
CREATE TABLE `tb_article` (
  `article_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `article_name` varchar(255) DEFAULT NULL,
  `article_tag` varchar(255) DEFAULT NULL,
  `article_content` varchar(255) DEFAULT NULL,
  `article_created_date` datetime DEFAULT NULL,
  `article_created_by` varchar(255) DEFAULT NULL,
  `article_updated_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `article_updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_comment
-- ----------------------------
DROP TABLE IF EXISTS `tb_comment`;
CREATE TABLE `tb_comment` (
  `comment_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `comment_content` varchar(255) DEFAULT NULL,
  `comment_user_id` int(11) DEFAULT NULL,
  `comment_created_by` varchar(255) DEFAULT NULL,
  `comment_created_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `comment_updated_by` varchar(255) DEFAULT NULL,
  `comment_updated_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_log
-- ----------------------------
DROP TABLE IF EXISTS `tb_log`;
CREATE TABLE `tb_log` (
  `log_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `log_ip` varchar(255) DEFAULT NULL,
  `log_user_id` int(11) DEFAULT NULL,
  `log_user_name` varchar(255) DEFAULT NULL,
  `log_acess_resource` varchar(255) DEFAULT NULL,
  `log_operation_type` varchar(255) DEFAULT NULL,
  `log_created_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_statistics
-- ----------------------------
DROP TABLE IF EXISTS `tb_statistics`;
CREATE TABLE `tb_statistics` (
  `statistics_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `article_id` int(11) DEFAULT NULL,
  `read_count` varchar(255) DEFAULT NULL,
  `upvote` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`statistics_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_tag
-- ----------------------------
DROP TABLE IF EXISTS `tb_tag`;
CREATE TABLE `tb_tag` (
  `tag_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(255) DEFAULT NULL,
  `tag_rel` varchar(255) DEFAULT NULL,
  `tag_created_by` varchar(255) DEFAULT NULL,
  `tag_updated_by` varchar(255) DEFAULT NULL,
  `tag_created_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `tag_updated_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_pwd` char(32) DEFAULT NULL,
  `user_account` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
