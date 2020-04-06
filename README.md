Project Spring Base
=======================
A sample project following Domain Driven Design com Spring Data JPA

                                            (C) Marcos Moura, 08/03/2020

In this project I am trying to apply principles of Domain Driven Design.
In contrary to full-blown DDD examples on the web I am applying here some simplifications.
This sample application is used for a course on Software Engineering at Beuth University of Applied Sciences Berlin.

This project uses

- JDK 8
- Maven 3
- Spring Boot
- Spring Data + JPA + Hibernate + MySql

Detailed version indications you can find in the file `pom.xml`.

By  `mvn clean test`   all necessary libraries will be fetched, the project will be compiled, exception message texts will be collected and the test suite will be executed.

After this is working you can import the Maven project into your Java IDE.
You can run the application (a REST server) in your IDE by running class `*.Application` or on the command line after `mvn package` by `java -jar target/"nome_da_aplicação"-0.1-SNAPSHOT.jar`. In the last lines of the log you will see the number of the port (usually 8080), on which the server will listen. You can stop it by typing &lt;Ctrl/c&gt;.

## Which DDD principles are implemented?

## Other Characteristics

### Where are the exception message texts?

## Plans

## References and Sources

- [Detailed example text about DDD](https://www.mirkosertic.de/blog/2013/04/domain-driven-design-example/)
- [The DDD Sample project](https://github.com/citerus/dddsample-core), from which are taken some inspirations
- [The Ports and Adapters Pattern](http://alistair.cockburn.us/Hexagonal+architecture)
- [Can DDD be Adequately Implemented Without DI and AOP?](https://www.infoq.com/news/2008/02/ddd-di-aop)
- [Spring Boot](https://spring.io/guides/gs/spring-boot/)
- [Spring Dependency Injection](http://projects.spring.io/spring-framework/)
- [Spring Data JPA](https://spring.io/guides/gs/accessing-data-jpa/)
- [Spring Data JPA Query Methods](http://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods)
- This application implements my knowledge about layering and data access at a given point of time. Previous versions were in a 3-layer form in german under [Bank3Tier - Bankanwendung in 3 Schichten](http://public.beuth-hochschule.de/~knabe/java/bank3tier/).
# WWS 
WorkingWithSpringDB 
