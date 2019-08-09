package com.example.soarcs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Acknowledgements extends Activity {
	
	Button back5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_acknowledgements);
		
		back5 = (Button) findViewById(R.id.back5);
		back5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(Acknowledgements.this, Home.class));
				
			}
		});
		
	}

	
}
