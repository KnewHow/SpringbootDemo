CREATE TABLE customer(
    id INT AUTO_INCREMENT PRIMARY KEY ,
    phone_number varchar(32) NOT NULL,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    status tinyint NOT NULL default 0 COMMENT '0: normal -1: deleted',
    age tinyint,
    sex tinyint
);
ALTER TABLE customer ADD CONSTRAINT phone_number_idx UNIQUE(phone_number);
