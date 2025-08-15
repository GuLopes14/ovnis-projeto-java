CREATE TABLE ovnis (
    id SERIAL PRIMARY KEY,
    localizacao VARCHAR(255) NOT NULL,
    data VARCHAR(255) NOT NULL,
    descricao TEXT
);