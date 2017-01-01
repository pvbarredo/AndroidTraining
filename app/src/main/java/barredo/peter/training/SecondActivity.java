package barredo.peter.training;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public static final String MY_TAG = "the_custom_message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(MY_TAG,"onCreate second activity");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.ic_car);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void display_toast(View view){
        Log.i(MY_TAG,"TOAST");

        Toast.makeText(SecondActivity.this,"Sampleas dasdasdasd",Toast.LENGTH_LONG).show();
    }

    public void call_third_activity(View view){
        startActivity(new Intent(getApplication(),ThirdActivity.class));
    }




    public void displayNotify(View view){
        Log.i(MY_TAG,"DISPLAY");
        Intent intent = new Intent();
        PendingIntent pendingIntent = PendingIntent.getActivity(SecondActivity.this, 0, intent,0);
        Notification notification = new Notification.Builder(SecondActivity.this)
                    .setTicker("Meron kang sample notification . iyong buksan")
                    .setContentTitle("Ssample Notification")
                    .setContentText("This is a sample text notification")
                        .setSmallIcon(R.mipmap.ic_launcher)
                    .addAction(R.drawable.ic_car,"Yes", pendingIntent)
                    .addAction(R.mipmap.ic_cofee,"No", pendingIntent)
                    .setContentIntent(pendingIntent)
                    .getNotification();
        notification.flags = Notification.FLAG_AUTO_CANCEL;
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0,notification);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.second_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.app_bar_item:
                Toast.makeText(getApplicationContext(), "Item is selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.app_bar_search:
                Toast.makeText(getApplicationContext(),"Search is selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG," onDestroy second activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MY_TAG,"onRestart second activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG,"onPause second activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG,"onStart second activity");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG,"onStop second activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG,"onResume second activity");
    }


}
