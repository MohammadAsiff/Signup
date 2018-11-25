package com.example.sys.signup;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.registration );
       MyText b=findViewById( R.id.signup );
       b.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity( new Intent( Main2Activity.this,Main3Acitvity.class ) );

           }
       } );


    }
}
