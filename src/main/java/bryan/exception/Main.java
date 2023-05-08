/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.exception;

/**
 *
 * @author joyabryan
 */
public class Main { 
  public static void methodThrowingException() throws Exception {
        throw new ExceptionC("My Exception");
    }
    
    public static void main(String[] args) {
        try {
            methodThrowingException();
        } catch (Exception e) {
            System.out.println("Caught " + e.getMessage());
        }
    }
}