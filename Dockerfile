FROM  openjdk:17-oracle

EXPOSE 8080

ADD target/Product-0.0.1.jar Product-0.0.1.jar

ENTRYPOINT [ "java", "-jar","Product-0.0.1.jar" ]