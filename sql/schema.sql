DROP TABLE IF EXISTS definition;
DROP TABLE IF EXISTS system_user;

CREATE TABLE definition
(
  id SERIAL PRIMARY KEY,
  name text,
  definition text
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
