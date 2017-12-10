package GeoLoc;

import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;

public class Map {
    //To return.
    JFXPanel jfxPanel;
    
    //Other.
    GoogleMap map;
    GoogleMapView mapView;
    Scene scene;
    
    public JFXPanel mapDisp() {
        jfxPanel = new JFXPanel();
        jfxPanel.setSize(1280, 940);
        jfxPanel.setLocation(10, 80);
        
        Platform.runLater(() -> {
            mapView = new GoogleMapView();
            mapView.addMapInializedListener(()-> {
                LatLong center = new LatLong(41.0835903,23.5473673);

                MapOptions options = new MapOptions()
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
            });
            scene = new Scene(mapView);
            jfxPanel.setScene(scene);
        });
        return jfxPanel;
    }
}