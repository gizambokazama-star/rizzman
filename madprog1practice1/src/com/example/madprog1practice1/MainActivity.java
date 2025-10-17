package com.example.madprog1practice1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity{
	TextView titleText,textViewResult;
	EditText editTextName;
	Button buttonShow;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		titleText=(TextView)findViewById(R.id.titleText);
		textViewResult=(TextView)findViewById(R.id.textViewResult);
		editTextName=(EditText)findViewById(R.id.editTextName);
		buttonShow=(Button)findViewById(R.id.buttonShow);
		buttonShow.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0){
				String result = editTextName.getText().toString();
				textViewResult.setText(result);
			}
		});
	}
}

