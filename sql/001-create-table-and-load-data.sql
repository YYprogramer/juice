DROP TABLE IF EXISTS juices;

CREATE TABLE juices (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  price INT NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO juices (name, price) VALUES ("コカ・コーラ", 180);
INSERT INTO juices (name, price) VALUES ("コーヒー", 100);
