package Main;

import Entidades.Vehiculo;
import Servicios.ServicioVehiculo;

public class Main {
    public static void main(String[] args) {
        ServicioVehiculo test1 = new ServicioVehiculo();
        Vehiculo vGonza = test1.crearVehiculo();
        System.out.println(vGonza.toString());
        //System.out.println(test1.moverse(vGonza) +" metros");

        Vehiculo vThiago = test1.crearVehiculo();
        System.out.println(vThiago.toString());
        //System.out.println(test1.moverse(vThiago) +" metros");

        Vehiculo vCaro = test1.crearVehiculo();
        System.out.println(vCaro.toString());
        //System.out.println(test1.moverse(vCaro) +" metros");

        double max = 0;
        String duenie = "";
        double mGonza = test1.moverse(vGonza);
        double mThiago= test1.moverse(vThiago);
        double mCaro = test1.moverse(vCaro);

        if (mGonza > max) { max = mGonza; duenie = "Auto de Gonza"; }
        if (mThiago > max) { max = mThiago; duenie = "Bici pinchada de Thiago"; }
        if (mCaro > max) { max = mCaro; duenie = "Moto de Caro"; }

        System.out.println("El vehículo que más recorrió fue "+ duenie+ ", con un total de "+
                max+ " metros!");


    }
}
