package com.magdusz.thingstobuy;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    public static final String DEBBUGTAG = "MGD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButtonListener();

        //generate list
        ArrayList<String> list = new ArrayList<String>();
        list.add("item1");
        list.add("item2");
        list.add("item3");

        //instantiate custom adapter
        MyCustomAdapter adapter = new MyCustomAdapter(list, this);

        //handle listview and assign adapter
        ListView lView = (ListView)findViewById(R.id.listView);
        lView.setAdapter(adapter);

    }

    private void addButtonListener() {
        ImageView addBtn = (ImageView)findViewById(R.id.fab);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(DEBBUGTAG, "Klik ino jeden");

            }
        });
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
