package com.example.godiegogo;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;
import android.content.Intent;
import java.util.LinkedList;
import com.example.godiegogo.R;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class LoadingPageActivity extends AppCompatActivity {
    public LinkedList<String> copied_songs;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_page);

        copied_songs = new LinkedList<String>();
        copied_songs.add("Song Name 1");
        copied_songs.add("Song Name 2");
        copied_songs.add("Song Name 3");

        ListView lv = (ListView) findViewById(R.id.songlist);
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, copied_songs);
        lv.setAdapter(itemsAdapter);

        final Button button = findViewById(R.id.main_menu_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button.setBackgroundColor(Color.BLUE);
                finish();
            }
        });
    }
}