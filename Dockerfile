FROM bellsoft/liberica-openjdk-alpine-musl:latest
LABEL maintainer="Aero" github="https://github.com/Aerwalk"
ARG JAR_FILE=target/aviasale.jar
WORKDIR /opt/aviasale
COPY  /target/aviasale.jar .
EXPOSE 6060
ENTRYPOINT ["java", "-jar", "aviasale.jar"]