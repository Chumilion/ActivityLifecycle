package chumilion.activitylifecycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity
{
    TextView onCreateC;
    TextView onStartC;
    TextView onResumeC;
    TextView onPauseC;
    TextView onStopC;
    TextView onRestartC;
    TextView onDestroyC;
    int onCreateint = 0;
    int onStartint = 0;
    int onResumeint = 0;
    int onPauseint = 0;
    int onStopint = 0;
    int onRestartint = 0;
    int onDestroyint = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onCreateC = (TextView) findViewById(R.id.onCreateCount);
        onStartC = (TextView) findViewById(R.id.onStartCount);
        onResumeC = (TextView) findViewById(R.id.onResumeCount);
        onPauseC = (TextView) findViewById(R.id.onPauseCount);
        onStopC = (TextView) findViewById(R.id.onStopCount);
        onRestartC = (TextView) findViewById(R.id.onRestartCount);
        onDestroyC = (TextView) findViewById(R.id.onDestroyCount);

        onCreateint++;
        Log.i("onCreate", onCreateint + "");
        Log.i("onCreate", onCreateC + "");
        onCreateC.setText(onCreateint + "");
        onStartC.setText(onStartint + "");
        onResumeC.setText(onResumeint + "");
        onPauseC.setText(onPauseint + "");
        onStopC.setText(onStopint + "");
        onRestartC.setText(onRestartint + "");
        onDestroyC.setText(onDestroyint + "");


    }
    protected void onStart() {
        super.onStart();

        onStartint++;
        Log.i("onStart", onStartint + "");

        onStartC.setText(onStartint + "");
    }
    protected void onResume() {
        super.onResume();

        onResumeint++;
        Log.i("onResume", onResumeint + "");

        onResumeC.setText(onResumeint + "");
    }

    protected void onPause() {
        super.onPause();

        onPauseint++;
        Log.i("onPause", onPauseint + "");

        onPauseC.setText(onPauseint + "");
    }

    protected void onStop() {
        super.onStart();

        onStopint++;
        Log.i("onStart", onStopint + "");

        onStartC.setText(onStopint + "");
    }
    protected void onRestart() {
        super.onResume();

        onRestartint++;
        Log.i("onResume", onRestartint + "");

        onResumeC.setText(onRestartint + "");
    }

    protected void onDestroy() {
        super.onPause();

        onDestroyint++;
        Log.i("onPause", onDestroyint + "");

        onPauseC.setText(onDestroyint + "");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
