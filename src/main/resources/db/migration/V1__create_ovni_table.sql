CREATE TABLE ovnis (
    id SERIAL PRIMARY KEY,
    location VARCHAR(255) NOT NULL,
    date TIMESTAMP NOT NULL,
    color VARCHAR(100),
    shape VARCHAR(20),
    quantity INTEGER NOT NULL
);