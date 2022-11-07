//Como desafió consiste en un arreglo de 100 elementos del 1 al 100, del tipo int,
// utilizando el api stream se pide eliminar los divisibles en 10, luego convertir
// los elementos restante del flujo en tipo double y dividirlos en 2, para finalmente
// devolver la suma total de todos ellos usando el operador terminal reduce. El resultado debería ser

package org.luisf.streamSum;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamSum {
    public static void main(String[] args) {
        Integer numbers[] = new Integer[100];
        int i = 1;

        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = i++;
        }

        /*
        Stream<Double> newNumbers = Stream.of(numbers)
                .map(a -> Double.valueOf(a))
                .filter(a -> ((a%10) != 0))
                .map(b -> b/2);
        System.out.println(" Sum = "+ newNumbers.reduce(0.0 , (c, d) -> c + d));

         */

        //With reference method
        Stream<Double> newNumbers = Stream.of(numbers)
                .map(Double::valueOf)
                .filter(a -> ((a%10) != 0))
                .map(b -> b/2);
        System.out.println(" Sum = "+ newNumbers.reduce(0.0 , (c, d) -> c + d));


    }
}
