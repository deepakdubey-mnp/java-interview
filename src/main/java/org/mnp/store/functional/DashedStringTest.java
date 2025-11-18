package org.mnp.store.functional;

import java.util.Optional;

public class DashedStringTest {
    public static void main(String[] args) {
        IO.print(dashedNum(123));
    }
    public static String dashedNum(int num){
        Optional<String>dashed= String.valueOf(num).chars()
                .mapToObj(ch->new String(String.valueOf((char)ch)))
                .reduce((a, b)->a+"-"+b);
       return dashed.get();

    }
}
