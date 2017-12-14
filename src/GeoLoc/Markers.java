/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeoLoc;

import com.lynden.gmapsfx.javascript.object.InfoWindow;
import com.lynden.gmapsfx.javascript.object.InfoWindowOptions;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;

/**
 *
 * @author HP USER
 */
public class Markers {
    public Marker setMarker(String s){
                String[] x=s.split(",");
                double latitude = Double.parseDouble(x[0]);
                double longitude = Double.parseDouble(x[1]);
                 LatLong Tzini= new LatLong(latitude,longitude );
                 MarkerOptions markerOptions1 = new MarkerOptions();
                 markerOptions1.position(Tzini);
                 markerOptions1.label("addidas");
                 Marker TzinisMarker = new Marker(markerOptions1);
                                    
                 return TzinisMarker;
    
    }
}
