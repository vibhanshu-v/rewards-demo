# rewards-demo

The service populate h2 db with data.sql file

Environment:
JAVA 11

To build the application:
mvn clean install

To run the service use below command:
mvn spring-boot:run

To Get All customers:
curl -X GET -H 'Accept: application/json' -H 'Content-Type: application/json' -i http://localhost:9000/customers

To get Customere having id = 101
curl -X GET -H 'Accept: application/json' -H 'Content-Type: application/json' -i http://localhost:9000/customers/101


