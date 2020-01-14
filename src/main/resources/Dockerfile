FROM openjdk:8
COPY maven/EmployeeApi-0.0.1-SNAPSHOT.jar .
RUN echo $JAVA_HOME
ENTRYPOINT ["java", "-jar", "EmployeeApi-0.0.1-SNAPSHOT.jar"]
