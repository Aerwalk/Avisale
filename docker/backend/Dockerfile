FROM bellsoft/liberica-openjdk-alpine-musl:latest
LABEL maintainer="Aero" github="https://github.com/Aerwalk"
ARG JAR_FILE=src/aviasale.jar
WORKDIR /opt/aviasale
COPY  ${JAR_FILE} .
EXPOSE 6060
ENTRYPOINT ["java", "-jar", "aviasale.jar"]