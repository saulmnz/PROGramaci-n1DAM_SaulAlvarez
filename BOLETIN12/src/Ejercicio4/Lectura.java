package Ejercicio4;

import java.io.*;

import static Ejercicio4.App.recuperarLongitud;
import static Ejercicio4.App.recuperarTareas;
import java.io.*;


public class Lectura {
    public static int count = 0;
    // Implementación de lectura de tareas
    Lectura(){
        try (ObjectInputStream fluxoEntrada = new ObjectInputStream(new FileInputStream("tarefas.dat"))) {
            while (true) {
                Tarea tarefa = (Tarea) fluxoEntrada.readObject();
                if (tarefa != null) {
                    App.agregarTarea(tarefa);  // Usar método existente
                }
            }
        } catch (EOFException e) {
            System.out.println("Todas las tareas fueron leídas");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
