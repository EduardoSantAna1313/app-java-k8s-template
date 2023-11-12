FROM eclipse-temurin:17

RUN mkdir /opt/app

EXPOSE 8080

COPY app/app.jar /opt/app

CMD ["java", "-jar", "/opt/app/app.jar"]