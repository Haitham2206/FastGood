package haitham.kinneret.fastgoodfood;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;



public class StartActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        startActivity(new Intent(StartActivity.this,MainActivity.class));

        finish();
    }
}

