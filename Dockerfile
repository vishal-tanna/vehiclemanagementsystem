FROM maven:3.6.3-jdk-11-slim AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn clean install

FROM openjdk:11
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/*.jar /app/app.jar

ENTRYPOINT ["java","-jar","/app.jar", "--spring.profiles.active=prod"]