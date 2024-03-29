
package com.mycompany.hospitalconsulta;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Natã
 */
public class HospitalConsulta {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner teclado1 = new Scanner (System.in);
        Scanner teclado2 = new Scanner (System.in);
        
        Atendente c1 = new Atendente();
                
        boolean respostaConsulta = c1.perguntarConsulta();
        c1.consulta = respostaConsulta;
        
        if(respostaConsulta == true){
            System.out.println("Que dia do mês estária disposta? ");
        int diaC1 = teclado1.nextInt();
        System.out.println("Que horas gostaria? ");
        int horaC1 = teclado2.nextInt();
        System.out.println("Quantos pacientes serão? ");
        int pacienteC1 = teclado1.nextInt();
        c1.dia = diaC1;
        c1.hora = horaC1;
        c1.paciente = pacienteC1;
        c1.estado(); 
        }
    }
}
