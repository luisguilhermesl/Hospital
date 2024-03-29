
package com.mycompany.hospitalconsulta;

import java.util.Scanner;

/**
 *
 * @author Natã
 */
public class Atendente {
    
    //VARIAVÉIS AQUI----------------------------------------------------------------------------------
    Scanner teclado = new Scanner(System.in);
boolean consulta;
int dia;
int hora;
int paciente;
int x = 10; 
int contador = 1;

    boolean perguntarConsulta(){
    Scanner teclado = new Scanner (System.in);
        System.out.println("BEM-VINDO AO HOSPITAL-CANETA-AZUL");
        System.out.println("Gostaria de agendar uma consulta? (Sim/Não)");
        String resposta = teclado.nextLine().toLowerCase();
    
        if (contador == 10) { // Verificando se o contador é 10 ou mais
            System.out.println("Já atendemos 10 pessoas hoje. Volte amanhã!");
            return false;
        }
        switch (resposta) {
        case "sim":
            return true;
        case "não":
            contador++;
        case "nao":
            contador++;
            System.out.println("Ok tenha um bom dia. Próximo da fila!\n");
           
        default:
            System.out.println();
            return perguntarConsulta();
    }
        
    }
   
    
    void sim(){
        perguntarConsulta();
        this.consulta = true;
    }
    void diaC1(){
        
    int diaC1 = teclado.nextInt();
    while (diaC1 > 0 && diaC1 <=31) {
            System.out.println("Perfeito um dia livre!");
            return;
    }
    }
    void estado(){
        System.out.println("\nFICHA DO AGENDAMENTO:\n");
        System.out.println("Dia da consulta: " + dia);
        System.out.println("Hora marcada: " + this.hora);
        System.out.println("Quantidade de pacientes: " + this.paciente);
        System.out.println("OBRIGADO PELA PREFERÊNCIA!");
}
    }
