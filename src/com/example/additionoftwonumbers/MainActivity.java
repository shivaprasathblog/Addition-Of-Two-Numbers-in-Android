package com.example.additionoftwonumbers;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity 

{
	//Define Edittext and Button as et1,et2,et3 & b respectively
	EditText et1,et2,et3;
	Button b;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		////Refer the edittext,button with their respective id's from XML
		et1=(EditText)findViewById(R.id.editText1);
		et2=(EditText)findViewById(R.id.editText2);
		et3=(EditText)findViewById(R.id.editText3);
		b=(Button)findViewById(R.id.button1);
		

		////Set the listener for Button , we use onclik listener here
		b.setOnClickListener( new OnClickListener( ) 
		{
			
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
			
				 //	Get the values from Edittext et1 & et2 and store in value 1 & value2 add the two and store in value3
				 //parseInt(String s): This returns an integer (decimal only).
				 int value1=Integer.parseInt(et1.getText().toString());
			     int value2=Integer.parseInt(et2.getText().toString());
				 int value3=value1+value2;
				 //Set the total in et3
				 et3.setText("The total is : "+value3);
				
			}
		});
	}



}
