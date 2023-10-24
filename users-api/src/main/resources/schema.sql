CREATE TABLE users (
    dni BIGINT NOT NULL,
    name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(50) NOT NULL,
    rol VARCHAR(50) NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL,
    PRIMARY KEY(email)
);

INSERT INTO users (dni, name, last_name, email, password, rol, created_at, updated_at) VALUES
(111, "Admin", "Admin", "admin@test.com", "pass123", "ADMIN", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(111, "Andy", "Mayers", "andy@test.com", "pass123", "USER", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(111, "Myke", "Jhonson", "myke@test.com", "pass123", "USER", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
