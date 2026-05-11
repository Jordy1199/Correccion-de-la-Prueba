public class DronEmergencia extends Dron {
    private double recargoUrgencia;
    private int nivelPrioridad;

    public DronEmergencia() {
        this.codigo = "DE-000";
        this.modelo = "Emergente";
        this.distanciaKm = 5.0;
        this.pesoPaquete = 2.0;
        this.horasVuelo = 1.0;
        this.costoBase = 8.00;
        this.recargoUrgencia = 10.0;
        this.nivelPrioridad = 2;
    }

    public double getRecargoUrgencia() { return recargoUrgencia; }
    public int getNivelPrioridad() { return nivelPrioridad; }

    public void setRecargoUrgencia(double recargoUrgencia) {
        if (recargoUrgencia >= 0) {
            this.recargoUrgencia = recargoUrgencia;
        }
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        if (nivelPrioridad >= 1 && nivelPrioridad <= 3) {
            this.nivelPrioridad = nivelPrioridad;
        } else {
            System.out.println("ERROR: El nivel de prioridad debe estar entre 1 y 3.");
        }
    }

    public void setPesoPaquete(double pesoPaquete) {
        if (pesoPaquete > 0 && pesoPaquete <= 10) {
            this.pesoPaquete = pesoPaquete;
        } else {
            System.out.println("ERROR: El peso excede el límite permitido (10 kg).");
        }
    }

    @Override
    public void setHorasVuelo(double horasVuelo) {
        if (horasVuelo > 0 && horasVuelo <= 3) {
            this.horasVuelo = horasVuelo;
        } else {
            System.out.println("ERROR: Las horas superan el límite permitido (3 h).");
        }
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (distanciaKm * 1.50) + (pesoPaquete * 0.90) + recargoUrgencia;
    }

    @Override
    public boolean validarDatos() {
        return pesoPaquete > 0 && pesoPaquete <= 10 && horasVuelo > 0 && horasVuelo <= 3
                && nivelPrioridad >= 1 && nivelPrioridad <= 3;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("====== DRON EMERGENCIA ======");
        System.out.println("Código           : " + codigo);
        System.out.println("Modelo           : " + modelo);
        System.out.println("Distancia        : " + distanciaKm + " km");
        System.out.println("Peso paquete     : " + pesoPaquete + " kg");
        System.out.println("Horas vuelo      : " + horasVuelo + " h");
        System.out.println("Recargo urgencia : $" + recargoUrgencia);
        System.out.println("Nivel prioridad  : " + nivelPrioridad);
        System.out.println("Carga máxima     : 10.0 kg | Horas máximas: 3 h");
        System.out.println("Costo base       : $" + costoBase);
        System.out.println("Costo entrega    : $" + String.format("%.2f", calcularCostoEntrega()));
    }
}
