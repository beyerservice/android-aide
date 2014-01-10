package de.beyerservice.saghallo;

import android.app.*;
import android.os.*;
import android.speech.tts.*;
import android.speech.tts.TextToSpeech.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.util.*;

public class MainActivity extends Activity implements OnInitListener, OnClickListener
{

	private TextToSpeech tts;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		tts = new TextToSpeech(this, this);
    }

	@Override
	public void onInit(int arg0)
	{
		tts.setLanguage(Locale.GERMAN);
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		EditText editText = (EditText)findViewById(R.id.editText1);
		
		tts.speak(editText.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
		
	}



}
