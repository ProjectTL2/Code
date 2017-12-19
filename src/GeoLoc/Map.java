package GeoLoc;

import AppObj.Sale_loc;
import DB.DBCon;
import DB.Query;
import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.InfoWindow;
import com.lynden.gmapsfx.javascript.object.InfoWindowOptions;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;
import com.mongodb.DBCursor;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;

public class Map {
    //To return.
    JFXPanel jfxPanel;
    DBCon z = new DBCon();
    List<Sale_loc> location = new ArrayList<>();
   
    //Other.
    GoogleMap map;
    GoogleMapView mapView;
    Scene scene;
        
    public JFXPanel mapDisp() {
        jfxPanel = new JFXPanel();
        jfxPanel.setSize(680, 580);
        jfxPanel.setLocation(10, 80);
        Marker[] markerx = new Markers().setMarker();
        
        Platform.runLater(() -> {
            mapView = new GoogleMapView();
                        
            mapView.addMapInializedListener(()-> {
                LatLong center = new LatLong(41.0835903,23.5473673);        
                MapOptions options = new MapOptions()
                    .mapMarker(true)
                    .center(center)
                    .zoom(15)
                    .overviewMapControl(false)
                    .panControl(false)
                    .rotateControl(false)
                    .scaleControl(false)
                    .streetViewControl(false)
                    .zoomControl(false)
                    .mapType(MapTypeIdEnum.ROADMAP);
                
                for(int i=0; i<markerx.length; i++) {
                    map.addMarker(markerx[i]);
                }
                
                map = mapView.createMap(options);
            });
            scene = new Scene(mapView);
            jfxPanel.setScene(scene);
        });
        return jfxPanel;
    }
}