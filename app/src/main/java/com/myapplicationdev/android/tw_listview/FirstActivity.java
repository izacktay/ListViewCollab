package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<String> year;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)this.findViewById(R.id.lvYear);

        year = new ArrayList<String>();
        year.add("Year 1");
        year.add("Year 2");
        year.add("Year 3");

        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, year);
        lv.setAdapter(aa);

//        Intent i = getIntent();
//        String year = i.getStringExtra("year");
//        tvYear.setText(year);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedYear = year.get(position).toString();

                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                i.putExtra("year", selectedYear);
                startActivity(i);


            }
        });






    }
}
