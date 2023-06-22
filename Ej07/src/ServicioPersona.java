import java.util.Scanner;

public class ServicioPersona {

    public Persona crearPersona(){
        Persona p1 = new Persona();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre");
        p1.setNombre(input.next());
        System.out.println("Ingrese edad");
        p1.setEdad(input.nextInt());
        System.out.println("Ingrese género");
        p1.setGenero(input.next());
        System.out.println("Ingrese peso");
        p1.setPeso(input.nextDouble());
        System.out.println("Ingrese altura");
        p1.setAltura(input.nextDouble());
        return p1;
    }

    public int calcularIMC(Persona p1){
        double imc = p1.getPeso() / Math.pow(p1.getAltura(),2);
        int valorIMC;
        if (imc < 20) {
            System.out.println(p1.getNombre() + " está por debajo de su peso ideal");
            valorIMC = -1;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println(p1.getNombre() + " está en su peso ideal");
            valorIMC = 0;
        } else { System.out.println(p1.getNombre() + " está por encima de su peso ideal");
            valorIMC = 1;}
        System.out.println(imc);
        return valorIMC;
    }

    public boolean esMayorDeEdad(Persona p1){
        boolean mayoriaEdad;
        if (p1.getEdad() >= 18) {
            System.out.println(p1.getNombre() + " es mayor de edad");
            mayoriaEdad = true;
        } else {System.out.println(p1.getNombre() + " es menor de edad");
            mayoriaEdad = false;}
        return mayoriaEdad;
    }

}
