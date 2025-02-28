/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesExemp;

/**
 *
 * @author v
 */
public class Car {
    
    private String modelo;
    
    private int qntPorta;
           
    private String placa;
    
    private String motor;
    
    private String freio;
    
    private /*static*/ String marca;
    
    private boolean estaAcelerando = false;
    /*                                      */
    
    public Car(){
        this.setFreio("definir modelo");
        this.setModelo("definir marca");
        this.setPlaca("A definir placa");
        this.setQntPorta(0);
        this.setMotor("A definir motor");
        this.setMarca("Definir Marca");
    }
    
    public Car(String marca, String placa, String motor, String modelo){
        this.setMarca(marca);
        this.setPlaca(placa);
        this.setMotor(motor);
        this.setModelo(modelo);
        
    }
    
    /*                 CONSTANTE Metodo Final                     */
    
    private static final int PNEU = 15;
    
    
    
    
    
    
    /*              metodos                 */ 
    public String getInformacoes(){
        return "marca: "+marca+" modelo: "+modelo+" placa: "+placa;
    }
    /*                                      */
    public static void entroCarro(){
        System.out.println(" Entrou no Carro");
    }
    /*                                      */
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    /*                                      */
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /*                                      */
    public int getQntPorta(){
        return qntPorta;
    }
    public void setQntPorta(int qntPorta) {
        this.qntPorta = qntPorta;
    }
    /*                                      */
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    /*                                      */
    public String getMotor(){
        return motor;
    }
    public void setMotor (String motor){
        this.motor = motor;
    }
    /*                                      */
    public String getFreio(){
        return freio;
    }
    public void setFreio(String freio) {
        this.freio = freio;
    }
    /*                                      */
    public void acelerar(){
        estaAcelerando = true;
        if(motor == null){
            this.setMotor("Motor 1.0");
        }
        System.out.println("Acelerar motor "+motor);
    }
    public void parar(){
        this.luzDeFreio();
        this.desacelerar();
        System.out.println("Carro parado");
    }
    private void desacelerar(){
        if(estaAcelerando == true){
        System.out.println("Desacelerando..."+freio);
        }
        estaAcelerando = false;
    }
    private void luzDeFreio(){
        System.out.println("Ligando Luz de freio");
    }
    /*                                      */

}
