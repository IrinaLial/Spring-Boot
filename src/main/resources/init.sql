-- auto-generated definition
CREATE TABLE todo
(
  id     BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  name   VARCHAR(255) NULL,
  status VARCHAR(255) NULL
)
  ENGINE = InnoDB;