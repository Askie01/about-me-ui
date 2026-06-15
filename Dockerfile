FROM eclipse-temurin:25-jre-jammy

RUN apt-get update \
 && apt-get install -y --no-install-recommends curl \
 && rm -rf /var/lib/apt/lists/* \
 && useradd -ms /bin/bash appuser

USER appuser
WORKDIR /app

COPY --chown=appuser:appuser target/about-me-ui-0.0.1-SNAPSHOT.jar /app/app.jar

COPY --chown=appuser:appuser target/*.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]