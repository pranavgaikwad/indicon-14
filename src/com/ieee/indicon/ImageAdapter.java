package com.ieee.indicon;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ImageAdapter extends PagerAdapter {
	Context context;
	private int[] GalImages = new int[] { R.drawable.s1, R.drawable.s2,
			R.drawable.s3,R.drawable.s4,R.drawable.s5,R.drawable.s6 };
	private String[] ImageInfo = new String[]{"IEEE President and CEO","Former Secretory, Department of Defence R&D,\nScientific Advisor to Raksha Mantri,\nDirector General of DRDO & ADA","IIT Delhi","Martin Casado","Iowa State University","Senior Research Fellow\nCurtin University"};
	LayoutInflater myInflater;
	
	ImageAdapter(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		return GalImages.length;
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == ((ScrollView) object);
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		
		myInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View myView = myInflater.inflate(R.layout.container, container,false);
		
		TextView txtView = (TextView)myView.findViewById(R.id.speaker_info_container);
		ImageView imgView = (ImageView)myView.findViewById(R.id.speaker_container_image);
		
//		ImageView imageView = new ImageView(context);
//		imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
//		imageView.setImageResource(GalImages[position]);
//		((ViewPager) container).addView(imageView, 0);
		txtView.setText(ImageInfo[position]);
		imgView.setImageResource(GalImages[position]);
		((ViewPager)container).addView(myView);
		return myView;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		((ViewPager) container).removeView((ScrollView) object);
	}
}