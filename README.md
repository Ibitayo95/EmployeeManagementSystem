Project notes:
--

**What is this?**

A mockup of a very rudimentary employee management system in
which you can add / delete employees, update their details
etc. The idea is that you log in, and if you have admin access, then when interacting with the UI, you can manipulate the employees in the
database.

**What is being used:**

- Java Springboot - backend framework
- Springboot JPA - for using object relational mapping and database connectivity
- MySQL database
- Thymeleaf - for template interface using HTML/CSS
- Spring Security - for user authentication and authorization

**Folder/Package set up**

- Controller - for rest controller that determine what is shown at certain api endpoints
- Model - for Employee class, which using JPA is used to create table in database schema
- Repository - to perform operations on database
- Service - 'business logic'
- Security - set up configuration so that authorization and authentication is configured
- /Resources/templates - HTML files for entering data




