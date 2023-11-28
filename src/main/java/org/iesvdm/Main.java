package org.iesvdm;

import java.time.LocalDate;
import java.time.Month;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2023, Month.NOVEMBER, 1); // primer dia del mes

        // Array dias

        String[] diasSemana = {"Lun", "Mar", "Mier", "Jue", "Vie", "Sab", "Dom"};

        // impresion tabla

        // <table>

        System.out.println("<table>");

        // Impresion cabecera

        // <tr>

        System.out.println("<tr>");

        for(String dia : diasSemana){

            System.out.println("<th>" + dia + "</th>");

        }

        //</tr>

        System.out.println("</tr>");

        // Obtener dia que empieza el mes

        int numeroPrimerDia = fecha.getDayOfWeek().getValue();

        int contadorDias = 1;
        int diaCalendario = 1;
        int diaFinalMes = fecha.lengthOfMonth();
        //

        while(contadorDias <= diaFinalMes + numeroPrimerDia){

            // <tr>
            System.out.println("<tr>");

            // Imprimir semanas
            for(int i = 1; i <= 7; i++){

                // <td>
                System.out.println("<td>");

                // Si debe estar en blanco
                if(contadorDias < numeroPrimerDia || contadorDias > diaFinalMes){

                    System.out.println("  ");

                }else{ // si debe imprimir dia

                    System.out.println(diaCalendario);
                    diaCalendario++;
                }

                // </td>
                System.out.println("</td>");


                // Incremento dias
                contadorDias++;
            }

            // </tr>
            System.out.println("</tr>");

        }

        // </table>
        System.out.println("</table>");



    }
}