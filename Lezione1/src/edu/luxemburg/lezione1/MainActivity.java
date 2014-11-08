package edu.luxemburg.lezione1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	int contatore;
	TextView tvContatore;
	Button add, sub;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		contatore = 0;
		tvContatore = (TextView) findViewById(R.id.tvContatore);
		add = (Button) findViewById(R.id.bAdd);
		sub = (Button) findViewById(R.id.bSub);

		add.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				contatore++;
				tvContatore.setText("Contatore = " + contatore);
			}

		});
		sub.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				contatore--;
				tvContatore.setText("Contatore = " + contatore);

			}

		});
	}

}
