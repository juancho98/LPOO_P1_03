/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_p1_03.cap5;

/**
 *
 * @author jdani
 */
public class DigitalCamera {
    private String brand;
    private Integer mgpixeles;
    private Double precio;
    
    public DigitalCamera(String brand, Integer mgpixeles) {
        
        this.brand = brand;
        if(mgpixeles>10){
             this.mgpixeles = 10;
        }else{
             this.mgpixeles = mgpixeles;
        }
        if(this.mgpixeles<=6){
            this.precio=99.0;
        }else{
            this.precio=129.0;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getMgpixeles() {
        return mgpixeles;
    }

    public void setMgpixeles(Integer mgpixeles) {
        this.mgpixeles = mgpixeles;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public void Details(){
        
        System.out.println("Brand: "+ getBrand()+"\nPrice: "+getPrecio()+"\nMegapixeles: "+getMgpixeles());
    }

    
    
}
