//El siguiente ejercicio es obtener el numero mayor de un arreglo pero
// utilizando programación funcional, implementando la expresión
// lambda Function<T,R> (que viene predefinida) con el api stream y operador reduce.

package org.luisf.streamSum;

import java.util.Arrays;
import java.util.function.Function;

public class StreamGreatestNum {
    public static void main(String[] args) {
        Integer[] numbers = {1,34,12,9,45,100,3,56,38,40};

        Function<Integer[], Integer> f1 =  a ->Arrays.stream(a).reduce(0, (b, c) -> (b > c? b : c));

        System.out.println("f1 = " + f1.apply(numbers));
    }

}
