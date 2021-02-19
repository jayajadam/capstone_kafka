package com.company.examples;

import com.company.examples.types.out_prod;
import com.company.examples.types.products;

class prod_outs {


        static out_prod getprodout(products P) {
            return new out_prod()
                    .withPogId(P.getPogId())
                    .withSupc(P.getSupc())
                    .withPrice(P.getPrice())
                    .withQuantity(P.getQuantity());
        }


}
