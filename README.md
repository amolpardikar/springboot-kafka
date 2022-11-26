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


# Other useful Kafka commands
-- Create topic
kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic temp

-- List topics
kafka-topics --list --bootstrap-server localhost:9092

-- Start the producer
kafka-console-producer --broker-list localhost:9092 --topic temp

-- Read message in consumer
kafka-console-consumer --bootstrap-server localhost:9092 --topic temp --from-beginning

-- Delete topic
kafka-run-class kafka.admin.TopicCommand --bootstrap-server localhost:9092 --delete --topic temp

# Tutorials
https://javatechonline.com/how-to-work-with-apache-kafka-in-spring-boot/?unapproved=5989&moderation-hash=aa026f5eef2bbd441ee65c2593e1a9d3#comment-5989

https://www.javainuse.com/spring/spring-boot-apache-kafka-hello-world

https://www.baeldung.com/spring-kafka
