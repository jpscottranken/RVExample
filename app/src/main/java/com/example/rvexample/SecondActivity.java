package com.example.rvexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView  title;
    TextView  description;
    ImageView mainImageView;
    String    data1;
    String    data2;
    int       myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        title		    =	findViewById(R.id.title);
        description 	=	findViewById(R.id.description);
        mainImageView	=	findViewById(R.id.mainImageView);

        getData();
        setData();
    }

    private void getData() {
        if ((getIntent().hasExtra("data1"))  &&
                (getIntent().hasExtra("data2"))  &&
                (getIntent().hasExtra("myImageView")))
        {
            data1 	    = getIntent().getStringExtra("data1");
            data2 	    = getIntent().getStringExtra("data2");
            myImageView = getIntent().getIntExtra("myImageView", 1);
        }
        else
        {
            Toast.makeText(this, "Error in data", Toast.LENGTH_LONG).show();
        }
    }

    private void setData() {
        title.setText(data1);
        description.setText(data2);
        mainImageView.setImageResource(myImageView);
    }
}
