public class CambioDeMoneda {
    private String monedaPrincipal;
    private String monedaDeCambio;
    private double monedaPrincipalValor;
    private double monedaDeCambioValor;

    public CambioDeMoneda(Conversion conversion, String monedaCambio) {
        this.monedaPrincipal = conversion.base_code();
        this.monedaDeCambio = monedaCambio;
        this.monedaDeCambioValor = (double) conversion.conversion_rates().get(monedaDeCambio);
    }

    public double ConversionMoneda(double moneda){
        monedaPrincipalValor = moneda;
        return moneda*monedaDeCambioValor;
    }

    @Override
    public String toString() {
        return "Moneda Principal: "+monedaPrincipal+
                "\nModeda de Cambio: "+monedaDeCambio+
                "\nModeda Principal Valor: "+monedaPrincipalValor+
                "\nModeda de Cambio Valor: "+monedaDeCambioValor;
    }
}
