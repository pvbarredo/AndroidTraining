package barredo.peter.training.activity;

import android.app.Service;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import barredo.peter.training.R;
import barredo.peter.training.service.ServiceTraining;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setLogo(R.drawable.ic_amazon);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);

    }

    public void startService(View view){
//        Intent intent = new Intent(ThirdActivity.this, ServiceTraining.class);
//        startService(intent);

        Intent intent = new Intent(ThirdActivity.this, drawerTraining.class);
        startActivity(intent);
    }

    public void stopService(View view){
        Intent intent = new Intent(ThirdActivity.this, ServiceTraining.class);
        stopService(intent);
    }

}
