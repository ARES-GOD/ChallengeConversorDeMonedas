import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaConversion consulta =new ConsultaConversion();

        //Prueba de conversion: Dolar -- Peso argentino
        int salir=0;
        while (salir !=7){
            try {
                System.out.println("*******************************************************");
                System.out.println("Sea bienvenido/a al Conversor de Moneda ;)");
                System.out.println("1) Dólar =>> Peso argentino"+
                        "\n2) Peso argentino =>> Dólar"+
                        "\n3) Dólar =>> Real brasileño"+
                        "\n4) Real brasileño =>> Dólar"+
                        "\n5) Dólar =>> Peso colombiano"+
                        "\n6) Peso colombiano =>> Dólar"+
                        "\n7) Salir");
                System.out.println("Elija una opcion válida");
                System.out.println("*******************************************************");

                int opcion = Integer.parseInt(lectura.next());

                System.out.println("Ingresa el valor que deseas convertir: ");
                double monedaPrincipalValor = Double.parseDouble(lectura.next());

                if (opcion == 1){
                    String monedaPrincipal ="USD";
                    String monedaCambio = "ARS";
                    Conversion conversion =consulta.seleccionMoneda(monedaPrincipal);
                    CambioDeMoneda cambioDeMoneda = new CambioDeMoneda(conversion,monedaCambio);
                    System.out.println(cambioDeMoneda);
                    double monedaCambioDeValor = cambioDeMoneda.ConversionMoneda(monedaPrincipalValor);
                    System.out.println("El valor de "+monedaPrincipalValor+" ["+monedaPrincipal+"]"+
                            " corresponde al valor final de =>> "+monedaCambioDeValor+
                            " ["+monedaCambio+"]");
                } else {
                    salir = 7;
                }

            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
