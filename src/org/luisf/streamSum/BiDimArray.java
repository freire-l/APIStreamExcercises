package org.luisf.streamSum;

import java.util.Arrays;
import java.util.stream.Stream;

public class BiDimArray {
    public static void main(String[] args) {
        String[][] languages = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Stream<String> flatLangs = Arrays.stream(languages).flatMap( a -> Stream.of(a)).distinct();

        System.out.println(flatLangs.reduce("Result = ", (a, b) -> a +" "+ b));
    }
}
