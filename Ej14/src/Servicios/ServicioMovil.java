package Servicios;

import Entidades.Movil;
import java.util.Scanner;

public class ServicioMovil {
    Scanner input = new Scanner(System.in);
    public Movil cargarCelular(){
        Movil m1 = new Movil();
        System.out.println("Ingrese la marca del móvil");
        m1.setMarca(input.next());
        System.out.println("Ingrese el precio del móvil");
        m1.setPrecio(input.nextInt());
        System.out.println("Ingrese el modelo del móvil");
        m1.setModelo(input.next());
        System.out.println("Ingrese la memoria ram del dispositivo");
        m1.setMemoriaRam(input.next());
        System.out.println("Ingrese el almacenamiento del móvil");
        m1.setAlmacenamiento(input.next());
        m1.setCodigo(ingresarCodigo(m1));
        return m1;
    }

    public int[] ingresarCodigo(Movil movl){
        int[] codigo = new int[7];
        System.out.println("Ingrese el código de 7 dígitos separándolos entre sí con enter.");
        for(int i = 0; i < 7; i++){
            codigo[i] = input.nextInt();
        }
        return codigo;
    }
}