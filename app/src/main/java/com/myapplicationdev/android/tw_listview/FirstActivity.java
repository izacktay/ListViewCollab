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
    ArrayList<String> year;
    ArrayAdapter<String> aa;

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

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedYear = year.get(position).toString();

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                intent.putExtra("year", selectedYear);

                startActivity(intent);
            }
        });

    }
}
