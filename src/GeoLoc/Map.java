package GeoLoc;

import AppObj.Sale_loc;
import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import com.lynden.gmapsfx.javascript.object.Marker;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;

public class Map {
    //To return.
    JFXPanel jfxPanel;
    List<Sale_loc> location = new ArrayList<>();
   
    //Other.
    GoogleMap map;
    GoogleMapView mapView;
    Scene scene;
        
    public JFXPanel mapDisp() {
        jfxPanel = new JFXPanel();
        jfxPanel.setSize(1240, 580);
        jfxPanel.setLocation(10, 80);
        
        Platform.runLater(() -> {
            mapView = new GoogleMapView();
                        
            mapView.addMapInializedListener(()-> {
                LatLong center = new LatLong(38.1634017,25.0512624);        
                MapOptions options = new MapOptions()
                    .mapMarker(true)
                    .center(center)
                    .zoom(6)
                    .overviewMapControl(false)
                    .panControl(false)
                    .rotateControl(false)
                    .scaleControl(false)
                    .streetViewControl(false)
                    .zoomControl(false)
                    .mapType(MapTypeIdEnum.ROADMAP);
                map = mapView.createMap(options);
                
                Marker[] markers = new Markers().setMarker();
                for(int i=0; i<markers.length; i++) {
                    map.addMarker(markers[i]);
                }
            });
            scene = new Scene(mapView);
            jfxPanel.setScene(scene);
        });
        return jfxPanel;
    }
}