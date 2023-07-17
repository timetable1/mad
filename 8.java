import androidx.appcompat.app.AppCompatActivity; 
import android.content.Intent;
import android.net.Uri; 
import android.os.Bundle;
import android.provider.ContactsContract; 
import android.view.View;
import android.widget.Button; 
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
EditText number;
Button clear, call, save;

@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main);

number = findViewById((R.id.input)); 
call = findViewById(R.id.callbtn); 
save = findViewById(R.id.savebtn); 
clear = findViewById(R.id.clearbtn);

clear.setOnClickListener(new View.OnClickListener()
{
@Override
public void onClick(View v)
{
number.setText("");
}
});

call.setOnClickListener(new View.OnClickListener()
{
@Override
public void onClick(View v) {
String phno = number.getText().toString(); 
Intent intent = new Intent(Intent.ACTION_DIAL);
 


}
});
 
intent.setData(Uri.parse("tel:" + phno)); startActivity(intent);
 

save.setOnClickListener(new View.OnClickListener()
{
@Override
public void onClick(View v) {
String phno = number.getText().toString();
Intent intent = new Intent(Intent.ACTION_INSERT);

intent.setType(ContactsContract.Contacts.CONTENT_TYPE); 
intent.putExtra(ContactsContract.Intents.Insert.PHONE, phno); 
startActivity(intent);
}
});
}

public void inputNumber(View V)
{
Button btn=(Button) V;
String dig=btn.getText().toString(); 
String phnbr=number.getText().toString(); 
number.setText(phnbr +dig);
}
}
