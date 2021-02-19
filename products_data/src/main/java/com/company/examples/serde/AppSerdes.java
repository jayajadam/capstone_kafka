package com.company.examples.serde;

import com.company.examples.types.out_prod;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import com.company.examples.types.products;

import java.util.HashMap;
import java.util.Map;

public class AppSerdes extends Serdes {


    static final class productsSerde extends WrapperSerde<products> {
        productsSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }

    public static Serde<products> products() {
        productsSerde serde = new productsSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();

        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, products.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    static final class out_prodSerde extends WrapperSerde<out_prod> {
        out_prodSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }

    public static Serde<out_prod> out_prod() {
        out_prodSerde serde = new out_prodSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();

        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, out_prod.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }


}
