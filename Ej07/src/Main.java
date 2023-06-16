public class Main {
    public static void main(String[] args) {
        ServicioPersona sp1 = new ServicioPersona;
        sp1.crearPersona();
        ServicioPersona sp2 = new ServicioPersona;
        sp2.crearPersona();
        ServicioPersona sp3 = new ServicioPersona;
        sp3.crearPersona();
        ServicioPersona sp4 = new ServicioPersona;
        sp4.crearPersona();

        sp1.calcularIMC();
        sp1.esMayorDeEdad();
        sp2.calcularIMC();
        sp2.esMayorDeEdad();
        sp3.calcularIMC();
        sp3.esMayorDeEdad();
        sp4.calcularIMC();
        sp4.esMayorDeEdad();
    }

}

/*

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */