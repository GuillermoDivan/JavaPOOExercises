public class Main {

    public static void main(String[] args) {
        ServicioPersona sp1 = new ServicioPersona();
        Persona p1 = sp1.crearPersona();
        Persona p2 = sp1.crearPersona();
        Persona p3 = sp1.crearPersona();
        Persona p4 = sp1.crearPersona();

        int imc1 = sp1.calcularIMC(p1);
        boolean edad1 = sp1.esMayorDeEdad(p1);
        int imc2 = sp1.calcularIMC(p2);
        boolean edad2 = sp1.esMayorDeEdad(p2);
        int imc3 = sp1.calcularIMC(p3);
        boolean edad3 = sp1.esMayorDeEdad(p3);
        int imc4 = sp1.calcularIMC(p4);
        boolean edad4 = sp1.esMayorDeEdad(p4);

        int contadorBajo = 0;
        int contadorIdeal = 0;
        int contadorAlto = 0;
        if (imc1 == -1) { contadorBajo++; }
        else if (imc1 == 0)  {contadorIdeal++;}
        else {contadorAlto++;}
        if (imc2 == -1) { contadorBajo++; }
        else if (imc2 == 0)  {contadorIdeal++;}
        else {contadorAlto++;}
        if (imc3 == -1) { contadorBajo++; }
        else if (imc3 == 0)  {contadorIdeal++;}
        else {contadorAlto++;}
        if (imc4 == -1) { contadorBajo++; }
        else if (imc4 == 0)  {contadorIdeal++;}
        else {contadorAlto++;}
        double promedioBajo = contadorBajo / 4.0;
        double promedioIdeal = contadorIdeal / 4.0;
        double promedioAlto = contadorAlto / 4.0;
        System.out.println("De las 4 personas,"+ promedioAlto+ " tiene sobrepeso, "+ promedioBajo+ " está debajo del peso recomendable y "+ promedioIdeal+ " está en el peso ideal.");

        int contadorMayor = 0;
        int contadorMenor = 0;
        if (edad1) {contadorMayor++;} else {contadorMenor++;}
        if (edad2) {contadorMayor++;} else {contadorMenor++;}
        if (edad3) {contadorMayor++;} else {contadorMenor++;}
        if (edad4) {contadorMayor++;} else {contadorMenor++;}
        double promedioMayor = contadorMayor / 4.0;
        double promedioMenor = contadorMenor / 4.0;
        System.out.println("De las 4 personas,"+ promedioMayor+ " es mayor de edad, mientras que el  "+ promedioMenor+ " es menor de edad.");
        
    }

}
