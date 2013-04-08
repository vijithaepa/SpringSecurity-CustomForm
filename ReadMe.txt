This contains the set of instructions required to build and run the Spring Security application.

This application demonstrate the simple usage of Java Spring security Custom Login Form Authentication. Application has developed using Spring MVC pattern.

Contents :
==========
.
├── DB_scripts
│   └── initial_script.sql
├── pom.xml
├── ReadMe.txt
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── security
    │   │           └── sample
    │   │               └── controler
    │   │                   └── LoginController.java
    │   ├── resources
    │   │   └── mymessages.properties
    │   └── webapp
    │       ├── index.jsp
    │       └── WEB-INF
    │           ├── applicationContext.xml
    │           ├── mvc-dispatcher-servlet.xml
    │           ├── pages
    │           │   ├── css
    │           │   │   └── style.css
    │           │   ├── hello.jsp
    │           │   ├── login.html
    │           │   └── login.jsp
    │           ├── spring-security.xml
    │           └── web.xml



Building the Project.
====================

Pre-requisites
--------------
JDK 1.6.x or higher
Maven 2 or higher
set java_home and m2_home.
Tomcat 5.X or highr

Steps:
------
1 - Download the websecurity project to a local environment
2 - Go to the project home directory /websecurityForm, and run 
    - mvn clean package
    - This might take a few seconds to download all the dependencies to your local M2 repo.

Running the application.
========================
1 - Copy the websecurity.war from websecurityForm/Target/ to <Tomcat_Home>/webapps/ 
2 - Bring up the Tomcat Server (ex : ./catelina.sh run)
3 - Access the URL "http://localhost:8080/welcome" on a web browser
4 - Enter credentials as vijitha/epa123 and login




