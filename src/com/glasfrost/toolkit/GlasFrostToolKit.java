/*
 * Copyright by Luis Hartmann 2015
 */
package com.glasfrost.toolkit;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class GlasFrostToolKit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
            System.out.println("GlasFrostToolKit");
            System.out.println();
            System.out.println("Attempting to open the GUI");
            try{
                GlasFrostToolKitGui.main(args);
                System.out.println("GUI habemus");
            }
            catch(Exception e){
                // GUI not available
                L.log(Level.SEVERE, "GUI exception caught!", e);
                System.out.println("An error occurred opening the GUI. Let's use the console then.");
            }
            
        }
        // catch all unhandled exceptions
        catch(Exception e){
            L.log(Level.SEVERE, "Unhandled exception caught!", e);
        }
    }
    
    public static Logger L = Logger.getLogger(GlasFrostToolKit.class.getName());
    
}
