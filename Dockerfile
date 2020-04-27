FROM java:8
EXPOSE 8000
#ADD Application.java .
#RUN javac 'src/main/java/com/tatana/trisha/Application.java'
CMD ["-jar", "Trisha-1.0-SNAPSHOT.jar"]
