/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4_jeremytosorto;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Lab4_JeremytOsorto {

    /**
     * @param args the command line arguments
     */
    public static void opc1(){
        Scanner dec1= new Scanner(System.in);
        String dec;
        int restult;
        double pow, contpow;
        char at;
        System.out.println("Ingrese una cade binaria");
        dec=dec1.nextLine();
        pow=0;
        contpow=0;
        for (int i=0; i<dec.length();i++){
            if (dec.charAt(i)!='0' && dec.charAt(i)!='1'){
                System.out.println("Ingrese una cadena que incluya solamente 1 y 0");
                break;
            }
            
        }
        for (int j=dec.length()-1; j>=0;j--){
            at=dec.charAt(j);
            if (at=='1'){
                contpow+=(Math.pow(2, dec.length()-1-j));
            }
        }
        System.out.println("El resultado en decimal es: "+contpow);
        
    }
    
    public static void opc2(){
        Scanner opc= new Scanner(System.in);
        String correo, cont;
        System.out.println("Ingrese un correo: ");
        correo=opc.next();
        
        for (int i=0; i<correo.length(); i++){
            if (correo.charAt(i)=='@'){
                cont=correo.substring(i, correo.length());
                cont=cont.toLowerCase();
                if (cont=="gmail.com" || cont=="outlook.com" || cont=="unitec.edu"){
                    System.out.println("correo valido");
                }
                else{
                    System.out.println("Correo no valido");
                }
            
            }
        }        
    }
    
    public static void main(String[] args) {
        int resp1;
        
        Scanner resp= new Scanner(System.in);
        System.out.println("Ingrese un número para iniciar el programa\n1- conversión de decimal-binario\n2- validar correos\n3- Formar palabras\nIngresar una opción: ");
        resp1=resp.nextInt();
        
        
        do{
            if (resp1==1){
                opc1();
            }
            else if (resp1==2){
                opc2();
            }
            else if (resp1==3){
            }
        }while(resp1!=4 && resp1<4);
    }
}
