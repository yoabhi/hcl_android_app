package com.yoAbhi.hclcdc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		Thread t = new Thread(){
			
		
		public void run(){
		try{
			sleep(3000);
		}catch(InterruptedException e){
			
			e.printStackTrace();
		}finally{
			Intent i = new Intent("com.yoAbhi.hclcdc.MAIN");
			startActivity(i);
		}
	}
		};
		
		t.start();
		}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
