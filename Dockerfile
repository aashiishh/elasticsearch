FROM amazoncorretto:17

ADD build/libs/elasticsearch-0.0.1.jar elasticsearch.jar

ENTRYPOINT ["sh", "-c", "java -jar elasticsearch-0.0.1.jar"]