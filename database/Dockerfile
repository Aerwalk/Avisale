FROM postgres:13.3
LABEL maintainer="Aero" github="https://github.com/Aerwalk"
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=postgres
ENV PGDATA=/var/lib/postgresql/data/pgdata
COPY /docker/database/demo-small-20170815.sql /docker-entrypoint-initdb.d/
EXPOSE 5432