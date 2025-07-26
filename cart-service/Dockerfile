FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/cart-service-1.0.0.jar cart-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "cart-service.jar"]
