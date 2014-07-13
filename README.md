# Album Manager

This application is a Spring Web aplication.

## Preamble

The following application combines Spring, Hibernate, and MySQL.

## About

The application heavily uses autowiring to inject beans. The SERVICE layer is used to map DTO objects to their ENTITY counterparts which will then be sent to the DAO layer where spring-data's REPOSITORY interfaces will handle DATABASE CRUD operations.

### Project Dependencies

* Spring 3.2.6.RELEASE
* Hibernate 4.2.2.Final
* MySQL