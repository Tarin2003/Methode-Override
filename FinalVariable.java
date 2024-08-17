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
final public class FinalVariable {
    final String name = "Ummehuny";
    final int id;
    FinalVariable(){
        id = 130;
    }
    void display(){
        System.out.println(name);
         System.out.println(id);
        
    }
    public static void main(String[] args) {
        FinalVariable b = new FinalVariable();
        b.display();
    }
    
}
