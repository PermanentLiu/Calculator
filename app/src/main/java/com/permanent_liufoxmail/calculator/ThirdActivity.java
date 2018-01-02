package com.permanent_liufoxmail.calculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button shiftDayNight;




    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setTheme(FirstActivity.theme);
        setContentView(R.layout.activity_third);

        Log.d("theme = daytheme", String.valueOf(FirstActivity.theme == R.style.AppTheme));
        Log.d("theme = nighttheme", String.valueOf(FirstActivity.theme == R.style.nightTheme));
//        Log.d("theme", String.valueOf(FirstActivity.theme));
//        Log.d("theme", String.valueOf(R.style.nightTheme));
//        Log.d("theme", String.valueOf(R.style.dayTheme));




        shiftDayNight = (Button) findViewById(R.id.shiftDayNight);

        shiftDayNight.setOnClickListener(this);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        Intent intent = new Intent();
        intent.setClass(ThirdActivity.this, FirstActivity.class);
        startActivity(intent);
        ThirdActivity.this.finish();
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.shiftDayNight:
                shiftDayNightOnClicked();
                break;
        }
    }

    private void shiftDayNightOnClicked()
    {


        if (FirstActivity.theme == R.style.nightTheme)
        {
            FirstActivity.theme = R.style.AppTheme;

            this.recreate();
        }
        else
        {
            FirstActivity.theme = R.style.nightTheme;

            this.recreate();
        }

    }
}


