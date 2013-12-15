ebankdo_r4_Jax-WS-1
========================
Banking R4. Java, JAX-WS, Spring 3, Hibernate 3.

Description:
-------------------
- eBankDo is an example of a non-existent Bank, Building in Java Web Application.

Functionalities: 
-------------------
- Customer card registration.

Technologies used:
-------------------
- Server Side Technology: Web Services (Jax-WS 2.2.11), Spring Framework 3.2.2.RELEASE, Hibernate 4.2.0.Final, Maven 2.
- Client Side Technology: N/A
- IDE: Eclipse Java EE IDE for Web Developers.

System requirements
-------------------

- OS: Linux, Mac or Windows
- Java 7(Java SDK 1.7.0_40-b32) or better
- Apache Tomcat 7.0.47. 


Start Tomcat
-------------------------

export TOMCAT_HOME=/Users/tomasjimenez/Documents/Software/apache-tomcat-7.0.47/

1. Open a command line and navigate to the root of the JBoss server directory.
2. The following shows the command line to start the server with the web profile:

        For Linux:   TOMCAT_HOME/bin/standalone.sh
        For Windows: TOMCAT_HOME\bin\standalone.bat

 
Build and Deploy
-------------------------

 - Generate WAR file
 - Create a DB: Setup/DB/ebankdo_r1_db_mysql.sql
 - Upload by Tomcat manager http://localhost:8080/manager/
 


Significant Note:
- Do not use this project to production without making the following changes.
  1) Make a good DB structure and tables like sequence, Auto Increment,constrains, index, view and normalization.
  2) Modified the Hibernate Properties "create-drop", if you used that, the production table be erase.
  3) Move the validation message to file.properties, so you can have the capacity of a multi language application.
  4) encrypt the user's password


Deploy and Testing in
---------------------
- Apache Tomcat 7.0.47. 
 
 
view the application 
---------------------

		http://localhost:8080/ebankdo-r4-JAX-WS-1/
		http://localhost:9999/CustomerService
		http://localhost:9999/CustomerService?wsdl


