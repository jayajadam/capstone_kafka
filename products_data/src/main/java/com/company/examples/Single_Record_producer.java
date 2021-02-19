package com.company.examples;


import com.company.examples.serde.JsonSerializer;
import com.company.examples.types.products;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class Single_Record_producer {

    public static void main(String[] args) {

        String bootstrapServers = "127.0.0.1:9092";
        String topic = "products";

        // create Producer properties
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class.getName());

        // create the producer
        KafkaProducer<String, products> producer = new KafkaProducer<String, products>(properties);
        products t1 = new products();
        t1.withPogId("345");
        t1.withSupc("236");
        t1.withBrand("Apple");
        t1.withDescription("Iphone");
        t1.withSize("5inch");
        t1.withCategory("test1");
        t1.withSubCategory("test2");
        t1.withPrice(5000.00);
        t1.withQuantity(300);
        t1.withCountry("USA");
        t1.withSellerCode("AppleInc");
        t1.withCreationtime("");
        t1.withStock(500);

//        t1.withTxnID("t2");
//        t1.withTxnDate("1231212");
//        t1.withCustID("c1");
//        t1.withTxnAmount(100.0);
//        t1.withProdCat("p1");
//        t1.withProduct("Phone");
//        t1.withCity("Mumbai");
//        t1.withState("MH");
//        t1.withPaymentMode("aa");

        ProducerRecord<String, products> record =
                new ProducerRecord<String, products>(topic,  t1.getPogId() , t1);

        // send data - asynchronous
        producer.send(record);

        // flush data
        producer.flush();
        // flush and close producer
        producer.close();

    }
}
