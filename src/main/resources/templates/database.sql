CREATE TABLE users (
    id bigint not null,
    name varchar(50) not null,
    last_name varchar(50) not null,
    email varchar(100) not null,
    password varchar(50) not null,
    rol varchar(50) not null,
    createdAt timestamp not null,
    updateAt timestamp not null,
    primary key(id,email)
);
