%KAFKA_HOME%\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 3 --partitions 3 --topic products  --config min.insync.replicas=2