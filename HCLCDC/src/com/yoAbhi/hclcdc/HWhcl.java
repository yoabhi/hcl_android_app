package com.yoAbhi.hclcdc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HWhcl extends Activity implements OnClickListener {

	Button send;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hwactivity_hclcert);
		
		send=(Button)findViewById(R.id.send);
		send.setOnClickListener(this);
		
		}


		@Override
		public void onClick(View arg0) {
			Intent i = new Intent(HWhcl.this,Enquiry.class);
			startActivity(i);
		}

	}
