package GeoLoc;

import AppObj.Sale_loc;
import DB.Query;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;
import java.util.List;

public class Markers {
    
    public Markers(){}
    
    public Marker[] setMarker(){
        List<Sale_loc> location = new Query().SearchMarkers();
        Marker[] markers = new Marker[location.size()];
        
        int i=0;
        
        for (Sale_loc x : location){
            LatLong Tzini = new LatLong(x.getLat(), x.getLongt());
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(Tzini);
            markerOptions.label(x.getTitle());
            Marker TzinisMarker = new Marker(markerOptions);
            markers[i] = TzinisMarker;
            
            i++;
        }
        
        return markers;
    }
}