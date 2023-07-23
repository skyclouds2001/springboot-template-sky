FROM openjdk:17

COPY *.jar /app.jar

ENV JAVA_OPTS="\
-server \
-Xms256m \
-Xmx512m \
-XX:MetaspaceSize=256m \
-XX:MaxMetaspaceSize=512m"

ENV PARAMS=""

ENTRYPOINT ["sh","-c","java -jar $JAVA_OPTS app.jar $PARAMS"]
