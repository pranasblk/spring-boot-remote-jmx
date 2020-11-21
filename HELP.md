# Testing of remote access to JMX endpoint
To access localhost (network interface of k8s pod) set environment variables:
JAVA_TOOL_OPTIONS=-Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=9010 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=localhost

Access via e.g. ```jconsole``` via ``localhost:9010``