CREATE DATABASE students_teachers;

CREATE TABLE persons(
    dni bigint not null,
    name varchar(50) not null,
    last_name varchar(50) not null,
    email varchar(100) not null,
    password varchar(50) not null,
    rol varchar(50) not null,
    created_at datetime not null,
    updated_at datetime not null,
    primary key(dni)
);

CREATE TABLE courses(
    id int not null auto_increment,
    name varchar(50) not null,
    primary key(id)
);

CREATE TABLE students_courses(
    student bigint not null,
    course int not null,
    foreign key(student) references persons(dni),
    foreign key(course) references courses(id),
    primary key(student, course)
);

CREATE TABLE teachers_students(
    teacher bigint not null,
    student bigint not null,
    foreign key(teacher) references persons(dni),
    foreign key(student) references persons(dni),
    primary key(teacher, student)
);

