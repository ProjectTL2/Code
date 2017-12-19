package AppObj;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author HP USER
 */
public class Sale_loc {
    double Lat,Longt;
    String Sale_id,Address;
    
    
     public Sale_loc() {}
     
     public Sale_loc(double Lat,double Longt,String Sale_id,String Address){
     this.Lat = Lat;
     this.Longt= Longt;
     this.Sale_id=Sale_id;
     this.Address=Address;
     
     }
     public double getLat(){
         return Lat;
     }
     public void setLat(double Lat){
            this.Lat= Lat;
     }
     public double getLongt(){
            return Longt;
     }
     public void setLongt(double Longt){
             this.Longt=Longt;
     }
     public String getSale_id(){
             return Sale_id;   
     }
     public void setSale_id(String Sale_id){
            this.Sale_id=Sale_id;
     }
     public String getAddress(){
             return Address;
     }
     public void setAddress(String Address){
            this.Address=Address;
     }
}
