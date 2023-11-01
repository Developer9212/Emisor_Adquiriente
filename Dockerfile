FROM openjdk:8
COPY target/EmisorAdquiriente-1.0.jar java-app.jar
ENTRYPOINT [ "java","-jar","/java-app.jar" ]