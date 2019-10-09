address=10.62.229.205
java -jar dubbo-admin.jar --admin.config-center=zookeeper://${address}:2181 --admin.registry.address=zookeeper://${address}:2181 --admin.metadata-report.address=zookeeper://${address}:2181
