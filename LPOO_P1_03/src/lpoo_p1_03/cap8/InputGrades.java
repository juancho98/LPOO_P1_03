/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_p1_03.cap8;
    
import javax.swing.JOptionPane;

/**
 *
 * @author jdani
 */
public class InputGrades {
    public static void main(String[] args)
  {
    String userInput;
    int userInt;
    final int COURSES = 5;
    final int STUDENTS_NUMBER = 10;
    Student[] students = new Student[STUDENTS_NUMBER];
    for (int i = 0; i < students.length; i ++)
    {
      userInput = JOptionPane.showInputDialog(null, 
        "estudiante " + (i + 1) + " id number: ");
      userInt = Integer.parseInt(userInput); 
      students[i] = new Student();
      students[i].setStudent(i);  
      for (int j = 0; j < COURSES; j++) 
      { 
         CollegeCourse c = new CollegeCourse();
         userInput = JOptionPane.showInputDialog(null, 
           "estudiante " + (i + 1) + " curso " + (j + 1)
           + "ID: "); 
         c.setId(userInput); 
         userInput = JOptionPane.showInputDialog(null, 
           "estudiante " + (i + 1) + " curso " + (j + 1)
           + " Creditos: "); 
         c.setCreditos(Integer.parseInt(userInput)); 
         userInput = JOptionPane.showInputDialog(null, 
           "estudiante " + (i + 1) + " curso " + (j + 1)
           + " calificacion: "); 
         while (userInput.charAt(0) != 'A' && userInput.charAt(0) != 'B' &&
           userInput.charAt(0) != 'C' &&  userInput.charAt(0) != 'D' &&  
           userInput.charAt(0) != 'E' &&  userInput.charAt(0) != 'F')
         {
           userInput = JOptionPane.showInputDialog(null, 
           "Error: intenta de nuevo \nestudiante" + (i + 1) 
             + " curso " + (j + 1) + " grado: ");
         }    
         c.setCalif(userInput); 
         students[i].setCursos(userInput, COURSES, userInput, j);  
      }
    }
    for (int i = 0; i < students.length; i ++)
    {
      System.out.println("estudiante id " + students[i].getStudent());
      for (int j = 0; j < COURSES; j++)
      {
        System.out.println("\tcurso ID: " + students[i].getCursos(i).getId()
          + "\n\t\tcreditos: " + students[i].getCursos(i).getCreditos()
          + "\n\t\tgrado: " + students[i].getCursos(i).getCalif());
      }
    }      
  } 
    
}
