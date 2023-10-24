CREATE TABLE users (
    dni bigint not null,
    name varchar(50)not null,
    last_name varchar(50)not null,
    email varchar(100)not null,
    password varchar(50)not null,
    rol varchar(50)not null,
    created_at datetime not null,
    updated_at datetime not null,
    primary key(email)
);
