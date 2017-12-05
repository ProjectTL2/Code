package GeoLoc;

import DB.DBCon;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.service.geocoding.GeocoderStatus;
import com.lynden.gmapsfx.service.geocoding.GeocodingResult;
import com.lynden.gmapsfx.service.geocoding.GeocodingService;
import javafx.application.Platform;
import org.bson.Document;

public class Geocode {
    
    LatLong latlong;
    GeocodingService geocodingService;
    String address;
    
    public void getLatLong(String address, String sale_name) {
        Platform.runLater(()->{
            geocodingService = new GeocodingService();
            geocodingService.geocode(address, (GeocodingResult[] results, GeocoderStatus status) -> {
                latlong = null;
                if (status == GeocoderStatus.OK) {
                    latlong = new LatLong(results[0].getGeometry().getLocation().getLatitude(),
                            results[0].getGeometry().getLocation().getLongitude());
                    Document document = new Document("Lat", latlong.getLatitude())
                            .append("Longt", latlong.getLongitude())
                            .append("Sale_Name", sale_name)
                            .append("Address", address);
                    DBCon x = new DBCon();
                    x.mongocollection_sale_loc.insertOne(document);
                }
            });
        });
    }
}