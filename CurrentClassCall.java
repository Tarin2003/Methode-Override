/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodeoverridefinal;

/**
 *
 * @author Hp
 */
public class CurrentClassCall {
    
    int age,id;
    void display(){
    System.out.println("Ummehuny") ;
    }
    void displayinformation(){
       display();
       System.out.println("Fatema") ;
       
        
    }
    public static void main(String[] args) {
        CurrentClassCall s = new CurrentClassCall();
        s.displayinformation();
        s.display();
        
    }
    
}
