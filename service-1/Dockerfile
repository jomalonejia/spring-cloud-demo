FROM java:8

ADD ./target/service-1-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/service-1-0.0.1-SNAPSHOT.jar"]

EXPOSE 8088