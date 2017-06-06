

-- ----------------------------
-- Table structure for tb_article
-- ----------------------------
DROP TABLE IF EXISTS tb_article;
CREATE TABLE tb_article (
  article_id bigint(20) NOT NULL,
  created_by bigint(20) DEFAULT NULL,
  created_date  DATETIME NULL DEFAULT NULL ,
  updated_by bigint(20) DEFAULT NULL,
  updated_date  DATETIME NULL DEFAULT NULL ,
  article_content varchar(255) DEFAULT NULL,
  article_name varchar(255) DEFAULT NULL,
  article_tag varchar(255) DEFAULT NULL,
  PRIMARY KEY (article_id)
);

-- ----------------------------
-- Table structure for tb_comment
-- ----------------------------
DROP TABLE IF EXISTS tb_comment;
CREATE TABLE tb_comment (
  comment_id bigint(20) NOT NULL,
  created_by bigint(20) DEFAULT NULL,
  created_date DATETIME NULL DEFAULT NULL ,
  updated_by bigint(20) DEFAULT NULL,
  updated_date DATETIME NULL DEFAULT NULL ,
  comment_content varchar(255) DEFAULT NULL,
  comment_user_id int(11) DEFAULT NULL,
  PRIMARY KEY (comment_id)
) ;

-- ----------------------------
-- Table structure for tb_log
-- ----------------------------
DROP TABLE IF EXISTS tb_log;
CREATE TABLE tb_log (
  log_id bigint(20) NOT NULL,
  log_acess_resource varchar(255) DEFAULT NULL,
  created_date DATETIME NULL DEFAULT NULL ,
  log_ip varchar(255) DEFAULT NULL,
  log_operation_type varchar(255) DEFAULT NULL,
  log_user_id int(11) DEFAULT NULL,
  log_user_name varchar(255) DEFAULT NULL,
  PRIMARY KEY (log_id)
);

-- ----------------------------
-- Table structure for tb_statistics
-- ----------------------------
DROP TABLE IF EXISTS tb_statistics;
CREATE TABLE tb_statistics (
  statistics_id bigint(20) NOT NULL,
  article_id int(11) DEFAULT NULL,
  read_count varchar(255) DEFAULT NULL,
  upvote varchar(255) DEFAULT NULL,
  PRIMARY KEY (statistics_id)
);

-- ----------------------------
-- Table structure for tb_tag
-- ----------------------------
DROP TABLE IF EXISTS tb_tag;
CREATE TABLE tb_tag (
  tag_id bigint(20) NOT NULL,
  created_by bigint(20) DEFAULT NULL,
  created_date DATETIME NULL DEFAULT NULL ,
  updated_by bigint(20) DEFAULT NULL,
  updated_date DATETIME NULL DEFAULT NULL ,
  tag_name varchar(255) DEFAULT NULL,
  tag_rel varchar(255) DEFAULT NULL,
  PRIMARY KEY (tag_id)
);

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS tb_user;
CREATE TABLE tb_user (
  user_id bigint(20) NOT NULL,
  user_account varchar(255) DEFAULT NULL,
  user_name varchar(255) DEFAULT NULL,
  user_pwd varchar(255) DEFAULT NULL,
  PRIMARY KEY (user_id)
) ;
