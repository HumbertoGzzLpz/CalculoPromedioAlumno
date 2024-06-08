/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculopromedioalumno;

public class Main {
    public static void main(String[] args) {
        // Datos del alumno
        String nombreAlumno = "González Rodríguez";
        int[] calificacionesAlumno = {85, 78, 90, 92, 88};

        // Crear instancia de Alumno
        Alumno alumno = new Alumno(nombreAlumno, calificacionesAlumno);

        // Calcular promedio
        double promedio = alumno.calcularPromedio();

        // Obtener calificación final
        char calificacionFinal = alumno.obtenerCalificacionFinal(promedio);

        // Imprimir resultados
        alumno.imprimirResultados(nombreAlumno, promedio, calificacionFinal);
    }
}
