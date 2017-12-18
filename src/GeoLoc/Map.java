package GeoLoc;

import DB.DBCon;
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
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;

public class Map {
    //To return.
    JFXPanel jfxPanel;
    DBCon z = new DBCon();
    
    //Other.
    GoogleMap map;
    GoogleMapView mapView;
    Scene scene;
        
    public JFXPanel mapDisp() {
        jfxPanel = new JFXPanel();
        jfxPanel.setSize(680, 580);
        jfxPanel.setLocation(10, 80);
        
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
                map = mapView.createMap(options);
                                                                       
                int i=0;
                String[] Marker = {"41.0835903,23.5473673", "41.0838903,23.5473973","41.0835993,23.5476673"};
                
                for(i=0;i<=2;i++){
                    map.addMarker( new Markers().setMarker(Marker[i].toString()));
                }
            });
            scene = new Scene(mapView);
            jfxPanel.setScene(scene);
        });
        return jfxPanel;
    }
}