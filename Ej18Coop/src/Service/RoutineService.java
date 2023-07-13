package Service;

import Entities.Routine;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class RoutineService {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    DateTimeFormatter DMY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    ArrayList<Routine> RoutineList = new ArrayList<>();

    public Routine createRoutine(){
        System.out.println("Ingrese el id de la rutina.");
        int id = input.nextInt();
        System.out.println("Ingrese el nombre de la rutina.");
        String routineName = input.next();
        System.out.println("Ingrese la dificultad de la rutina.");
        int difficultyLevel = input.nextInt();
        System.out.println("Ingrese la fecha de inicio de la rutina (DD / MM / AAAA).");
        String inputStart = input.next();
        LocalDate startDate = LocalDate.parse(inputStart,DMY);
        System.out.println("Ingrese la fecha de fin de la rutina (DD / MM / AAAA).");
        String inputEnd = input.next();
        LocalDate endDate = LocalDate.parse(inputEnd, DMY);
        int duration = calculateDuration(startDate, endDate);
        System.out.println("Explique de qué se trata la rutina de entrenamiento.");
        String description = input.next();
        Routine routine = new Routine(id, difficultyLevel, routineName, description, duration);
        RoutineList.add(routine);
        return routine;
    }

    public void showRoutine() {
        System.out.println("Ingrese el id de la rutina que quiere mostrar.");
        int searchFor = input.nextInt();
        for (int i = 0; i < RoutineList.size(); i++) {
            if (searchFor == RoutineList.get(i).getId()) {
                System.out.println(
                        " Id de la rutina: " + RoutineList.get(i).getId() +
                                ". Nombre de la rutina: " + RoutineList.get(i).getName() +
                                ". Nivel de dificultad (X/10) " + RoutineList.get(i).getDifficultyLevel() +
                                ". Duration prevista: " + RoutineList.get(i).getDuration() +
                                ". Descripción: " + RoutineList.get(i).getDescription() + '.');
            }
        }
    }


    public void getRoutineList(){
        for (int i = 0; i < RoutineList.size(); i++ ) {
            System.out.print("[" + RoutineList.get(i).getName() + "]");
        } System.out.println("");
    }

    public void updateRoutine(){
        System.out.println("Ingrese el id de la rutina que quiere modificar.");
        int searchFor = input.nextInt();
        for (int i = 0; i < RoutineList.size(); i++ ){
            if (searchFor == RoutineList.get(i).getId()){
                System.out.println("Ingrese el nuevo nombre de la rutina.");
                RoutineList.get(i).setName(input.next());
                System.out.println("Ingrese la nueva dificultad de la rutina.");
                RoutineList.get(i).setDifficultyLevel(input.nextInt());
                System.out.println("Ingrese la nueva fecha de inicio de la  rutina (DD / MM / AAAA).");
                String inputStart = input.next();
                LocalDate startDate = LocalDate.parse(inputStart,DMY);
                System.out.println("Ingrese la nueva fecha de fin de la rutina (DD / MM / AAAA).");
                String inputEnd = input.next();
                LocalDate endDate = LocalDate.parse(inputEnd, DMY);
                RoutineList.get(i).setDuration(calculateDuration(startDate, endDate));
                System.out.println("Explique de qué se trata la nueva rutina de entrenamiento.");
                RoutineList.get(i).setDescription(input.next());
            }
        }
    }

    public void removeRoutine(){
        System.out.println("Ingrese el id de la rutina que quiere borrar del sistema.");
        int searchFor = input.nextInt();
        for (int i = 0; i < RoutineList.size(); i++ ){
            if (searchFor == RoutineList.get(i).getId()){
                RoutineList.remove(i);
            }
        }
    }

    private int calculateDuration(LocalDate startDate, LocalDate endDate){
        Period durationPeriod = startDate.until(endDate);
        int duration = durationPeriod.getDays();
        return duration;
    }
}
