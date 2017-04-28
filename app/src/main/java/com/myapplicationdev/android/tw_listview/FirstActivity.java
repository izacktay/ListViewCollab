package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.myapplicationdev.android.tw_listview.R.id.tvYear;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        al = new ArrayList<String>();
        al.add("Year 1");
        al.add("Year 2");
        al.add("Year 3");

        aa = new ArrayAdapter<String>(this, R.layout.activity_main, al);
        lv.setAdapter(aa);

//        Intent i = getIntent();
//        String year = i.getStringExtra("year");
//        tvYear.setText(year);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedModule = al.get(position);

                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                i.putExtra("modules", selectedModule);
                startActivity(i);


            }
        });






    }
}
