import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CambioDeMoneda cambioDeMoneda = null;
        String monedaPrincipal = null;
        String monedaCambio = null;

        Scanner lectura = new Scanner(System.in);
        ConsultaConversion consulta =new ConsultaConversion();

        int salir=0;
        while (salir !=7){
            try {
                System.out.println("\n*******************************************************");
                System.out.println("Sea bienvenido/a al Conversor de Moneda ;)\n");
                System.out.println("1) Dólar =>> Peso argentino" +
                        "\n2) Peso argentino =>> Dólar" +
                        "\n3) Dólar =>> Real brasileño" +
                        "\n4) Real brasileño =>> Dólar" +
                        "\n5) Dólar =>> Peso colombiano" +
                        "\n6) Peso colombiano =>> Dólar" +
                        "\n7) Dólar =>> Peso mexicano" +
                        "\n8) Peso mexicano =>> Dólar" +
                        "\n9) Salir");
                System.out.println("Elija una opcion válida");
                System.out.println("*******************************************************\n");

                int opcion = Integer.parseInt(lectura.next());

                if (opcion == 1) {
                    monedaPrincipal = "USD";
                    monedaCambio = "ARS";
                    Conversion conversion = consulta.seleccionMoneda(monedaPrincipal);
                    cambioDeMoneda = new CambioDeMoneda(conversion, monedaCambio);
                } else if (opcion == 2) {
                    monedaPrincipal = "ARS";
                    monedaCambio = "USD";
                    Conversion conversion = consulta.seleccionMoneda(monedaPrincipal);
                    cambioDeMoneda = new CambioDeMoneda(conversion, monedaCambio);
                } else if (opcion == 3) {
                    monedaPrincipal = "USD";
                    monedaCambio = "BRL";
                    Conversion conversion = consulta.seleccionMoneda(monedaPrincipal);
                    cambioDeMoneda = new CambioDeMoneda(conversion, monedaCambio);
                } else if (opcion == 4) {
                    monedaPrincipal = "BRL";
                    monedaCambio = "USD";
                    Conversion conversion = consulta.seleccionMoneda(monedaPrincipal);
                    cambioDeMoneda = new CambioDeMoneda(conversion, monedaCambio);
                } else if (opcion == 5) {
                    monedaPrincipal = "USD";
                    monedaCambio = "COP";
                    Conversion conversion = consulta.seleccionMoneda(monedaPrincipal);
                    cambioDeMoneda = new CambioDeMoneda(conversion, monedaCambio);
                } else if (opcion == 6) {
                    monedaPrincipal = "COP";
                    monedaCambio = "USD";
                    Conversion conversion = consulta.seleccionMoneda(monedaPrincipal);
                    cambioDeMoneda = new CambioDeMoneda(conversion, monedaCambio);
                } else if (opcion == 7) {
                    monedaPrincipal = "USD";
                    monedaCambio = "MXN";
                    Conversion conversion = consulta.seleccionMoneda(monedaPrincipal);
                    cambioDeMoneda = new CambioDeMoneda(conversion, monedaCambio);
                } else if (opcion == 8) {
                    monedaPrincipal = "MXN";
                    monedaCambio = "USD";
                    Conversion conversion = consulta.seleccionMoneda(monedaPrincipal);
                    cambioDeMoneda = new CambioDeMoneda(conversion, monedaCambio);
                } else if (opcion == 9){
                    System.out.println("Saliendo del programa");
                    break;
                } else {
                    System.out.println("Entrada invalida");
                    System.out.println("Cerrando programa");
                    break;
                }

                System.out.println("Ingresa el valor que deseas convertir:");
                double monedaPrincipalValor = Double.parseDouble(lectura.next());

                double monedaCambioDeValor = cambioDeMoneda.ConversionMoneda(monedaPrincipalValor);
                System.out.println("El valor de " + monedaPrincipalValor + " [" + monedaPrincipal + "]" +
                        " corresponde al valor final de =>> " + monedaCambioDeValor +
                        " [" + monedaCambio + "]");

            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
