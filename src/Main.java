import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese sus apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingrese su dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese su DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        CuentaBancaria CB = new CuentaBancaria(nombre, apellidos, direccion, dni, saldoInicial);

        int opcion;

        do {
            System.out.println("===== Menú Bancario =====");
            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Mostrar información de la cuenta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    double saldo;
                    System.out.println("Cuanto quieres depositar");
                    saldo = scanner.nextDouble();
                    CB.Deposito(saldo);

                    break;
                case 2:
                    System.out.println("Cuanto quieres retirar? ");
                    saldo = scanner.nextDouble();
                    CB.Retiro(saldo);
                    break;
                case 3:
                        CB.ConsultaSaldo();
                    break;
                case 4:
                    CB.MostrarInformacion();
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
