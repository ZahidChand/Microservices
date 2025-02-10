# Cloud Config Server

We are configuring our application config properties in `application.properties` or `application.yml` file.

Eg: DB Props, SMTP Props, Kafka Props, App Messages etc.

`application.properties` or `application.yml` file will be packaged along with our application (It will be part of the JAR file).

If we want to make any changes in our properties file, then we need to re-package and re-deploy the entire application again, which is time-consuming.

To avoid this, we need to separate our source code and project config properties files.

To externalize config properties from our application, we can use Spring Cloud Config Server.
