FROM openjdk:17-jre-slim

WORKDIR /app

COPY ../backend-code/target/checkout.jar ./

EXPOSE 8080

CMD ["java", "-jar", "checkout.jar"]