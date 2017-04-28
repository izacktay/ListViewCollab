package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.myapplicationdev.android.tw_listview.R.id.tvYear;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> modules;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        modules = new ArrayList<Module>();
        if(year.equals("Year 1")) {
            modules.add(new Module("C105", true));
            modules.add(new Module("C100", false));
            modules.add(new Module("C104", true));
        } else if(year.equals("Year 2")) {
            modules.add(new Module("C208", true));
            modules.add(new Module("C208", false));
            modules.add(new Module("C346", true));
        } else {
            modules.add(new Module("C349", true));
            modules.add(new Module("C000", false));
            modules.add(new Module("C347", true));
        }

        aa = new ModuleAdapter(this, R.layout.row, modules);
        lv.setAdapter(aa);





    }



}
