/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Ficko
 */
public class testermain {

    public Date date;
    public Time time;
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
      LocalDateTime now = LocalDateTime.now();  
      System.out.println(dtf.format(now));  
    }
    
}
