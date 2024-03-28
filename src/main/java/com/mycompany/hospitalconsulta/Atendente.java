
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

    boolean perguntarConsulta(){
    Scanner teclado = new Scanner (System.in);
        System.out.println("BEM-VINDO AO HOSPITAL-CANETA-AZUL");
        System.out.println("Gostaria de agendar uma consulta? (Sim/Não)");
        String resposta = teclado.nextLine().toLowerCase();
    
        //for (int i=0 ; x=10; i++){
        switch (resposta) {
        case "sim":
            return true;
        case "não":
        case "nao":
            System.out.println("Ok tenha um bom dia. Próximo da fila!\n");
            return perguntarConsulta();
        default:
            System.out.println();
            return perguntarConsulta();
    }
        
    }
    void sim(){
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
