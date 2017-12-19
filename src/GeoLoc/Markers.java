/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeoLoc;

import AppObj.Sale_loc;
import DB.Query;
import com.lynden.gmapsfx.javascript.object.InfoWindow;
import com.lynden.gmapsfx.javascript.object.InfoWindowOptions;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP USER
 */
public class Markers {
    List<Sale_loc> location = new ArrayList<>();
    Marker[] markers ;
    int i=0;
    public Marker[] setMarker(){
                location = new Query().SearchMarkers();
                for (Sale_loc x:location){
                double latitude = x.getLat();
                double longitude = x.getLongt();
                 LatLong Tzini= new LatLong(latitude,longitude );
                 MarkerOptions markerOptions1 = new MarkerOptions();
                 markerOptions1.position(Tzini);
                 markerOptions1.label(x.getSale_id());
                 Marker TzinisMarker = new Marker(markerOptions1);
                 markers[i]=TzinisMarker;
                 i++;
                }
                
                 return markers;
    
    }
    
   
        


}
