package org.shellzero.buttonclickcount;

import android.view.View;
import android.view.View.OnClickListener;

public class OurOnClickListener implements OnClickListener {
	
	MainActivity caller;
	private int count;
	
	public OurOnClickListener(MainActivity activity){
		this.caller = activity;
		this.count = 0;
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		count = count + 1;
		String outputText = "The Button has been clicked "+ count + " time";
		if(count != 1)
			outputText +="s";
		
		caller.theTextView.setText(outputText);
			
	}

}
