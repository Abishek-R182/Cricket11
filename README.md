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
2. **Navigate to the Docker Compose:** To run the app using Docker Compose, refer to the Docker Compose file
   <a href="https://github.com/Abishek-R182/Cricket11/blob/master/src/main/resources/docker-compose.yml">Docker Compose File</a>

3. **Run the application:** Execute the following command in your terminal:
   ```bash
   docker-compose up -d
   
4. **Access the Application:** The application will be accessible at your public IP Address. like 00.00.000.000/getresult

## Postgres Database Setup

> Postgres Database table setup for my Project 

![Screenshot (112)](https://github.com/Abishek-R182/Cricket11/assets/113702399/30ed00ec-5cbf-4908-9504-482785d3d740)

----
> Docker
To run the application using Docker Compose, follow these steps:

1. **Install Docker and Docker Compose:** Make sure you have Docker and Docker Compose installed on   
 your system. You can find installation instructions on the official Docker website: https://docs.docker.com/engine/install/.
2. **Navigate to the project directory:** Open a terminal window and navigate to the directory containing your `docker-compose.yml` file.
    
3. **Run the application:** Execute the following command in your terminal:

   ```bash
   docker-compose up -d



![Screenshot (114)](https://github.com/Abishek-R182/Cricket11/assets/113702399/5dc9539a-2939-4b47-a87f-cbc91a0d1749)
- If you come from the root directory (Cricket11), there is a file called Dockerfile where we have already set up the correct Docker image creation process for the project and as well as for the database.
- If you run the command below in your terminal, the image will be created.
-  The Command is "docker build -t cricket11 ."


----
>Result

![Screenshot (115)](https://github.com/Abishek-R182/Cricket11/assets/113702399/a9740bd1-f858-4365-9e66-c1a03b83b1ef)
- Final Output, Displaying the players points based on their performance of the Match.
