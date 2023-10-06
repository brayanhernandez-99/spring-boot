CREATE TABLE users (
    id bigint primary key,
    name varchar(50) not null,
    last_name varchar(50) not null,
    email varchar(255) not null,
    password varchar(50) not null,
    phone varchar(20) not null,
    age smallint(3) not null
);
x