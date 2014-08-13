package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
Button addition,subtraction,multiplication,division;
EditText ed1,ed2;
TextView txt1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
 	addition = (Button) findViewById(R.id.addbtn);
		subtraction =(Button) findViewById(R.id.subbtn);
	 multiplication =(Button) findViewById(R.id.mulbtn);
	 division =(Button) findViewById(R.id.divbtn);
	ed1 = (EditText) findViewById (R.id.ed1);
	ed2 = (EditText) findViewById (R.id.ed2);
	txt1=(TextView) findViewById(R.id.textView1);
	addition.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			int edt1,edt2,res,res1;
			edt1 = Integer.parseInt(ed1.getText().toString());
			edt2=Integer.parseInt(ed2.getText().toString());
			
			if(addition.getText().equals("add"))
			{
				res=edt1+edt2;
				System.out.println("ADD " +res);
				txt1.setText("" +res);
			}
			else if(subtraction.getText().equals("sub"))
			{
				System.out.println("SUB " );
			}
			else if(multiplication.getText().equals("mul"))
			{
				System.out.println("MUL " +(edt1*edt2));
			}
			else if(division.getText().equals("div"))
			{
				System.out.println("DIV " +(edt1/edt2));
			}
		}
	
			});
	subtraction.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int edt1,edt2,res,res1;
			edt1 = Integer.parseInt(ed1.getText().toString());
			edt2=Integer.parseInt(ed2.getText().toString());
			if(subtraction.getText().equals("sub"))
			{
				res=edt1-edt2;
				System.out.println("SUB " +res);
				txt1.setText("" +res);
			}
			else if(multiplication.getText().equals("mul"))
			{
				System.out.println("MUL " +(edt1*edt2));
			}
			else if(division.getText().equals("div"))
			{
				System.out.println("DIV " +(edt1/edt2));
			}
	}
		
	});
	multiplication.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int edt1,edt2,res,res1;
			edt1 = Integer.parseInt(ed1.getText().toString());
			edt2=Integer.parseInt(ed2.getText().toString());
			if(multiplication.getText().equals("mul"))
			{
				res=edt1*edt2;
				System.out.println("MUL " +res);
				txt1.setText("" +res);
			}
			else if(division.getText().equals("div"))
			{
				System.out.println("DIV " +(edt1/edt2));
			}
		}
});
	division.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int edt1,edt2,res,res1;
			edt1 = Integer.parseInt(ed1.getText().toString());
			edt2=Integer.parseInt(ed2.getText().toString());
			if(division.getText().equals("div"))
			{
				res=edt1/edt2;
				System.out.println("DIV " +res);
				txt1.setText("" +res);
			}
		
		}
	});
	
}
}
	
	

	