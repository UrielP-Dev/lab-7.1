public class CuentaBancaria {
    private String Nombre,Apellido, direccion, DNI;

    private double saldo;

    public CuentaBancaria(String nombre, String apellido, String direccion, String DNI, double saldo) {
        Nombre = nombre;
        Apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.saldo = saldo;
    }


    public void Deposito(double saldo){
        this.saldo += saldo;
    }
    public void Retiro(double saldo){
    if(this.saldo>saldo){
       this.saldo = this.saldo -saldo;
    }else {
        System.out.printf("No hay suficiente dinero");
    }
    }
    public void ConsultaSaldo(){
        System.out.println("Su saldo es: "+getSaldo());

    }
    public void MostrarInformacion(){
        System.out.println(toString());
    }



    public  String toString() {
        return "CuentaBancaria{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", DNI=" + DNI +
                ", saldo=" + saldo +
                '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
