#!/usr/bin/env bash
docker build --tag example-java-standalone .

# Then run it
export JMX="\
       -Dcom.sun.management.jmxremote \
       -Djava.rmi.server.hostname=172.17.0.3 \
       -Dcom.sun.management.jmxremote.port=9000 \
       -Dcom.sun.management.jmxremote.rmi.port=9000 \
       -Djava.net.preferIPv4Stack=true \
       \
       -Dcom.sun.management.jmxremote.authenticate=false \
       -Dcom.sun.management.jmxremote.ssl=false \
       -Dcom.sun.management.jmxremote.local.only=false"

docker run -it --rm -e "JAVA_OPTS=$JMX" -p 9000:9000 --name jmx example-java-standalone