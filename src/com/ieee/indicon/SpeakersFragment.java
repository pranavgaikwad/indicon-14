package com.ieee.indicon;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class SpeakersFragment extends Fragment {
     
    public SpeakersFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_speakers, container, false);
          
        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.gallery);
        ImageAdapter adapter = new ImageAdapter(getActivity());
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);
        return rootView;
    }
}