package ro.pub.cs.systems.eim.practicaltest01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class PracticalTest01MainActivity extends AppCompatActivity {

    private ButtonListener buttonListener = new ButtonListener();
    private MessageBroadcastReceiver messageBroadcastReceiver = new MessageBroadcastReceiver();
    private IntentFilter intentFilter = new IntentFilter();

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_main);
        Log.d(Constants.TAG, "Main Activity onCreate()");

        intentFilter.addAction("ACTION_NAME");
        callActivity();
        callService();
    }

    private void callActivity() {
        Log.d(Constants.TAG, "Main Activity callActivity()");
        Intent intent = new Intent(getApplicationContext(), PracticalTest01SecondaryActivity.class);
        // intent.putExtra(key, value);
        startActivityForResult(intent, Constants.REQUEST_CODE);
    }

    private void callService() {
        Log.d(Constants.TAG, "Main Activity callService()");
        Intent intent = new Intent(getApplicationContext(), PracticalTest01Service.class);
        // intent.putExtra(key, value);
        getApplicationContext().startService(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        Log.d(Constants.TAG, "Main Activity onActivityResult()");
        /*
        if (requestCode == Constants.SECONDARY_ACTIVITY_REQUEST_CODE) {
            Toast.makeText(this, "The activity returned with result " + resultCode, Toast.LENGTH_LONG).show();
        }
         */
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Intent intent = new Intent(this, PracticalTest01Service.class);
        stopService(intent);
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(Constants.TAG, "Main Activity onPause()");
        unregisterReceiver(messageBroadcastReceiver);
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(messageBroadcastReceiver, intentFilter);
        Log.d(Constants.TAG, "Main Activity onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        /*
            outState.putString(key, value);
         */
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        /*
            savedInstanceState.getString(key, default_value);
         */
    }
}