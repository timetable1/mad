import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle; 
import android.view.View; 
import android.widget.Button;
import android.graphics.BitmapFactory; 
import android.app.WallpaperManager; 
import java.io.IOException;
import java.util.Random; 
import java.util.Timer; 
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
{
Button b1; 
boolean running;
int[] ls = new int[]{R.drawable.i1, R.drawable.i2, R.drawable.i3,R.drawable.i4};
public void start(View v)
{
if (!running) {
new Timer().schedule(new Mytimer(), 0, 3000); 
running = true;
}
}

@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main); 
b1 = (Button) findViewById(R.id.button);
}
 
private class Mytimer extends TimerTask
{
@Override
public void run()
{
try
{
WallpaperManager wp = WallpaperManager.getInstance(getBaseContext()); 
Random random = new Random();
wp.setBitmap(BitmapFactory.decodeResource(getResources(), ls[random.nextInt(4)]));
}
catch (IOException e)
{

}
}
}
}
