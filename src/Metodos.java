
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kevin
 */
public class Metodos {
    
  public int invertirdigitoR(int num, int pos){
      if (num<10) { 
          return num;         
} else{ 
          return (num % 10)* (int) Math.pow(10, pos) + 
                  (invertirdigitoR(num/10, pos-1));
      }
}

public void mostrarCadenaR(int x, String Cadena){
    if (x<Cadena.length()) {
        JOptionPane.showMessageDialog(
         null,Cadena.charAt(x));
        System.out.println(Cadena.charAt(x));
        mostrarCadenaR(x+1,Cadena);
    }
}

public void llenarVectorR(int i, int []vec){
    if (i <vec.length) {
       vec[i]=Integer.parseInt(JOptionPane.showInputDialog
       ("Digite Los Numeros del arreglo: "));
       llenarVectorR(i+1,vec); 
    }
    else {
        System.out.println("CLOSE");
    }
}
public void mostrarVectorR(int i, int []vec){
    if (i<vec.length) {
        JOptionPane.showMessageDialog
        (null, "Lista De numeros: "+vec[i]); 
        mostrarVectorR(i+1,vec);
    }else{
        System.out.println("CLOSE");
    }  
}

public int mostrarMaximoNumR( int [] vec, int maximo,int i){
    if (i!=vec.length) {
        if (vec[i]>maximo) {
            maximo=mostrarMaximoNumR(vec,vec[i],i + 1);
        }else{
            maximo=mostrarMaximoNumR(vec,maximo, i + 1);
        }
    }
    return maximo;
}

public int sumaRecursiva2(int x){
    if (x!=0) {
        JOptionPane.showMessageDialog(null,x);
        return x+sumaRecursiva2(x-1);
    }else{
        
        return 0;
    }
}
public void TablaMultiplicacionR(int num,int i){
    if (num<=12) { 
       JOptionPane.showMessageDialog(null,i+" x "+num+" = "+(num*i));
        TablaMultiplicacionR(num+1,i);     
}     
}

public int sumarDigitos(int i, int numero,int tamanio, String Cadena, int total){
    if (i<tamanio) {
        Cadena= String.valueOf(Integer.toString(numero).charAt(i)); 
         //Almacenar tipo texto, para sumar de forma independiente.
         total=total+Integer.parseInt(Cadena);
         return sumarDigitos(i+1,numero, tamanio, Cadena,total);     
    }
   
    return total;
}
}