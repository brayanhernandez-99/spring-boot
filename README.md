# SPRING BOOT
This is example of how to implement a page with Spring Boot, Hibernate, JWT, API REST.

# Read Me First
The following was discovered as part of building this project:
- The Spring Boot was from '3.1.4'.
- The JVM was from '11' or higher.

## Basic SQL Instructions
This is a list of basic commands to interact with mysql.
- Create Database: CREATE DATABASE [name_db];
- Create User: CREATE USER [name_user]@[host] IDENTIFIED BY '[password]';
- Assign Permissions: GRANT ALL PRIVILEGES ON *.* TO [name_user]@[host];
- Apply Permissions: FLUSH PRIVILEGES;
- List Permissions: SHOW GRANTS FOR [name_user]@[host];
- Revoke Permissions: REVOKE ALL PRIVILEGES ON [name_db].[tables_db] FROM [name_user]@[host];
- List Users: SELECT user,host FROM mysql.user;
- Delete User: DELETE FROM mysql.user WHERE user = '[name_user]';
- List Database: SHOW [name_db];
- Use Database: USE [name_db];
- List Tables: SHOW TABLES;
- List Columns: SHOW COLUMNS FROM [name_table];



# Getting Started


### Reference Documentation
For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)


