package AppObj;

public class Sale_loc {
    double Lat, Longt;
    String Title, Address;
    int Sale_id;
    
    public Sale_loc() {}
     
    public Sale_loc(double Lat, double Longt, int Sale_id, String Title, String Address){
        this.Lat = Lat;
        this.Longt= Longt;
        this.Sale_id=Sale_id;
        this.Title = Title;
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
     
    public int getSale_id(){
       return Sale_id;   
    }
     
    public void setSale_id(int Sale_id){
       this.Sale_id=Sale_id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }
    
    public String getAddress(){
       return Address;
    }
     
    public void setAddress(String Address){
       this.Address=Address;
    }
}
