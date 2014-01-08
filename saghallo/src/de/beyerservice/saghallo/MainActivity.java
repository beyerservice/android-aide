package de.beyerservice.saghallo;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.speech.tts.*;
/** das obere tut nicht. Er findet OnInitListener nicht  */
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import java.util.*;

public class MainActivity extends Activity implements OnInitListener
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
		tts.speak("Hallo!", TextToSpeech.QUEUE_FLUSH, null);

	}


}
