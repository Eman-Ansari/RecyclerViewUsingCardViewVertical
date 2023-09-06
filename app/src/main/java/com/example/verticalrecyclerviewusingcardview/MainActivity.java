package com.example.verticalrecyclerviewusingcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv=(RecyclerView) findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new adapter( dataqueue());
        rcv.setAdapter(adapter);
    }
    public ArrayList<model> dataqueue(){
        ArrayList<model> holder = new ArrayList<>();
        model ob1=new model();
        ob1.setHeader("EMAN ANSARI");
        ob1.setDesc("Welcome to Eman Git Hub Account");
        ob1.setImgname(R.drawable.img);
        holder.add(ob1);
        model ob2=new model();
        ob2.setHeader("EMAN ANSARI");
        ob2.setDesc("Welcome to Eman Git Hub Account");
        ob2.setImgname(R.drawable.img);
        holder.add(ob2);
        model ob3=new model();
        ob3.setHeader("EMAN ANSARI");
        ob3.setDesc("Welcome to Eman Git Hub Account");
        ob3.setImgname(R.drawable.img);
        holder.add(ob3);

        model ob4=new model();
        ob4.setHeader("EMAN ANSARI");
        ob4.setDesc("Welcome to Eman Git Hub Account");
        ob4.setImgname(R.drawable.img);
        holder.add(ob4);

        model ob5=new model();
        ob5.setHeader("EMAN ANSARI");
        ob5.setDesc("Welcome to Eman Git Hub Account");
        ob5.setImgname(R.drawable.img);
        holder.add(ob5);

        model ob6=new model();
        ob6.setHeader("EMAN ANSARI");
        ob6.setDesc("Welcome to Eman Git Hub Account");
        ob6.setImgname(R.drawable.img);
        holder.add(ob6);

        return holder;
    }
}