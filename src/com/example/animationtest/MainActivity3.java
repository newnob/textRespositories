package com.example.animationtest;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends Activity {
	private ImageView left;
	private ImageView right;
	private Button click;
	private Animation leftAnim;
	private Animation rightAnim;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		left = (ImageView) findViewById(R.id.left);
		right = (ImageView) findViewById(R.id.right);
		click = (Button) findViewById(R.id.click);
		
		rightAnim = new RotateAnimation(0, 45, Animation.RELATIVE_TO_SELF, 1, Animation.RELATIVE_TO_SELF, 1);
		rightAnim.setDuration(500);
		rightAnim.setFillAfter(true);
		
		leftAnim = new RotateAnimation(0, -45, Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 1);
		leftAnim.setDuration(500);
		leftAnim.setFillAfter(true);
		
		click.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				right.startAnimation(rightAnim);
				left.startAnimation(leftAnim);
			}
		});
	}

}
