package ro.pub.cs.systems.eim.practicaltest01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class PracticalTest01MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_main);
        Log.d("TESTTAG", "mesaj");
        System.out.println("Salut");
    }
}