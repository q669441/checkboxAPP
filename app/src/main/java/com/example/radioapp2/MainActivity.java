package com.example.radioapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnOk(View view) {
        CheckBox chk;
        TextView txvshow;
        String msg = "";

        int[] id = {R.id.chkchinese, R.id.chkenglish, R.id.chkmath, R.id.chksince};
        for (int i : id) {
            chk = findViewById(i);
            if (chk.isChecked())
                msg += "\n" + chk.getText();
        }
        txvshow =  findViewById(R.id.txvshow);
        txvshow.setText(msg);
    }
}
