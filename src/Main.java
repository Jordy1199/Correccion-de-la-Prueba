import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public Main() {}

    public static void main(String[] args) {
        DronLiviano dl = new DronLiviano();
        DronCarga dc = new DronCarga();
        DronEmergencia de = new DronEmergencia();

        System.out.println("=========== SISTEMA DE DRONES ===========");
        System.out.println("\n===== INFORMACIÓN INICIAL DE DRONES =====");
        dl.mostrarInformacion();
        System.out.println();
        dc.mostrarInformacion();
        System.out.println();
        de.mostrarInformacion();

        System.out.println("\n===== INGRESO DE NUEVOS DATOS =====");
        System.out.println("¿Qué dron desea actualizar?");
        System.out.println("1. Dron Liviano");
        System.out.println("2. Dron Carga");
        System.out.println("3. Dron Emergencia");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese código: ");
        String codigo = sc.nextLine();
        System.out.print("Ingrese modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Ingrese distancia (km): ");
        double distancia = sc.nextDouble();
        System.out.print("Ingrese peso del paquete (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese horas de vuelo: ");
        double horas = sc.nextDouble();

        if (opcion == 1) {
            dl.setCodigo(codigo);
            dl.setModelo(modelo);
            dl.setDistanciaKm(distancia);
            dl.setPesoPaquete(peso);
            dl.setHorasVuelo(horas);
            System.out.println("\nValidando datos...");
            if (dl.validarDatos()) {
                System.out.println("Datos correctos.");
                System.out.println("Calculando costo...\n");
                System.out.println("===== INFORMACIÓN ACTUALIZADA =====");
                dl.mostrarInformacion();
            } else {
                System.out.println("ERROR: Datos inválidos. No se guardaron los cambios.");
            }

        } else if (opcion == 2) {
            dc.setCodigo(codigo);
            dc.setModelo(modelo);
            dc.setDistanciaKm(distancia);
            dc.setPesoPaquete(peso);
            dc.setHorasVuelo(horas);
            System.out.println("\nValidando datos...");
            if (dc.validarDatos()) {
                System.out.println("Datos correctos.");
                System.out.println("Calculando costo...\n");
                System.out.println("===== INFORMACIÓN ACTUALIZADA =====");
                dc.mostrarInformacion();
            } else {
                System.out.println("ERROR: Datos inválidos. No se guardaron los cambios.");
            }

        } else if (opcion == 3) {
            de.setCodigo(codigo);
            de.setModelo(modelo);
            de.setDistanciaKm(distancia);
            de.setPesoPaquete(peso);
            de.setHorasVuelo(horas);
            System.out.println("\nValidando datos...");
            if (de.validarDatos()) {
                System.out.println("Datos correctos.");
                System.out.println("Calculando costo...\n");
                System.out.println("===== INFORMACIÓN ACTUALIZADA =====");
                de.mostrarInformacion();
            } else {
                System.out.println("ERROR: Datos inválidos. No se guardaron los cambios.");
            }
        }

        System.out.println("\n===== DEMOSTRACIÓN =====");
        System.out.println("Llamando calcularCostoEntrega() desde referencia tipo Dron:");
        Dron d1 = dl;
        Dron d2 = dc;
        Dron d3 = de;
        System.out.println("-> " + d1.getCodigo() + " | " + d1.getModelo() + " | Costo: $" + String.format("%.2f", d1.calcularCostoEntrega()));
        System.out.println("-> " + d2.getCodigo() + " | " + d2.getModelo() + " | Costo: $" + String.format("%.2f", d2.calcularCostoEntrega()));
        System.out.println("-> " + d3.getCodigo() + " | " + d3.getModelo() + " | Costo: $" + String.format("%.2f", d3.calcularCostoEntrega()));

        double costoAntes = dc.calcularCostoEntrega();
        System.out.println("Costo inicial DronCarga -> $" + String.format("%.2f", costoAntes));
        dc.setPesoPaquete(4.0);
        System.out.println("Nuevo costo tras setPesoPaquete(4.0) -> $" + String.format("%.2f", dc.calcularCostoEntrega()));

        System.out.println("\n===== FIN DEL PROGRAMA =====");
        System.out.println("Gracias por usar el sistema de drones.");
        sc.close();
    }
}
