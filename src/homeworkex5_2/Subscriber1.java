package homeworkex5_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Piyaporn
 */

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Subscriber1 implements PropertyChangeListener {
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Live Result : " + evt.getNewValue());
   }
    
}
