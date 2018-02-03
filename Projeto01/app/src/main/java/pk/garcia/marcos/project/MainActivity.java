package pk.garcia.marcos.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("OnCreate","estou acordando");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart","estou abrindo os olhos");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume","acordei");
    }


}
