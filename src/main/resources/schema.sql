


--
-- Table structure for table employee
--

DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  id int(11) auto_increment NOT NULL,
  firstname varchar(30) NOT NULL,
  lastname varchar(30) NOT NULL,
  username varchar(20) NOT NULL,
  password varchar(15) NOT NULL,
  email varchar(30) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY username (username,email)
);


DROP TABLE IF EXISTS role;

CREATE TABLE role (
  id int(11) auto_increment NOT NULL,
  roles varchar(15) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY roles (roles)
);


DROP TABLE IF EXISTS emp_roles_mapping;

CREATE TABLE emp_roles_mapping (
  id int(11)  auto_increment NOT NULL,
  emp_id int(11) NOT NULL,
  role_id int(11) NOT NULL,
  PRIMARY KEY (id),

  FOREIGN KEY (emp_id) REFERENCES employee (id),
  FOREIGN KEY (role_id) REFERENCES role (id)
);






DROP TABLE IF EXISTS time_track;

CREATE TABLE time_track (
  id int(11) auto_increment NOT NULL,
  logintime datetime DEFAULT NULL,
  logouttime datetime DEFAULT NULL,
  emp_id int(11) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (emp_id) REFERENCES employee (id),
);



