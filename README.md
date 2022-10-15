# springboot-kafka
Spring boot kafka zookeeper 

## Steps
# Start zookeeper

$ zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties

# Start kafka

$ kafka-server-start /usr/local/etc/kafka/server.properties

# Start the Kafka consumer

$ kafka-console-consumer --bootstrap-server localhost:9092 --topic test --from-beginning

# Run the spring boot application and make the requests

http://localhost:9090/send?name=Amol&dept=ITSupport&sal=20000

http://localhost:9090/getAll
