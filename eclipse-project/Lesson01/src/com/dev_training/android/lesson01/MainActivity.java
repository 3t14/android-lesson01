package com.dev_training.android.lesson01;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Toast.makeText(this, "Hello Android with Toast", Toast.LENGTH_LONG).show();
		
		
		findViewById(R.id.seekBar1).setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		SeekBar seekBar1 = (SeekBar)findViewById(R.id.seekBar1);
		
		Toast.makeText(this, "seekBar1 value = "+seekBar1.getProgress(), Toast.LENGTH_LONG).show();
	}

}
