package com.example.sys.signup;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
         MyText b=findViewById( R.id.sign );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startActivity( new Intent( MainActivity.this,Main2Activity.class ) );
            }
        } );
    }

}
