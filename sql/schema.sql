DROP TABLE IF EXISTS definition;
DROP TABLE IF EXISTS system_user;

CREATE TABLE definition
(
  id SERIAL PRIMARY KEY,
  name varchar(50),
  definition text,
  description varchar(200),
  tag varchar(20)
);

CREATE TABLE system_user
(
  id SERIAL PRIMARY KEY,
  email varchar(20),
  name varchar(50),
  enabled bit,
  password varchar(50),
  user_role varchar(20)
);
