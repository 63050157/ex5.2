/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworkex5_2;

import java.util.Scanner;

/**
 *
 * @author Piyaporn
 */
public class HomeworkEx5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
               
        LiveScoreBeans LiveScore = new LiveScoreBeans();
        Subscriber1 sub1 = new Subscriber1();
        Subscriber2 sub2 = new Subscriber2();
        
        LiveScore.addPropertyChangeListener(sub1);
        LiveScore.addPropertyChangeListener(sub2);
        
        boolean b = true;
        while(b) {
            System.out.print("Enter Score " );
            String str = sc.nextLine();
            if(str.equals("")) {
                break;
            }
            LiveScore.setScoreLine(str);
        } 
    }
    
}
