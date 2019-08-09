package com.example.soarcs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore.Audio.Genres.Members;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Home extends Activity {
	Button faculty;
	Button members;
	Button acknowledgements;
	Button activities;
	Button pic;
	Button contact;
	Button about;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		faculty = (Button) findViewById(R.id.faculty);
		members = (Button) findViewById(R.id.members);
		acknowledgements = (Button) findViewById(R.id.acknowledgements);
		activities = (Button) findViewById(R.id.activities);
		pic = (Button) findViewById(R.id.pic);
		contact = (Button) findViewById(R.id.contact);
		about = (Button) findViewById(R.id.about);
		faculty.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Home.this, Faculty.class));
			}
		});
		members.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Home.this, Participants.class));
			}
		});
		acknowledgements.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(Home.this, Acknowledgements.class));
				
			}
		});
		
		
		activities.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Home.this, Activities.class));
			}
		});
		pic.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Home.this, Us.class));
			}
		});
		contact.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Home.this, Contact.class));
			}
		});
		about.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Home.this, About.class));
			}
		});
	}
}
