package com.example.supakit.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.supakit.bmicalculator.R.attr.height;
import static com.example.supakit.bmicalculator.R.drawable.bmi;
import static com.example.supakit.bmicalculator.R.id.textView;
import static com.example.supakit.bmicalculator.R.styleable.View;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener {
    float weight=0;
    float height=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView2=(TextView)findViewById(R.id.textView2);
        textView2.setOnClickListener(this);
        TextView textView4=(TextView)findViewById(R.id.textView4);
        textView4.setOnClickListener(this);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView textView=(TextView)findViewById(R.id.textView2);
        textView.setText(" ");int id=v.getId();
        if(id==R.id.textView2){
            textView.setText(textView.getText()+" ");
        }if(id ==R.id.textView4){
            textView.setText(textView.getText()+" ");
        }float weight=0;
        float height=0;
        Intent intent=new Intent(MainActivity.this,Human.class);
        intent.putExtra("",-1);

        AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("ป้อนข้อมูลไม่ครบ");
    }
}
