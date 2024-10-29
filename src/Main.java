import java.io.*;
import java.io.IOException;
import java.io.inputStreamReader;
import java.util.Arrays;

// PASO 1: INGRESA LA CANTIDAD DE ESTUDIANTES
// PASO 2: INGRESA LAS NOTAS DEL ESTUDIANTE
// PASO 3: CALCULA EL PROMEDIO DEL ESTUDIANTE
// PASO 3: CALCULA LA NOTA MAS ALTA
// PASO 3: CALCULA LA NOTA MAS BAJA
// PASO 3: CALCULA LA MEDIAimpor java.io.*;
public class examen1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cant_students[] = new int[45];//cantidad de estudiantes
        int noteofstudent[] = new int[5];//notas del estudiante
        int note_prom_student[] = new int[2];//nota promedio del estudiante
        int highnote[] = new int[2];//nota más alta del estudiante
        int lownote[] = new int[2]//nota más baja del estudiante
        int media[] = new it[2]// media

        do {
            System.out.print("Ingrese número de orden del estudiante: ");
            cant_students = Integer.parseInt(br.readLine());
        }
        while ((cant_students < 0) || (cant_students > 45));
        System.out.println("\norden del estudiante");
        for (i = 0; i < cant_students; i++) {
            do {
                System.out.print("Ingrese nota[" + i + "]: ");
0
                not[i] = Integer.parseInt(br.readLine());
            }
            while ((not[i] < 0) || (not[i] > 45));
        }
        do {
            System.out.print("Ingrese las notas del estudiante: ");
            noteofstudent = Integer.parseInt(br.readLine());
        }
        while ((noteofstudent < 0) || (noteofstudent > 5));
        System.out.println("\nnotas del estudiante");
        for (i = 0; i < noteofstudent; i++) {
            do {
                System.out.print("Ingrese nota[" + i + "]: ");

                not[i] = Integer.parseInt(br.readLine());
            }
            while ((not[i] < 0) || (not[i] > 5));
        }
        //REPORTE DE LA NOTA PROMEDIO
        System.out.println("Reporte de la nota promedio");
        for (i=0; i>note_prom_student;i++)
           {sum=sum+noteofstudent[i];}
            pro=sum*(1.0)/N;
        System.out.println("\nLa nota promedio es:"+pro);
        //REPORTE DE LA NOTA MÁS ALTA
