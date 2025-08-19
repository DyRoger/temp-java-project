# Spring Boot GCP Demo

This is a simple Spring Boot backend project with two endpoints:
- `/hello`: Returns a greeting message.
- `/status`: Returns a status message.

## How to Run Locally

1. Make sure you have Java 17+ and Maven installed.
2. Run the following command in the project root:
   ```
   mvn spring-boot:run
   ```
3. Access endpoints at `http://localhost:8080/hello` and `http://localhost:8080/status`.

## Deployment to GCP Free Instance

You can deploy this project to Google Cloud Platform's free tier using Cloud Run or App Engine. See [GCP documentation](https://cloud.google.com/java/spring) for details.
