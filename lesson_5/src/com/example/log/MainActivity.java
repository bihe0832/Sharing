package com.example.log;

import com.example.log.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * 
 * @author hardyshi(bihe0832@foxmail.com)
 * 
 * @
 */
public class MainActivity extends Activity {
	
	public static final String TAG = "LOG";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button tagEmptyButton = (Button) findViewById(R.id.tagEmpty);
		Button tagLargeButton = (Button) findViewById(R.id.tagLarge);
		Button msgEmptyButton = (Button) findViewById(R.id.msgEmpty);
		Button msgLargeButton = (Button) findViewById(R.id.msgLarge);
		// TAG empty
		tagEmptyButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					Log.d(TAG, "*********************LOG TAG EMPTY*******************");
					Log.d("", "LOG TAG　IS EMPTY");
					Log.d(TAG, "*********************LOG TAG EMPTY*******************");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		// TAG Large
		tagLargeButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					Log.d(TAG, "*********************LOG TAG LARGE*******************");
					String temptag = "LOG";
					for(int i = 0; i<100;i++){
						Log.d(temptag, "LOG TAG　IS:"+temptag.length());
						if(i%2 < 1){
							temptag = temptag + "S";
						}else{
							temptag = temptag + "B";
						}
					}
					Log.d(TAG, "*********************LOG TAG LARGE*******************");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		// MSG empty
		msgEmptyButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					Log.d(TAG, "*********************LOG MSG EMPTY*******************");
					Log.d(TAG, "");
					Log.d(TAG, "*********************LOG MSG EMPTY*******************");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		// MSG Large
		msgLargeButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					StringBuilder  tempMSG = new StringBuilder();
					int i = 0;
					for(; i< 64*1024-2 ;i=i+5){
						if(i%2 < 1){
							tempMSG.append("SBSBS");
						}else{
							tempMSG.append("BSBSB");
						}
					}
					Log.d(TAG, "*********************LOG MSG LARGE*******************");
					for(int j = 0; j<5;j++){
						Log.d(TAG, tempMSG.toString());
						Log.d(TAG, tempMSG.toString().length()+"");
						tempMSG.append(j);
					}
					Log.d(TAG, "*********************LOG MSG LARGE*******************");
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

}
