package com.example.mycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText et1,et2;
	Button b1,b2;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b1.setBackgroundColor(Color.YELLOW);
        b2.setBackgroundColor(Color.YELLOW);
        b1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				String name=et1.getText().toString();
				String name1=et2.getText().toString();
								if (name.equals("") || name1.equals(""))
					Toast.makeText(getApplicationContext(), "Please enter values!", 6000).show();
				else
				{
					int n1=Integer.parseInt(name);
					int n2=Integer.parseInt(name1);
					int res=n1+n2;

				Toast.makeText(getApplicationContext(), "Sum="+res, 5000).show();
				}
			}
		});
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String name=et1.getText().toString();
				String name1=et2.getText().toString();
				
				if (name.equals("") || name1.equals(""))
					Toast.makeText(getApplicationContext(), "Please enter values!", 6000).show();
				else
				{
					int n1=Integer.parseInt(name);
					int n2=Integer.parseInt(name1);
					int res1=n1-n2;
				Toast.makeText(getApplicationContext(), "Diff="+res1, 5000).show();
				}
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
