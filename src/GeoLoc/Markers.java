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

public class Markers {
    
    public Marker[] setMarker(){
        List<Sale_loc> location = new Query().SearchMarkers();
        Marker[] markers = new Marker[location.size()];
        
        int i=0;
        
        for (Sale_loc x : location){
            LatLong Tzini= new LatLong(x.getLat(), x.getLongt());
            MarkerOptions markerOptions1 = new MarkerOptions();
            markerOptions1.position(Tzini);
            markerOptions1.label(x.getAddress());
            Marker TzinisMarker = new Marker(markerOptions1);
            markers[i]=TzinisMarker;
            
            i++;
        }
        
        return markers;
    }
}