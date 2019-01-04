FROM java
#FROM example-java

# First compile HelloWorld.java
ADD HelloWorld.java /example/HelloWorld.java
WORKDIR /example
RUN javac ./HelloWorld.java

CMD echo $JAVA_OPTS
CMD echo $JAVA_OPTS; java $JAVA_OPTS -cp . HelloWorld

