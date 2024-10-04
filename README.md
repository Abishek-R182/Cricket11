# Cricket11

## Introduction
Fantasy Cricket League is a web application built using Spring MVC, Docker, and PostgreSQL. It offers users the opportunity to create their own virtual cricket teams, composed of real-world players. The performance of these players in actual matches determines the points earned by the user's team.

## Technology Used
 - Java: The core programming language used for backend development.
 - Spring Boot: The framework used to build the application, providing dependency injection, MVC architecture, and more.
 - PostgreSQL: The relational database management system used for data storage.
 - Maven: The build tool used for managing project dependencies and packaging.
 - Git: Version control system for collaborative development.
 - Docker: Containerization platform to create, deploy, and run applications in containers.
 - Docker Compose: A tool for defining and running multi-container Docker applications.

## Setup and Installation
1. **Clone the Repository:**
   ```
   git clone https://github.com/Abishek-R182/Cricket11.git
   cd Cricket11

   ```
2. **Build and Run the Application:**
   ```
   mvn spring-boot:run
   ```

3. **Access the Application:**
   The application will be accessible at `http://localhost:8080`.
   
## Postgres Database Setup

> Postgres Database table setup for my Project 

![Screenshot (112)](https://github.com/Abishek-R182/Cricket11/assets/113702399/30ed00ec-5cbf-4908-9504-482785d3d740)

1. **Locate the SQL File:** The database schema and initial data are provided in the resources folder of the project.
  ```bash
  cd Cricket11/src/main/resources/
```
2. **Create the Database:**
Before running the application, ensure that PostgreSQL is installed and running on your system. You can create the database by executing the .sql file.

3. **Executing the SQL File:**
   ```bash
   psql -U <postgres> -d <postgres> -f Cricket11/src/main/resources/data-dream11.sql
   psql -U <postgres> -d <postgres> -f Cricket11/src/main/resources/data-players.sql
   psql -U <postgres> -d <postgres> -f Cricket11/src/main/resources/data-points.sql
   psql -U <postgres> -d <postgres> -f Cricket11/src/main/resources/data-result.sql
   psql -U <postgres> -d <postgres> -f Cricket11/src/main/resources/data-userdetails.sql
    ```


## Running with Docker Compose

To run the application using Docker Compose, follow these steps:

1. **Install Docker and Docker Compose:**
   Make sure you have Docker and Docker Compose installed on your machine. For instructions, visit the official Docker website: [https://docs.docker.com/get-docker/](https://docs.docker.com/get-docker/).
   
3. **Navigate to the Docker Compose:** To run the app using Docker Compose, refer to the Docker Compose file
   <a href="https://github.com/Abishek-R182/Cricket11/blob/master/src/main/resources/docker-compose.yml">Docker Compose File</a>

4. **Build and Run Docker Containers:**
   ```
   docker-compose up
   ```
   This will build and run the Docker containers defined in the `compose.yml` file. It includes the Spring Boot application and a PostgreSQL database container.

5. **Access the Application:** The application will be accessible at your public IP Address. like 00.00.000.000/getresult


## Docker Image

1. **Navigate to the Project Directory:** Go to the directory where the Dockerfile is located
   ``` bash
    cd Cricket11
   ```
2. **Build the Docker Image:** Build the Docker image using the following command.
   ```bash
   docker build -t cricket11:latest -f Dockerfile .
   ```
   This command creates a Docker image with the name cricket11 using the Dockerfile located in the Cricket11 directory.

3. **Run the Docker Container:** After the image is built, run the container
   ```bash
   docker run -d -p 8080:8080 cricket11:latest
   ```
   This command runs the container in detached mode (-d) and maps port 8080 of the container to port 8080 on your local machine.
   
5. **Access the Application:** Once the container is running, you can access the application by opening your browser.
   ```bash
   http://localhost:8080
   ```


   


## Result

![Screenshot (115)](https://github.com/Abishek-R182/Cricket11/assets/113702399/a9740bd1-f858-4365-9e66-c1a03b83b1ef)
- Final Output, Displaying the players points based on their performance of the Match.
