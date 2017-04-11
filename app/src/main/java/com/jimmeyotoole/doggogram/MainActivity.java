package com.jimmeyotoole.doggogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ListView lv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create dummy doggo data, to be replaced with a web call soon.
        ArrayList<Doggo> doggos = new ArrayList<Doggo>();
        doggos.add(new Doggo("Charlie","http://nomossgames.com/uploadserver/uploads/1491539018pupwithshoelace.jpg"));
        doggos.add(new Doggo("Sam",""));

        lv_main=(ListView)findViewById(R.id.mainlist);
        MainListViewAdapter mainAdapter = new MainListViewAdapter(this,R.layout.mainrowitem,doggos);
        lv_main.setAdapter(mainAdapter);

        
    }
}
