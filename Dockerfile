FROM maven:3.9.4-eclipse-temurin-20 AS builder
WORKDIR /build
COPY pom.xml ./
COPY ./src ./src
RUN mvn clean package -q
 
 
FROM eclipse-temurin:20-jre-jammy
WORKDIR /app
EXPOSE 9001
COPY --from=builder /build/target/*.jar /app/*.jar
ENTRYPOINT ["java", "-jar", "/app/*.jar" ]