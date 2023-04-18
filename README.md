# Spring Boot Application by Anshi.A.S

Swagger: http://localhost:8080/swagger-ui/

Save Products using url params : POST
``````````````````````````````````````
http://localhost:8080/saveProducts?name=test&category=pencil&price=90&Description=testing


Save Products using request body : POST
````````````````````````````````````````
http://localhost:8080/products

Body:

{
"name":"test",
"category":"pen",
"price":80,
"description":"testing 2"
}