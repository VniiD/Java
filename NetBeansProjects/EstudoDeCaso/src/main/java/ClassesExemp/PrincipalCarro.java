/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesExemp;

/**
 *
 * @author v
 */
public class PrincipalCarro {
    
    public static void main(String args[]){
        
        Car obj = new Car("BMW", "BWM-2409", "2.0", "X1");

        obj.acelerar();
        obj.parar();
        
 /*                                                                          */
 
        Car obj2 = new Car("MITSUBISHI", "TRD-0465", "2.0hp", "TR-4");
 
        Car obj3 = new Car("MITSUBISHI", "TRD-0465", "2.0hp", "TR-4");
        
 /*                                                                          */       

        Car obj4 = new Car();
        
        obj4.setMarca("BMW");
        obj4.setModelo("X1");
        obj4.setPlaca("vfg-5687");
        
        /*            metodo estatico           */
        Car.entroCarro();
        /*                                      */
        
        System.out.println(obj2+ "<=>" +obj3);
        
        if(obj2.getPlaca().equals(obj3.getPlaca())){
            System.out.println("O objeto é igual");
        } else {
            System.out.println("O objeto é diferente");
        }
        
        System.out.println(obj3.getInformacoes());
        
    }
    
}
