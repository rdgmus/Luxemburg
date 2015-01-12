package edu.luxemburg.lezione6;

import edu.luxemburg.lezione6.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity {

	//Dichiarazione variabili
	Button bPlay;
	CheckBox cbMusica;
	MediaPlayer music;
	SharedPreferences getPrefs;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Costruttore MediaPlayer
		music = MediaPlayer.create(getApplicationContext(), R.raw.sounds_knob);
		//Costruttore SharedPreferences
		getPrefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
		
		//Collegamento delle variabili agli oggetti grafici
		bPlay = (Button)findViewById(R.id.bPlay);
		
		cbMusica = (CheckBox)findViewById(R.id.cbMusica);
		
		//Gestione eventi oggetti grafici
		bPlay.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(musicIsEnabled()){
					music.start();
				}
			}
		});
		
		
		cbMusica.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@SuppressLint("NewApi")
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				Editor editor = getPrefs.edit();
				editor.putBoolean("music", isChecked);
				editor.apply();
			}
		});
	}


	protected boolean musicIsEnabled() {
		// TODO Auto-generated method stub
		return getPrefs.getBoolean("music", true);
	}

}
