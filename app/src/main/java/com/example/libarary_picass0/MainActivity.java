package com.example.libarary_picass0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        button=findViewById(R.id.button);


        Picasso.get()
                .load("https://images.unsplash.com/photo-1630987871777-f7b2d62894d0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8ZGhha2ElMjBjaXR5fGVufDB8fDB8fA%3D%3D&w=1000&q=80")
                .into(imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load("https://cdn.britannica.com/97/189797-050-1FC0041B/Night-view-Dhaka-Bangladesh.jpg")
                        .into(imageView);
            }

        });
       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load("https://images.unsplash.com/photo-1630987871777-f7b2d62894d0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8ZGhha2ElMjBjaXR5fGVufDB8fDB8fA%3D%3D&w=1000&q=80")
                        .into(imageView);
            }
        });*/
    }
}