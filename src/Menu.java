
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kevin
 */
public class Menu {
    Metodos Met = new Metodos();
    
    public void Menu (){
      int Opc=Integer.parseInt(JOptionPane.showInputDialog(
        "\n <TAREAS KEVIN PEREIRA>\n"+
        "\n <       MENU         >\n"+
        "\n <<<<<<<<<<>>>>>>>>>>>>\n"+
        "\n Opcion 1....Practica 1\n"+
        "\n Opcion 2....Practica 2\n"+
        "\n Opcion 3....Practica 3\n"+
        "\n Opcion 4....Practica 4\n"+
        "\n Opcion 5....Practica 5\n"+
        "\n Opcion 6....Practica 6\n"+
        "\n OPCION 7......SALIDA  \n"+
        "\n <<<<<<<<<<>>>>>>>>>>>>\n"+
        "Digite la opcion que deseas\n"));
        
        switch(Opc){
            case 1->{
                Practica1();
                Menu();
            }
            case 2->{
                Practica2();
                Menu();
            }
            case 3->{
                Practica3();
                Menu();
            }
            case 4->{
                Practica4();
                Menu();
            }
            case 5 ->{
                Practica5();
                Menu();
            }
            case 6 ->{
                Practica6();
                Menu();
            }
            case 7 ->{
                JOptionPane.showMessageDialog(null,
                        "Saliendo del sistema...\n");
                break;
            }
            default ->{
                 JOptionPane.showMessageDialog(null, 
                         "Opcion Invalida");
                 Menu();    
        }
    }
    }    
    
    public void Practica1(){
        int digito;
        
        digito=Integer.parseInt(JOptionPane.showInputDialog
        ("Digite la cifra que desea invertir: "));
        int Largo= Integer.toString
        (digito).length()-1;
        JOptionPane.showMessageDialog
        (null, "El numero Invertido es: "
                +Met.invertirdigitoR(digito, Largo));
              
    }
    public void Practica2(){
        String Cadena=JOptionPane.showInputDialog
        ( "Digite una palabra: ");
        Met.mostrarCadenaR(0, Cadena);
    }
    public void Practica3(){
       int i=0;
       int Long;
       Long=Integer.parseInt(JOptionPane.showInputDialog
       ("Digite el tamano del arregloL: "));        
       int []vector= new int[Long];
       Met.llenarVectorR(i, vector);
       Met.mostrarVectorR(i, vector);
      JOptionPane.showMessageDialog(null, "El numero Maximo es: "
       +Met.mostrarMaximoNumR(vector,vector[0],0));
    }
    public void Practica4(){
        int indice;
        indice=Integer.parseInt
        (JOptionPane.showInputDialog
        ("Digite la cantidad de numeros a sumar:"));
        JOptionPane.showMessageDialog(null,
                "Total: "+Met.sumaRecursiva2(indice));
    }
    public void Practica5(){
        int Numero;
        Numero=Integer.parseInt
        (JOptionPane.showInputDialog
        ("Digite el numero que desea ver su tabla de multiplicacion: "));
        Met.TablaMultiplicacionR(0, Numero);
    }
    public void Practica6(){
        int Numero= Integer.parseInt(JOptionPane.showInputDialog
        ("Digite el numero: "));
        
        int Largo= Integer.toString
        (Numero).length(); // Aqui se cuenta el tamanio de los digitos.
       JOptionPane.showMessageDialog(null,      
       Met.sumarDigitos
        (0, Numero, Largo, "", 0) );
    }
    
        
}
