package barredo.peter.training.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import barredo.peter.training.R;
import layout.SecondFragment;
import layout.FirstFragment;


public class MainActivity extends AppCompatActivity {
    public static final String MY_TAG = "the_custom_message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG,"onCREATE first activity");

    }

    public void btn_click(View view){
        Log.i(MY_TAG , "Button was click");
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);

    }

    public void changeFragment(View view){

        if(view == findViewById(R.id.fragmentBtn1)){
            FirstFragment fragment = new FirstFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentFirst, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }

        if(view == findViewById(R.id.fragmentBtn2)){
            SecondFragment fragmentSecond = new SecondFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentFirst,fragmentSecond);
            transaction.addToBackStack(null);
            transaction.commit();
        }




    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG,"onDestroy first activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MY_TAG,"onRestart first activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG,"onPause first activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG,"onStart first activity");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG,"onStop first activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG,"onResume first activity");
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertBuilder =  new AlertDialog.Builder(MainActivity.this);
        alertBuilder.setMessage("Do you want to close the app?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

        AlertDialog alert = alertBuilder.create();
        alert.setTitle("Alert");
        alert.show();
    }
}
