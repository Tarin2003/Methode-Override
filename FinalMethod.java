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
public class FinalMethod {
   final String name = "Ummehuny";
   static final int id ;
   static{
       id = 130;
   }
    
   final void display(){
        System.out.println(name);
         System.out.println(id);
    }
}
