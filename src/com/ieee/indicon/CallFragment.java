package com.ieee.indicon;
import android.app.Fragment;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
 
public class CallFragment extends Fragment {
     
    public CallFragment(){}
    
    TextView call_for_papers;
     
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_call, container, false);
       
        call_for_papers = (TextView) rootView.findViewById(R.id.callText);
        call_for_papers.setMovementMethod(LinkMovementMethod.getInstance());
        return rootView;
    }
}