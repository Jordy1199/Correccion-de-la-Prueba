public class DronLiviano extends Dron {
    private double limiteHoras;

    public DronLiviano() {
        this.codigo = "DL-000";
        this.modelo = "LivianoX";
        this.distanciaKm = 5.0;
        this.pesoPaquete = 2.0;
        this.horasVuelo = 1.0;
        this.costoBase = 3.00;
        this.limiteHoras = 2.0;
    }

    public double getLimiteHoras() { return limiteHoras; }

    public void setPesoPaquete(double pesoPaquete) {
        if (pesoPaquete > 0 && pesoPaquete <= 5) {
            this.pesoPaquete = pesoPaquete;
        } else {
            System.out.println("ERROR: El peso excede el límite permitido (5 kg).");
        }
    }

    @Override
    public void setHorasVuelo(double horasVuelo) {
        if (horasVuelo > 0 && horasVuelo <= limiteHoras) {
            this.horasVuelo = horasVuelo;
        } else {
            System.out.println("ERROR: Las horas superan el límite permitido (" + limiteHoras + " h).");
        }
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (distanciaKm * 0.80) + (pesoPaquete * 0.50);
    }

    @Override
    public boolean validarDatos() {
        return pesoPaquete > 0 && pesoPaquete <= 5 && horasVuelo > 0 && horasVuelo <= limiteHoras;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("====== DRON LIVIANO ======");
        System.out.println("Código       : " + codigo);
        System.out.println("Modelo       : " + modelo);
        System.out.println("Distancia    : " + distanciaKm + " km");
        System.out.println("Peso paquete : " + pesoPaquete + " kg");
        System.out.println("Horas vuelo  : " + horasVuelo + " h");
        System.out.println("Carga máxima : 5.0 kg | Horas máximas: " + limiteHoras + " h");
        System.out.println("Costo base   : $" + costoBase);
        System.out.println("Costo entrega: $" + String.format("%.2f", calcularCostoEntrega()));
    }
}
