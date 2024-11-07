import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;
        while (opcion != 7) {
            System.out.println(" ~_______________________________________~ ");
            System.out.println(" | B | I | E | N | V | E | N | I | D | O | ");
            System.out.println(" |___|___|___|___|___|___|___|___|___|___| ");
            System.out.println("""
                     | $  ~~ ¡Al Conversor de Monedas! ~~  $ |
                     |___|___|___|___|___|___|___|___|___|___|
                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                    1) Dolar =>> Peso Argentino
                    2) Peso Argentino =>> Dolar
                    3) Dolar =>> Real Brasileño
                    4) Real Brasileño =>> Dolar
                    5) Dolar =>> Peso Colombiano
                    6) Peso Colombiano =>> Dolar
                    7) Salir
                    Elija una Opción Valida:
                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                    """);
            opcion = lectura.nextInt();
            lectura.nextLine();

            if (opcion != 7) {
                System.out.println(""" 
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                Ingrese la cantidad a convertir:
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);
                double cantidad = lectura.nextDouble();
                lectura.nextLine();

                String monedaBase = "USD";
                String monedaDestino = "";

                switch (opcion) {
                    case 1 -> monedaDestino = "ARS";
                    case 2 -> {
                        monedaBase = "ARS";
                        monedaDestino = "USD";
                    }
                    case 3 -> monedaDestino = "BRL";
                    case 4 -> {
                        monedaBase = "BRL";
                        monedaDestino = "USD";
                    }
                    case 5 -> monedaDestino = "COP";
                    case 6 -> {
                        monedaBase = "COP";
                        monedaDestino = "USD";
                    }
                }

                Moneda tasas = consulta.consultaMoneda(monedaBase);
                if (tasas != null && tasas.conversion_rates().containsKey(monedaDestino)) {
                    double tasa = tasas.conversion_rates().get(monedaDestino);
                    double resultado = cantidad * tasa;
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(" El valor de: " + cantidad + " En moneda " + monedaBase +
                            "\n = Corresponde al valor de: " + resultado + " " + monedaDestino);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                } else {
                    System.out.println("No se pudo obtener la tasa de cam bio para la conversión solicitada.");
                }
            }
        }
    }
}
