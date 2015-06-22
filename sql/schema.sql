CREATE TABLE Definition
(
  id SERIAL PRIMARY KEY,
  name text,
  definition text
)
WITH (
  OIDS=FALSE
);
ALTER TABLE Definition
  OWNER TO postgres;