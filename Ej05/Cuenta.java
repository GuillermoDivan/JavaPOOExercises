/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
Nota: Los setters de cuenta, saldoActual e intereses no fueron agregados porque no tiene sentido
para el negocio que pueda settearse ese tipo de valores. De hecho, la clase debería intanciarse
ya con datos pasados por parámetro y no habilitar un constructor vacío.*/

package Ej05;

import java.util.Scanner;

public class Cuenta {
    private int cuenta;
    private long dni;
    private double saldoActual;
    private double intereses;
    public Cuenta(int cuenta, long dni, int saldoActual, int intereses) {
        this.cuenta = cuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.intereses = intereses;
    }
    public Cuenta() {
    }
    public int getCuenta() {
        return cuenta;
    }
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public double getSaldoActual() {
        return saldoActual;
    }
    public double getIntereses() {
        return intereses;
    }


    public Cuenta generarCuenta() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el número de cuenta");
        this.cuenta = input.nextInt();
        System.out.println("Ingrese el número de DNI");
        this.dni = input.nextLong();
        System.out.println("Ingrese el saldo actual");
        this.saldoActual = input.nextInt();
        System.out.println("Ingrese el monto de intereses");
        this.intereses = input.nextInt();
        return this;
    }

    public double ingresar(double ingreso){
        saldoActual += ingreso;
        System.out.println("Ha ingresado con éxito $"+ ingreso+ " a su cuenta.");
        return saldoActual;
    }

    public double retirar(double retiro){
        if (retiro > saldoActual) { saldoActual = 0;
            System.out.println("El monto que desea retirar es mayor al saldo que dispone en cuenta.");
        } else { saldoActual -= retiro;
            System.out.println("Ha retirado con éxito $"+ retiro+ " de su cuenta.");
        }    return saldoActual;
    }

    public double extraccionRapida(){
        saldoActual *= 0.8;
        System.out.println("Ha retirado con éxito $"+ (saldoActual*0.2) + " de su cuenta.");
        return saldoActual;
    }
    public void consultarSaldo(){
        System.out.println(getSaldoActual());
    }

    public String consultarDatos() {
        return "Datos de la Cuenta{" +
                "Cuenta n°=" + cuenta +
                ", DNI del titular=" + dni +
                ", Saldo actual=" + saldoActual +
                ", Intereses=" + intereses +
                '}';
    }
}
