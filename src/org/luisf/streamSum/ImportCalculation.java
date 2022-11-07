//El siguiente requerimiento es para una lista de productos List<Producto> ,
// de 3 a 5 elementos, se pide calcular el importe (precio por cantidad) y sumarlos.
//
//La clase Producto debe tener el atributo precio del tipo double y cantidad int,
// entonces utilizando stream convertir la lista de productos en el gran total del tipo double.

package org.luisf.streamSum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ImportCalculation {
    public static void main(String[] args) {
        List<Product> products= new ArrayList<Product>();

        products.add(new Product(3, 6.5));
        products.add(new Product(2, 9.90));
        products.add(new Product(5, 4.12));
        products.add(new Product(3, 1.75));

        Stream<Double> productTotals = products.stream().map(a -> a.getPrice() * Double.valueOf(a.getQuantity()));

        System.out.println("Total = " + productTotals.reduce(0.0, (b, c) -> b + c));
    }
}
