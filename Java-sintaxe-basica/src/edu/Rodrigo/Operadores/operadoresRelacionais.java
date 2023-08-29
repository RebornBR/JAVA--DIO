package edu.Rodrigo.Operadores;

public class operadoresRelacionais {
     public static void main(String[] args) throws Exception {
     int numero1= 1; 
     int numero2 = 2;
     
     System.out.println("Numero 1 = " + numero1 + "  " + " Numero 2 = " + numero2);
     
     boolean resultado = numero1 == numero2;
         System.out.println( numero1 + " igual ao " + numero2 + " ? " + resultado);

     resultado = numero1 > numero2; 
          System.out.println( numero1 + " é maior que " + numero2 + " ? " + resultado);


     resultado = numero1 < numero2;
          System.out.println( numero1 + " é menor que " + numero2 + " ? " + resultado);


     resultado = numero1 != numero2;
          System.out.println( numero1 + " é diferente de " + numero2 + " ? " + resultado);
        System.out.println("======================================");
        System.out.println("atribua outros valores as variaveis da linha 5 e 6 para testar mais números");
        System.out.println("---------------------------------------------------------------------------------------------------");
 
        System.out.println("Operadores lógicos:");
        int num1 = 5; // altere para testar com outros números
        int num2 = 3; // altere para testar com outros números

        System.out.println(num1 + " > 4 &&(AND) " + num2 + " < 2 " );
        if(num1 > 4 && num2 < 2){
        System.out.println("Verdadeira, pois ambas condições são verdadeira");
        } else {
            System.out.println("Falsa, pois uma ou as 2 condições são falsas");
        }

        System.out.println(num1 + " > 4 ||(OR) " + num2 + " < 2 " );

        if(num1 > 4 || num2 < 2){
           System.out.println("Verdadeira, pois uma ou ambas condições são verdadeiras");
        }else{
           System.out.println("Falso, pois nenhuma condição é verdadeira");
        }

    }
}
