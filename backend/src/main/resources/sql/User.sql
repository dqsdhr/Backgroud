-- auto Generated on 2021-01-26
-- DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    id          BIGINT(15)  NOT NULL AUTO_INCREMENT COMMENT 'key',
    gender      INT(11)     NOT NULL DEFAULT -1 COMMENT 'gender of user 0-unset 1-male 2-female',
    username    VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'user name for login',
    auth_key    VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'password in MD5 with salt',
    nickname    VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'user nickname',
    real_name   VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'user real name',
    avatar_url  VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'user head portrait url',
    mobile      VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'user mobile phone number in',
    create_time DATETIME    NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'data create time',
    update_time TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'data update time',
    `timestamp` TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'dba use',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'user';
