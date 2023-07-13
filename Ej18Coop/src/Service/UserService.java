package Service;
import Entities.User;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class UserService {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    DateTimeFormatter DMY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    ArrayList<User> UsersList = new ArrayList<>();

    public void signUpUser(){
        User user = new User();
        System.out.println("Ingrese su id (DNI).");
        user.setId(input.nextInt());
        System.out.println("Ingrese su nombre completo.");
        user.setName(input.next());
        System.out.println("Ingrese la fecha de nacimiento (DD / MM / AAAA).");
        String inputbd = input.next();
        user.setBirthdate(LocalDate.parse(inputbd,DMY));
        user.setAge(calculateAge(user.getBirthdate()));
        System.out.println("Ingrese su altura.");
        user.setHeight(input.nextDouble());
        System.out.println("Ingrese su peso actual.");
        user.setWeight(input.nextDouble());
        System.out.println("Explique brevemente su objetivo de entrenamiento.");
        user.setGoal(input.next());
        UsersList.add(user);
    }

    public void showUser(){
        System.out.println("Ingrese el id (DNI) de la persona cuyos datos quiere mostrar.");
        int searchFor = input.nextInt();
        for (int i = 0; i < UsersList.size(); i++ ) {
            User user = UsersList.get(i);
            if (searchFor == UsersList.get(i).getId()) {
                System.out.println(
                        "ID: " + UsersList.get(i).getId() +
                        ". Nombre: " + UsersList.get(i).getName() +
                        ". Fecha de nacimiento: " + UsersList.get(i).getBirthdate() +
                        ". Edad actual: " + UsersList.get(i).getAge() +
                        ". Peso actual: " + UsersList.get(i).getHeight() +
                        ". Altura: " + UsersList.get(i).getWeight() +
                        ". Objetivo de entrenamiento: " + UsersList.get(i).getGoal() + '.');
            }
        }
    }

    public void getUsersList(){
        for (int i = 0; i < UsersList.size(); i++ ) {
            System.out.print("[" + UsersList.get(i).getName() + "]");
        } System.out.println("");
    }

    public void updateUser(){
        System.out.println("Ingrese el id (DNI) de la persona cuyos datos quiere actualizar.");
        int searchFor = input.nextInt();
        for (int i = 0; i < UsersList.size(); i++ ){
            User user = UsersList.get(i);
            if (searchFor == UsersList.get(i).getId()){
                System.out.println("Reingrese su nombre completo.");
                user.setName(input.next());
                System.out.println("Reingrese la fecha de nacimiento (DD / MM / AAAA).");
                String inputbd = input.next();
                user.setBirthdate(LocalDate.parse(inputbd,DMY));
                user.setAge(calculateAge(user.getBirthdate()));
                System.out.println("Reingrese su altura.");
                user.setHeight(input.nextDouble());
                System.out.println("Reingrese su peso actual.");
                user.setWeight(input.nextDouble());
                System.out.println("Explique brevemente su objetivo de entrenamiento.");
                user.setGoal(input.next());
            }
        }
    }

    public void removeUser(){
        System.out.println("Ingrese el id (DNI) de la persona que quiere quitar del sistema.");
        int searchFor = input.nextInt();
        for (int i = 0; i < UsersList.size(); i++ ){
            if (searchFor == UsersList.get(i).getId()) {
                UsersList.remove(i);
            }
        }
    }

    private int calculateAge(LocalDate birthdate){
        Period agePeriod = birthdate.until(LocalDate.now());
        int age = agePeriod.getYears();
        return age;
    }


}
