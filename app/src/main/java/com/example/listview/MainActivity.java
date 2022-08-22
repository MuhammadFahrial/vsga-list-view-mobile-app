package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi List View
    private ListView listItem;
    private String[] namanegara = new String[]{
            "Indonesia", "Malaysia", "Singapore", "Italia", "Japan", "Spanyol", "Thailand", "Laos", "Brunei Darussalam"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Just List View");

        // Binding atau Format Data
        listItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);

        //Set data List View
        listItem.setAdapter(adapter);

        listItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "Memilih : " + namanegara[position], Toast.LENGTH_LONG).show();
            }
        });
        };
    }