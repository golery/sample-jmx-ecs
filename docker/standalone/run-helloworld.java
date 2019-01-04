JAVA_OPTS="-Dcom.sun.management.jmxremote \
        -Dcom.sun.management.jmxremote.port=8008 \
        -Dcom.sun.management.jmxremote.authenticate=false
        -Dcom.sun.management.jmxremote.ssl=false
        -Djava.net.preferIPv4Stack=true
        -Djava.rmi.server.hostname=127.0.0.1
        -Dcom.sun.management.jmxremote.rmi.port=8008
        -Dcom.sun.management.jmxremote.local.only=true"
        CMD java -cp . HelloWorld