CREATE DATABASE IF NOT EXISTS mydb DEFAULT CHARACTER SET utf8;
USE mydb;

CREATE TABLE IF NOT EXISTS users (
  user_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(200),
  created_at DATETIME DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO users (name, email) VALUES ('홍길동', 'hong@example.com');
INSERT INTO users (name, email) VALUES ('김미경', 'mikyung@example.com');
