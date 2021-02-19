package com.company.examples;

import com.company.examples.serde.AppSerdes;

import com.company.examples.types.AppConfigs;
import com.company.examples.types.out_prod;
import com.company.examples.types.products;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;

public class consumer_out {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "consumer_out");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

        StreamsBuilder streamsBuilder = new StreamsBuilder();


        KStream<String, products> KS0 = streamsBuilder.stream("products", Consumed.with(AppSerdes.String(), AppSerdes.products()));

//Fetch only required Values pogid, supc, price, quantity

        KStream<String, out_prod> KS1 = KS0.map((key, products)->new KeyValue<>(key,prod_outs.getprodout(products)));

//display the values
        KS1.print(Printed.<String, out_prod>toSysOut().withLabel("KS1"));
//Move the values to a prodout topic
        KS1.to(AppConfigs.OUTTOPIC,Produced.with(AppSerdes.String(),AppSerdes.out_prod()));


        KafkaStreams streams = new KafkaStreams(streamsBuilder.build(), props);
        streams.start();


        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            logger.info("Stopping Streams");
            streams.cleanUp();
        }));
    }


}



