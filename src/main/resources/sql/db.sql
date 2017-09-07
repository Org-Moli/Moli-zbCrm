CREATE TABLE table_test(
  id int PRIMARY KEY AUTO_INCREMENT,
  tbName VARCHAR(20)
);
CREATE TABLE `log_icecoldmonitor` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `levels` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '优先级',
  `category` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '类目',
  `thread` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '进程',
  `time` varchar(30) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '时间',
  `location` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '位置',
  `note` text COLLATE utf8_bin COMMENT '日志信息',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
COMMIT;