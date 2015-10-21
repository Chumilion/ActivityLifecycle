package chumilion.activitylifecycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView onCreateC;
    private TextView onStartC;
    private TextView onResumeC;
    private TextView onPauseC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onCreateC = (TextView) findViewById(R.id.onCreateCount);
        onStartC = (TextView) findViewById(R.id.onStartCount);
        onResumeC = (TextView) findViewById(R.id.onResumeCount);
        onPauseC = (TextView) findViewById(R.id.onPauseCount);

        onCreateC.setText((Integer.parseInt(onCreateC.getText() + "") + 1) + "");

    }
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);

        onStartC.setText((Integer.parseInt(onStartC.getText() + "") + 1) + "");
    }
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);

        onResumeC.setText((Integer.parseInt(onResumeC.getText() + "") + 1) + "");
    }

    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);

        onPauseC.setText((Integer.parseInt(onPauseC.getText() + "") + 1) + "");
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
