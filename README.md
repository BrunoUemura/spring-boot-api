## Spring Boot API
A simple API built with Spring Boot. \
In this API you can manage students information in a database:
- **INSERT** students information to the database.
- **RETRIEVE** students information from the database
- **UPDATE** students information in the database.
- **DELETE** students information from the database.

## Technologies
- Java
- Spring Boot
- PostgreSQL

## Build the project
1. Delete `target` folder.
2. Open `Maven` and execute the `Lifecycle/install`. This will generate a new target folder with `.jar` inside it.
3. From the terminal navigate to the `target` folder and execute the .jar file by using the following command:
```bash
java -jar demo-0.0.1-SNAPSHOT.jar
```
4. If you want to execute the project in a specific port run the following command:
```bash
java -jar demo-0.0.1-SNAPSHOT.jar --server.port=8081
```

## Endpoints
- `GET` - http://localhost:8080/api/v1/student
- `POST` - http://localhost:8080/api/v1/student \
  It is necessary to pass the body in json like the following:
  ```json
  {
  "name": "Linus Torvalds",
  "email": "linus.torvalds@gmail.com",
  "dob": "1969-12-28 "
  }
  ```
- `PUT` - http://localhost:8080/api/v1/student/<studentId>?name=<new name>&email=<new email>
- `DELETE` - http://localhost:8080/api/v1/student/<studentId>

## Author
- Bruno Hideki Uemura [linkedin](https://www.linkedin.com/in/bruno-hideki-uemura-918589139/), [Github](https://github.com/BrunoUemura)