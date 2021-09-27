https://www.youtube.com/watch?v=XrCtEL4QAAg&t=823s
refered the above video to create a table in postgres docker image

to execute application
make sure docker is running behind
mvn clean instal 
run the application 

reason to create this project if we need to use onetoone mapping in springboot we need to send whole class as setter or by adding other class json body in the linked class

this project helps you to solve that issue where you can directly send the primary key of the linked class in postrequest by postman 

logic is written in a way that it fetches address by the primary key and stores it address object and we set that using setter of user class

this is possible because of UserClientRequest class 

going through the code we can understand things easily
