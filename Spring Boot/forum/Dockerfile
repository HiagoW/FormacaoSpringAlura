FROM adoptopenjdk/openjdk11:alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
#Para rodar no heroku: ENTRYPOINT ["java","-Xmx512m","-Dserver.port=${PORT}","-jar","/app.jar"]