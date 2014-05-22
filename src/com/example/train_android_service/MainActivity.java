package com.example.train_android_service;

import android.os.Bundle;
import android.R.id;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	     super.onCreate(savedInstanceState);
	     setContentView(R.layout.activity_main);
	     Button buttonStartService = (Button)findViewById(R.id.btn_start);
	  
	     buttonStartService.setOnClickListener(new Button.OnClickListener(){

	 @Override
	 public void onClick(View arg0) {
	  // TODO Auto-generated method stub
	  Intent intent = new Intent(MainActivity.this, MyService.class);
	  startService(intent);
	 }});
	  
	  
	 }
}
