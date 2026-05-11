public class DronCarga extends Dron {
    private double costoPorKg;

    public DronCarga() {
        this.codigo = "DC-000";
        this.modelo = "CargaMax";
        this.distanciaKm = 5.0;
        this.pesoPaquete = 2.0;
        this.horasVuelo = 1.0;
        this.costoBase = 6.00;
        this.costoPorKg = 1.20;
    }

    public double getCostoPorKg() { return costoPorKg; }

    public void setPesoPaquete(double pesoPaquete) {
        if (pesoPaquete > 0 && pesoPaquete <= 30) {
            this.pesoPaquete = pesoPaquete;
        } else {
            System.out.println("ERROR: El peso excede el límite permitido (30 kg).");
        }
    }

    @Override
    public void setHorasVuelo(double horasVuelo) {
        if (horasVuelo > 0 && horasVuelo <= 5) {
            this.horasVuelo = horasVuelo;
        } else {
            System.out.println("ERROR: Las horas superan el límite permitido (5 h).");
        }
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (distanciaKm * 1.20) + (pesoPaquete * costoPorKg);
    }

    @Override
    public boolean validarDatos() {
        return pesoPaquete > 0 && pesoPaquete <= 30 && horasVuelo > 0 && horasVuelo <= 5;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("====== DRON CARGA ======");
        System.out.println("Código       : " + codigo);
        System.out.println("Modelo       : " + modelo);
        System.out.println("Distancia    : " + distanciaKm + " km");
        System.out.println("Peso paquete : " + pesoPaquete + " kg");
        System.out.println("Horas vuelo  : " + horasVuelo + " h");
        System.out.println("Carga máxima : 30.0 kg | Horas máximas: 5 h");
        System.out.println("Costo base   : $" + costoBase);
        System.out.println("Costo entrega: $" + String.format("%.2f", calcularCostoEntrega()));
    }
}