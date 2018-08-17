/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

/**
 *
 * @author ACER
 */
public class MobileData implements Comparable<MobileData>{
    
    private String sno;
    private String model;
    private String price;
    private String quantity;
    private String warranty;

    public MobileData(String sno, String model, String price, String quantity,String warranty) {
        this.sno = sno;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
        this.warranty =warranty;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
    
    

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(MobileData o) {
        
        if(this.getModel().compareTo(o.getModel())==0){
        
            return 0;
        }else if(this.getModel().compareTo(o.getModel())>0){
        
            return 1;
        }else{
        
            return -1;
        }
        
        
       }
    
    
    
    
}
