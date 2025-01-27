FROM --platform=linux/amd64 maven:3.8.5-openjdk-17 AS build

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

FROM --platform=linux/amd64 openjdk:17-jdk-oracle

WORKDIR /app

COPY --from=build /app/target/jpa_rest_demo-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/jpa_rest_demo-0.0.1-SNAPSHOT.jar"]
