public class servicioPersona {
    servicioPersona sp = new servicioPersona;

    public Persona crearPersona(){
        Persona p1 = new Persona;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre");
        p1.setNombre = input.nextLine();
        System.out.println("Ingrese edad");
        p1.setEdad = input.nextInt();
        System.out.println("Ingrese género");
        p1.setGenero = input.nextChar();
        System.out.println("Ingrese peso");
        p1.setPeso = input.nextLine();
        System.out.println("Ingrese altura");
        p1.setAltura = input.nextInt();
        return Persona;
    }

    public int calcularIMC(int peso, int altura){
        double imc = peso / Math.pow(altura,2);
        int valorIMC;
        if (imc > 20) {
            System.out.println("La persona está por debajo de su peso ideal");
            valorIMC = -1;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("La persona está en su peso ideal");
            valorIMC = 0;
        } else { System.out.println("La persona está en su peso ideal");
            valorIMC = 1;}
        return valorIMC;
    }

    public boolean esMayorDeEdad(int edad){
        boolean mayoriaEdad;
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
            mayoriaEdad = true;
        } else {System.out.println("La persona es menor de edad");
            mayoriaEdad = false;}
        return mayoriaEdad;
    }

}
