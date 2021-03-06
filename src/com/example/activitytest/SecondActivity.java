package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.view.View.OnClickListener;


public class SecondActivity extends BaseActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.d("SecondActivity","Task id is "+getTaskId());
		//Log.d("SecondActivity",this.toString());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		Button button2 = (Button)findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
				//intent.putExtra("data_return", "Hello FirstActivity");
				//setResult(RESULT_OK,intent);
				//finish();
				startActivity(intent);
			}
		});
		//Intent intent = getIntent();
		//String data = intent.getStringExtra("extra_data");
		//Log.d("SecondActivity",data);
	}
	@Override
	public void onBackPressed(){
		Intent intent = new Intent();
		intent.putExtra("data_return", "Hello FirstActivity");
		setResult(RESULT_OK,intent);
		finish();
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		Log.d("SecondActivity","onDestroy");
	}
	
	

}
