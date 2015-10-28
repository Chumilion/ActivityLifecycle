package chumilion.activitylifecycle;

import android.content.Context;
import android.content.SharedPreferences;
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
    SharedPreferences.Editor mySPEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences mySP = getPreferences(Context.MODE_PRIVATE);
        mySPEditor = mySP.edit();

        onCreateC = (TextView) findViewById(R.id.onCreateCount);
        onStartC = (TextView) findViewById(R.id.onStartCount);
        onResumeC = (TextView) findViewById(R.id.onResumeCount);
        onPauseC = (TextView) findViewById(R.id.onPauseCount);
        onStopC = (TextView) findViewById(R.id.onStopCount);
        onRestartC = (TextView) findViewById(R.id.onRestartCount);
        onDestroyC = (TextView) findViewById(R.id.onDestroyCount);

        onCreateint = mySP.getInt("onCreateint", 0);
        onStartint = mySP.getInt("onStartint", 0);
        onResumeint = mySP.getInt("onResumeint", 0);
        onPauseint = mySP.getInt("onPauseint", 0);
        onStopint = mySP.getInt("onStopint", 0);
        onRestartint = mySP.getInt("onRestartint", 0);
        onDestroyint = mySP.getInt("onDestroyint", 0);

        onCreateint++;
        Log.i("onCreate", onCreateint + "");
        Log.i("onCreate", onCreateC + "");
        mySPEditor.putInt("onCreateint", onCreateint);

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
        mySPEditor.putInt("onStartint", onStartint);

        onStartC.setText(onStartint + "");
    }
    protected void onResume() {
        super.onResume();

        onResumeint++;
        Log.i("onResume", onResumeint + "");
        mySPEditor.putInt("onResumeint", onResumeint);

        onResumeC.setText(onResumeint + "");
    }

    protected void onPause() {
        super.onPause();

        onPauseint++;
        Log.i("onPause", onPauseint + "");
        mySPEditor.putInt("onPauseint", onPauseint);

        onPauseC.setText(onPauseint + "");
        mySPEditor.commit();
    }

    protected void onStop() {
        super.onStart();

        onStopint++;
        Log.i("onStart", onStopint + "");
        mySPEditor.putInt("onStopint", onStopint);

        onStopC.setText(onStopint + "");
        mySPEditor.commit();
    }
    protected void onRestart() {
        super.onResume();

        onRestartint++;
        Log.i("onResume", onRestartint + "");
        mySPEditor.putInt("onResumeint", onResumeint);

        onRestartC.setText(onRestartint + "");
        mySPEditor.commit();
    }

    protected void onDestroy() {
        super.onDestroy();

        onDestroyint++;
        Log.i("onDestroy", onDestroyint + "");
        mySPEditor.putInt("onDestroyint", onDestroyint);

        onDestroyC.setText(onDestroyint + "");
        mySPEditor.commit();
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
