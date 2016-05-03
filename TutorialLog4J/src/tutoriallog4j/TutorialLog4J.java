/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriallog4j;

import org.apache.log4j.Logger;

/**
 *
 * @author Ocupacional 2016-04
 */
public class TutorialLog4J {

    final static Logger logger = Logger.getLogger(TutorialLog4J.class);
    
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("La suma de " + args[0] + " y " + args[1] + " es: " + (num1 + num2));
        Pojo pj = new Pojo();
        
        Pojo pj2 = new Pojo();
        
        System.out.println(pj.getAttr3());
        
        
        
    }
    
}
