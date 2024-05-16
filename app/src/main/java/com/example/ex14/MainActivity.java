package com.example.ex14;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    Switch switch1;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = findViewById(R.id.switch1);
        rg = findViewById(R.id.rg);
    }

    public void clickedRed (View view)
    {
        if (!(switch1.isChecked()))
            getWindow().getDecorView().setBackgroundColor(Color.RED);
    }

    public void clickedCyan (View view)
    {
        if (!(switch1.isChecked()))
            getWindow().getDecorView().setBackgroundColor(Color.CYAN);
    }
    public void clickedYellow (View view)
    {
        if (!(switch1.isChecked()))
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
    }

    public void clickedMagenta (View view)
    {
        if (!(switch1.isChecked()))
            getWindow().getDecorView().setBackgroundColor(Color.MAGENTA);
    }

    public void clickedChange (View view)
    {
        if (switch1.isChecked())
            getSelectedColor();
    }

    public void getSelectedColor()
    {
        int selectedRadioButtonId = rg.getCheckedRadioButtonId();

        if (selectedRadioButtonId == R.id.rbCyan)
            getWindow().getDecorView().setBackgroundColor(Color.CYAN);

        else if (selectedRadioButtonId == R.id.rbRed)
            getWindow().getDecorView().setBackgroundColor(Color.RED);

        else if (selectedRadioButtonId == R.id.rbYellow)
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);

        else if (selectedRadioButtonId == R.id.rbMagenta)
            getWindow().getDecorView().setBackgroundColor(Color.MAGENTA);
    }
}
