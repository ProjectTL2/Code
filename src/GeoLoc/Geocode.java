package GeoLoc;

import AppObj.Sale_loc;
import DB.DBCon;
import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.service.geocoding.GeocoderStatus;
import com.lynden.gmapsfx.service.geocoding.GeocodingResult;
import com.lynden.gmapsfx.service.geocoding.GeocodingService;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import org.bson.Document;

public class Geocode {
    //To return.
    JFXPanel jfxPanel;
    List<Sale_loc> location = new ArrayList<>();
   
    //Other.
    GoogleMap map;
    GoogleMapView mapView;
    Scene scene;
    
    //Geocode.
    LatLong latlong;
    GeocodingService geocodingService;
    String address;
        
    public JFXPanel mapDisp() {
        jfxPanel = new JFXPanel();
        jfxPanel.setSize(1285, 640);
        jfxPanel.setLocation(10, 80);
        
        Platform.runLater(() -> {
            mapView = new GoogleMapView();
                        
            mapView.addMapInializedListener(()-> {
                LatLong center = new LatLong(0, 0);        
                MapOptions options = new MapOptions()
                    .mapMarker(true)
                    .center(center)
                    .zoom(3)
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
    
    public JFXPanel mapDisp(String address) {
        jfxPanel = new JFXPanel();
        jfxPanel.setSize(1285, 640);
        jfxPanel.setLocation(10, 80);
                
        Platform.runLater(() -> {
            mapView = new GoogleMapView();       
            mapView.addMapInializedListener(()-> {
                geocodingService = new GeocodingService();
                geocodingService.geocode(address, (GeocodingResult[] results, GeocoderStatus status) -> {
                    latlong = null;
                    if (status == GeocoderStatus.OK) {
                        latlong = new LatLong(results[0].getGeometry().getLocation().getLatitude(),
                                results[0].getGeometry().getLocation().getLongitude());
                    }
                    LatLong center = new LatLong(latlong.getLatitude(), latlong.getLongitude());        
                    MapOptions options = new MapOptions()
                        .mapMarker(true)
                        .center(center)
                        .zoom(5)
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
            });
            scene = new Scene(mapView);
            jfxPanel.setScene(scene);
        });
        return jfxPanel;
    }
    
    public void InsertLatLongDB(String title, String address, int id) {
        Platform.runLater(()->{
            geocodingService = new GeocodingService();
            geocodingService.geocode(address, (GeocodingResult[] results, GeocoderStatus status) -> {
                latlong = null;
                if (status == GeocoderStatus.OK) {
                    latlong = new LatLong(results[0].getGeometry().getLocation().getLatitude(),
                            results[0].getGeometry().getLocation().getLongitude());
                    Document document = new Document("Lat", latlong.getLatitude())
                            .append("Longt", latlong.getLongitude())
                            .append("Sale_Id", id)
                            .append("Title", title)
                            .append("Address", address);
                    DBCon x = new DBCon();
                    x.mongocollection_sales_loc.insertOne(document);
                }
            });
        });
    }
}