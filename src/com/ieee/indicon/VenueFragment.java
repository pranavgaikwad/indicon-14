package com.ieee.indicon;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class VenueFragment extends Fragment {

	private GoogleMap myMap;
	static final LatLng YASHADA = new LatLng(18.546042,73.823211);

	public VenueFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_venue, container,
				false);
		myMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.myMapFragment))
				.getMap();
		if (myMap != null) {
			Marker YASHADA_marker = myMap.addMarker(new MarkerOptions().position(
					YASHADA).title("Yashada, Pune"));

			myMap.moveCamera(CameraUpdateFactory.newLatLngZoom(YASHADA, 15));
			myMap.animateCamera(CameraUpdateFactory.zoomTo(18), 3000, null);
		}
		return rootView;
	}
	
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        MapFragment f = (MapFragment) getFragmentManager()
                                             .findFragmentById(R.id.myMapFragment);
        if (f != null) 
            getFragmentManager().beginTransaction().remove(f).commit();
    }

}