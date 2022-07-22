/*
 Navicat MySQL Data Transfer

 Source Server         : 01
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : phone_crm

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 20/10/2021 22:47:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for business
-- ----------------------------
DROP TABLE IF EXISTS `business`;
CREATE TABLE `business`  (
  `b_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `b_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `b_expirationdate` datetime(6) NULL DEFAULT NULL,
  `b_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `b_id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`b_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of business
-- ----------------------------
INSERT INTO `business` VALUES (' 19876', '密密麻麻', '2021-07-01 00:54:59.000000', '那你呢', 3);
INSERT INTO `business` VALUES (' 1234567890', ' 我说的', '2021-06-26 14:25:17.000000', '反反复复分', 4);
INSERT INTO `business` VALUES ('235454355', ' 飞飞飞', '2021-06-25 14:25:45.000000', '那你没弄明白', 5);
INSERT INTO `business` VALUES ('1872746', '绝了都', '2021-07-29 15:52:46.000000', '鹅鹅鹅发放东西', 6);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `o_time` datetime(6) NULL DEFAULT NULL,
  `o_id` int NOT NULL AUTO_INCREMENT,
  `o_subtotal` decimal(10, 2) NULL DEFAULT NULL,
  `ph_id` int NULL DEFAULT NULL,
  `u_id` int NULL DEFAULT NULL,
  `o_evaluation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  ` o_num` int NULL DEFAULT NULL,
  PRIMARY KEY (`o_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for phone
-- ----------------------------
DROP TABLE IF EXISTS `phone`;
CREATE TABLE `phone`  (
  `ph_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ph_inventory` int NULL DEFAULT NULL,
  `ph_evaluation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ph_unitprice` decimal(10, 2) NULL DEFAULT NULL,
  `ph_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ph_num` int NULL DEFAULT NULL,
  `ph_subtotal` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ph_id` int NOT NULL AUTO_INCREMENT,
  `ph_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`ph_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of phone
-- ----------------------------
INSERT INTO `phone` VALUES ('images\\phone\\a.jpg', 9, NULL, 4899.00, '小米1', 0, NULL, 1, '2001-01-01 00:00:00');
INSERT INTO `phone` VALUES ('images\\phone\\b.jpg', 10, NULL, 4499.00, '小米2', 0, NULL, 2, '2001-01-02 00:00:00');
INSERT INTO `phone` VALUES ('images\\phone\\c.png', 10, NULL, 4899.00, '小米3', 0, NULL, 3, '2001-01-03 00:00:00');
INSERT INTO `phone` VALUES ('images\\phone\\d.png', 10, NULL, 4999.00, '小米4', 0, NULL, 4, '2001-01-04 00:00:00');
INSERT INTO `phone` VALUES ('images\\phone\\e.png', 10, NULL, 4599.00, '小米5', 0, NULL, 5, '2001-01-05 00:00:00');
INSERT INTO `phone` VALUES ('images\\phone\\f.png', 10, NULL, 4699.00, '小米6', 0, NULL, 6, '2001-01-06 00:00:00');
INSERT INTO `phone` VALUES ('images\\phone\\g.png', 10, NULL, 4399.00, '小米7', 0, NULL, 7, '2001-01-07 00:00:00');
INSERT INTO `phone` VALUES ('images\\phone\\h.png', 10, NULL, 4399.00, '小米8', 0, NULL, 8, '2001-01-08 00:00:00');
INSERT INTO `phone` VALUES ('images\\phone\\i.png', 10, NULL, 4699.00, '小米9', 0, NULL, 9, '2001-01-09 00:00:00');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `u_id` int NOT NULL AUTO_INCREMENT,
  `u_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '555', '123456', '无', '0');
INSERT INTO `users` VALUES (2, '666', '12345', '我问问', '123456');
INSERT INTO `users` VALUES (3, '777', '1234', '放放风', '12345678');
INSERT INTO `users` VALUES (4, '888', '278278', '对对对', '0');

SET FOREIGN_KEY_CHECKS = 1;
