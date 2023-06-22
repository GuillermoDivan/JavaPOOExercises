import java.util.Scanner;

public class ServicioPersona {

    public Persona crearPersona(){
        Persona p1 = new Persona();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre");
        p1.setNombre(input.next());
        System.out.println("Ingrese edad");
        p1.setEdad(input.nextInt());
        esMayorDeEdad(p1);

        do {
            System.out.println("Ingrese género. Recuerde que  debe definirse como  una de las " +
                    "siguientes opciones: M (Masculino), F (Femenino) u O (Otrxs)");
            p1.setGenero(input.next());
        } while (!p1.getGenero().equalsIgnoreCase("M") &&
                !p1.getGenero().equalsIgnoreCase("F") &&
                !p1.getGenero().equalsIgnoreCase("O"));

        System.out.println("Ingrese peso");
        p1.setPeso(input.nextDouble());
        System.out.println("Ingrese altura");
        p1.setAltura(input.nextDouble());
        calcularIMC(p1);

        Persona.contadorPersonas++;
        return p1;
    }

    public int calcularIMC(Persona p1){
        double imc = p1.getPeso() / Math.pow(p1.getAltura(),2);
        int valorIMC;
        if (imc < 20) {
            System.out.println(p1.getNombre() + " está por debajo de su peso ideal");
            valorIMC = -1; Persona.contadorBajoPeso++;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println(p1.getNombre() + " está en su peso ideal");
            valorIMC = 0; Persona.contadorIdealPeso++;
        } else { System.out.println(p1.getNombre() + " está por encima de su peso ideal");
            valorIMC = 1; Persona.contadorAltoPeso++;}
        System.out.println(imc);
        return valorIMC;
    }

    public boolean esMayorDeEdad(Persona p1){
        boolean mayoriaEdad;
        if (p1.getEdad() >= 18) {
            System.out.println(p1.getNombre() + " es mayor de edad");
            mayoriaEdad = true; Persona.contadorMayorEdad++;
        } else {System.out.println(p1.getNombre() + " es menor de edad");
            mayoriaEdad = false; Persona.contadorMenorEdad++;}
        return mayoriaEdad;
    }

    public static void promedioPeso(){
        System.out.println("Teniendo en cuenta que se pesaron "+Persona.contadorPersonas+ ", estos son los resultados." );
        System.out.println("Promedio con bajo peso: "+(Persona.contadorBajoPeso / Persona.contadorPersonas));
        System.out.println("Promedio con peso 'ideal': "+(Persona.contadorIdealPeso / Persona.contadorPersonas));
        System.out.println("Promedio con sobrepeso: "+(Persona.contadorAltoPeso / Persona.contadorPersonas));
    }

    public static void promedioEdad(){
        System.out.println("Teniendo en cuenta que se registraron "+Persona.contadorPersonas+ ", estos son los resultados." );
        System.out.println("Promedio mayores de edad: "+(Persona.contadorMayorEdad / Persona.contadorPersonas));
        System.out.println("Promedio menores de edad': "+(Persona.contadorMenorEdad / Persona.contadorPersonas));
    }

}
