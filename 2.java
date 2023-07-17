import androidx.appcompat.app.AppCompatActivity; 
import android.os.Bundle;
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView;
 

public class MainActivity extends AppCompatActivity 
{ 
EditText e1,e2;
TextView tv;

@Override
protected void onCreate(Bundle savedInstanceState) 
{ super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main);
e1 =(EditText)findViewById(R.id.editText1); 
e2 = (EditText)findViewById(R.id.editText2); 
tv= (TextView)findViewById(R.id.textView2);
}

public void add(View v)
{
int a1=Integer.parseInt(e1.getText().toString()); 
int a2= Integer.parseInt(e2.getText().toString()); 
int result=a1+a2;
tv.setText(""+result);
}

public void sub(View v)
{
int a1=Integer.parseInt(e1.getText().toString()); 
int a2= Integer.parseInt(e2.getText().toString()); 
int result=a1-a2;
tv.setText(""+result);
}

public void mul(View v)
{
int a1=Integer.parseInt(e1.getText().toString()); 
int a2= Integer.parseInt(e2.getText().toString()); 
int result=a1*a2;
tv.setText(""+result);
}

public void div(View v)
{
int a1=Integer.parseInt(e1.getText().toString()); 
int a2= Integer.parseInt(e2.getText().toString()); 
int result=a1/a2;
tv.setText(""+result);
}
 

}
