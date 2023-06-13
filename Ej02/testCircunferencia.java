public class testCircunferencia {
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(25);
        c1.area();
        c1.perimetro();

        System.out.println("Con un radio de "+ c1.getRadio()+ " se tiene un área de "+ c1.getArea()+ " y un perímetro de "+ c1.getPerimetro()+ ".");
    }
}
