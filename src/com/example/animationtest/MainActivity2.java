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
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends Activity {
	private ImageView xx;
	private ImageView zui;
	private Button click;
	private Animation xxAnim;
	private AnimationDrawable animationDrawable ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main1);
		xx = (ImageView) findViewById(R.id.xx);
		zui = (ImageView) findViewById(R.id.zui);
		click = (Button) findViewById(R.id.click);
		
		zui.setBackgroundResource(R.drawable.zui);//设置背景为嘴动画
		animationDrawable = (AnimationDrawable) zui.getBackground();//获取动画
		xxAnim = AnimationUtils.loadAnimation(MainActivity2.this, R.anim.bizui);//加载xx动画
		xxAnim.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				animationDrawable.start();//播放嘴部动画
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				animationDrawable.stop();//嘴部动画停止
			}
		});
		
		click.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				xx.startAnimation(xxAnim);//开始xx动画
			}
		});
	}

}
