FROM java:8
MAINTAINER JackieChan
VOLUME /tmp
RUN mkdir -p /opt/software/
ADD springdocker-0.0.1.jar /opt/software/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/opt/software/demo.jar"]