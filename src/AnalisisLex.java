

import java.util.Scanner;
import java.util.Stack;

public class AnalisisLex {
             
      Scanner S = new Scanner(System.in);
      String Resultado = "";
      int cont =0;
      String Frase = ""; 
      String Letra;
      char k;
      
      
      public void Oracion(){
       System.out.print("Escriba la Oración:\n");
       Frase = S.nextLine();
       
       for(int i=0; i<Frase.length(); i++){
         switch(Frase.charAt(i)){
             case 'i':
              Resultado += "w";
              break;
             case 'e':
              Resultado += "w";
              break;
            }
       
        Resultado += Frase.charAt(i);  
       }
    Resultado += " owo";
    System.out.print(Resultado+"\n");
   }
      
      
     public void Contador (){
     System.out.print("Escriba una Frase:\n");
     Frase = S.nextLine();
     
     
     for(int x=0;x<Frase.length();x++) {
     if ((Frase.charAt(x)=='A') || (Frase.charAt(x)=='a') || 
         (Frase.charAt(x)=='E') || (Frase.charAt(x)=='e') || 
         (Frase.charAt(x)=='I') || (Frase.charAt(x)=='i') || 
         (Frase.charAt(x)=='O') || (Frase.charAt(x)=='o') || 
         (Frase.charAt(x)=='U') || (Frase.charAt(x)=='u')){ 
          cont++;
         }
        }  
        System.out.print("Número de vocales ---> "+cont+"\n");
 }
      
     
     public void PalabraR (){
        System.out.print("Escriba una palabra\n"); 
        Letra = S.nextLine();
        boolean LetraR = false;
        
        Stack pila = new Stack();
         for(int i = 0; i<Letra.length(); i++){
            pila.add(Letra.charAt(i));
            if(pila.contains(Letra.charAt(i)))
                LetraR = true;
            
        }
         System.out.println("¿La palabra: "+ "'" + Letra + "'" + " tiene letras repetidas?");
         System.out.println(LetraR);
     }  
     
     
     public void VocalesE (String args[]){
     System.out.println("Escriba una cadena para separar vocales.");
     String x = S.next();
     int s = x.length();
        k = ' ';

        for (int i = 0; i < s; i++) {
            k = x.charAt(i);

            if ((k == 97) || (k == 111) || (k==101) || (k==105) || (k==117)) {

                  System.out.println(k);
            }else{
                  k = ' ';
                  System.out.println(k);
     
        }
    }

    }
}

 

     
     
     
     
     
     
     
     
     
     
     
             




      