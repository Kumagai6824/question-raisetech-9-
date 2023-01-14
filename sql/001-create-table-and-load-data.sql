DROP TABLE IF EXISTS goods;

CREATE TABLE goods (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  cost int NOT NULL,
  stock int NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO goods (name, cost, stock) VALUES (1, "Helical gear", 200, 1000);
INSERT INTO goods (name, cost, stock) VALUES (1, "Button screw", 5, 2000);
