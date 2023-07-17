import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech; 
import android.view.View;
import android.widget.Button; 
import android.widget.EditText; 
import java.util.Locale;
public class MainActivity extends AppCompatActivity
 { 
EditText t;
Button b;
 TextToSpeech ts; 
@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main);

t = findViewById(R.id.editTextText); 
b = findViewById(R.id.button);
 


ts = new TextToSpeech(getApplicationContext(), 
new TextToSpeech.OnInitListener()
{
@Override
public void onInit(int i)
{




if(i!=TextToSpeech.ERROR)
{
 


}
});
 

ts.setLanguage(Locale.UK);
}
 


b.setOnClickListener(new View.OnClickListener()
{
@Override
public void onClick(View v)
{

ts.speak(t.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
}
});

}
}
