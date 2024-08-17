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
public class OG extends MG {
   
    @Override
    void display(){
        System.out.println(name);
         System.out.println(id);
        
    }
     public static void main(String[] args) {
       OG t = new OG();
        t.name = "Ummehuny";
        t.id = 130;
        t.display();
    }
    
}
