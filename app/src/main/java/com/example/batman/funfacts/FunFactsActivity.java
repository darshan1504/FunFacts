package com.example.batman.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends AppCompatActivity {
    // Define all Viewport Variables
    private static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel(); 
    private TextView factTextView;
    private Button factButton;
    private RelativeLayout relativeLayout;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        factTextView = (TextView) findViewById(R.id.factTextView);
        factButton = (Button) findViewById(R.id.factButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String facts = factBook.getFacts();
                String bgcolor = colorWheel.getColor();
                factTextView.setText(facts);
                relativeLayout.setBackgroundColor(Color.parseColor(bgcolor));
                factButton.setTextColor(Color.parseColor(bgcolor));
            }
        };
        factButton.setOnClickListener(listener);
        Toast.makeText(this, "Hell Yeahh!!", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Hell Yeahh!!");
    }
}

