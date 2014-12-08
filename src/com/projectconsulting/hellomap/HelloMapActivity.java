package com.projectconsulting.hellomap;

import android.app.Activity;
import android.os.Bundle;


import com.esri.android.map.MapView;
import com.esri.android.map.ags.ArcGISTiledMapServiceLayer;


public class HelloMapActivity extends Activity {
	
	MapView mMapView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        
        
        
     // Retrieve the map and initial extent from XML layout
     			mMapView = (MapView)findViewById(R.id.map);
     			// Add dynamic layer to MapView
     			mMapView.addLayer(new ArcGISTiledMapServiceLayer("" +
     			"http://services.arcgisonline.com/ArcGIS/rest/services/World_Street_Map/MapServer"));
        
        
		mMapView = new MapView(this);

    }

	@Override
	protected void onDestroy() {
		super.onDestroy();
 }
	@Override
	protected void onPause() {
		super.onPause();
		mMapView.pause();
 }
	@Override
	protected void onResume() {
		super.onResume();
		mMapView.unpause();
	}
}
	
