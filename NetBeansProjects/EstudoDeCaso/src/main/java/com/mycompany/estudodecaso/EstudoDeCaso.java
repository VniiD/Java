/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudodecaso;

import java.util.Scanner;

/**
 *
 * @author v
 */
public class EstudoDeCaso {

    public static void main(String[] args) {
        new EstudoDeCaso().caso_7();
    }
    
    public class exemplo {
    
    /* Exemplo de variaveis */
    int preco = 0;  
    int quantidade = preco +10;
    char tipo = 'a';
    
    /* exemplo de impressão */
    public void imprimir() {  
        System.out.println(quantidade);
        System.out.println(tipo);
    }

    }    
    
    /* Exemplo de condições if */
    public void caso_1 (){   
        
        int valor_1 = 5;
        int valor_2 = 10;
        
        if(valor_1 > valor_2){
            System.out.println("O valor 1 é Maior que  o valor 2");
        } else{
            System.out.println("Soma dos Valores: " + (valor_1 + valor_2));
        }
    }
        
        
    
    /*Exemplo if/else*/
    public void caso_2(){
        int valor1 = 10;
        int valor2 = 15;
        
        /* condições 'if e else' só avaliam consdições com retorno booleano */  
        
        /*'&&' operador logico "E" */
        if(valor1 > 10 && valor2 > 15) {     
            System.out.println("1) Os dois valores são maiores que 10");
        } else {
            System.out.println("1) O primeiro ou o segundo valor não é maior que 10");
        }
        
        /*'||' operador logico "OU" */
        if(valor1 > 10 || valor2 > 10) {     
            System.out.println("2) Os dois valores são maiores que 10");
        } else {
            System.out.println("2) O primeiro ou o segundo valor não é maior que 10");
        }         
    }
    
    
    /*                SCANNER / CONDIÇÃO SWITCH                              */
    
    public void caso_3() {
        System.out.println("Digite uma das opções no menu abaixo");
        System.out.println("1: Comprar; 2: Vender; 3: Listar; 4: Sair");
            
        /* Scanner scan, similar ao 'input' do python  */
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
    
        /* SWITCH  obs: ao usar o switch case utilizar o 'break' aceita valores primitivos e literais */
    
        switch (opcao){
            
            case 1:
            System.out.println("Você acessou COMPRAR");
            break;
            
            case 2:
            System.out.println("Você acessou VENDER");
            break;
            
            case 3:
            System.out.println("Você acessou LISTAR");
            break;
            
            default:
            System.out.println("Saindo do sistema");
        }
    }

    /*                   SCANNER  if else                              */
    
        public void caso_3_2() {
            System.out.println("Digite uma das opções no menu abaixo");
            System.out.println("1: Comprar; 2: Vender; 3: Listar; 4: Sair");
            
            /* Scanner scan, similar ao 'input' do python  */
            Scanner scan = new Scanner(System.in);
            int opcao = scan.nextInt();
        
            if (opcao == 1) {
                System.out.println("Você acessou COMPRAR");
            } else if (opcao == 2) {
                System.out.println("Você acessou VENDER");
            } else if (opcao == 3){
                System.out.println("Você acessou LISTAR");
            } else {
                System.out.println("Saindo do sistema");
            }
        }
    
        /*                   LOOP  FOR                              */
    public void caso_4 (){
        
        for(int i = 1; i <= 5; i++)
            System.out.println(i);
    }
    
    public void caso_5 (){
    
        boolean achou = false;
        
        for(int i =0; (!achou); i++) {
            System.out.println(i);
            if(i == 5){
                achou = true;
            }
        }
        System.out.println(achou);
    }
    
    /*                   LOOP  WHILE                              */
    public void caso_6(){
        int contador = 0;
        while(contador < 5){
            System.out.println("Repetição: "+ contador);
            contador++;
        }
    }
   
    public void caso_7(){
        int valor = 1;
        
        do {
            System.out.println("O número é: "+ valor);
            valor++;
        } while(valor<5);
    }
    
}
