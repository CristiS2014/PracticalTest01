package ro.pub.cs.systems.eim.practicaltest01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class PracticalTest01SecondaryActivity extends AppCompatActivity {

    private ButtonListener buttonListener = new ButtonListener();

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            /*
            setResult(Activity.RESULT_OK, null);
            finish();
             */
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_secondary);

        Log.d(Constants.TAG, "Secondary Activity onCreate()");

        Intent intent = getIntent();
        if (intent != null) { //intent.getExtras().containsKey(key)
            Log.d(Constants.TAG, "Received Intent");
        }
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
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
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