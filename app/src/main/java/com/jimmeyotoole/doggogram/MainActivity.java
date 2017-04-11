package com.jimmeyotoole.doggogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ListView lv_main;
    public TextView tv_hellotext,tv_text2;

    public String myname;
    private int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myname="James";
        age=4;

        //Create dummy doggo data, to be replaced with a web call soon.
        ArrayList<Doggo> doggos = new ArrayList<Doggo>();
        doggos.add(new Doggo("Charlie","http://nomossgames.com/uploadserver/uploads/1491539018pupwithshoelace.jpg"));
        doggos.add(new Doggo("Sam","http://www.japspitz.com/wp-content/uploads/Portia-4-Japanese-Spitz.jpg"));
        doggos.add(new Doggo("Bernard","https://s-media-cache-ak0.pinimg.com/736x/10/db/7d/10db7d31b07272343588e1eb32d6b904.jpg"));

        //Binding variables to XML elements
        lv_main=(ListView)findViewById(R.id.mainlist);
        tv_hellotext = (TextView)findViewById(R.id.hellotext);


        //Update UI variables
        MainListViewAdapter mainAdapter = new MainListViewAdapter(this,R.layout.mainrowitem,doggos);
        lv_main.setAdapter(mainAdapter);
        tv_hellotext.setText("Are you a good boy " + myname + "?");


    }
}
