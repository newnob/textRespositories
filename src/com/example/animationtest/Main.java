package com.example.animationtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void click1(View v) {
		startActivity(new Intent(this,MainActivity2.class));
	}
	public void click2(View v) {
		startActivity(new Intent(this,MainActivity.class));
	}
	public void click3(View v) {
		startActivity(new Intent(this,MainActivity3.class));
	}
}
