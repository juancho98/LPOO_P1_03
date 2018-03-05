/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_p1_03.cap8;

/**
 *
 * @author jdani
 */
public class CollegeCourse {
    private String id;
    private Integer creditos;
    private String calif;
    
    public CollegeCourse(String id, Integer creditos, String calif){
        this.id=id;
        this.creditos=creditos;
        this.calif=calif;
    }

    CollegeCourse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public void setCreditos(Integer creditos){
        this.creditos=creditos;
    }
    
    public void setCalif(String calif){
        this.calif=calif;
    }
    
    public String getId(){
        return this.id;
    }
    
    public Integer getCreditos(){
        return this.creditos;
    }
    
    public String getCalif(){
        return this.calif;
    }
}