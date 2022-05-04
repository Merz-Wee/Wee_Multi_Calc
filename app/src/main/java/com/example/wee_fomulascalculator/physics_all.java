package com.example.wee_fomulascalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class physics_all extends AppCompatActivity {

    Button btn_spd, btn_pwr, btn_vlt;
    EditText spd1,spd2,pwr1,pwr2,vlt1,vlt2;
    double var_spd1, var_spd2, var_pwr1, var_pwr2, var_vlt1, var_vlt2,ans_spd,ans_pwr,ans_vlt;
    TextView ans_s, ans_p, ans_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        enableFullscreen();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_all);
        btn_spd = findViewById(R.id.calc_spd);
        btn_pwr = findViewById(R.id.calc_pwr);
        btn_vlt = findViewById(R.id.calc_vlt);
        
        spd1 = findViewById(R.id.var1_spd);
        spd2 = findViewById(R.id.var2_spd);
        pwr1 = findViewById(R.id.var1_pwr);
        pwr2 = findViewById(R.id.var2_pwr);
        vlt1 = findViewById(R.id.var1_vlt);
        vlt2 = findViewById(R.id.var2_vlt);
        
        ans_s = findViewById(R.id.ans_spd);
        ans_p = findViewById(R.id.ans_pwr);
        ans_v = findViewById(R.id.ans_vlt);

        btn_spd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var_spd1 = Double.parseDouble(spd1.getText().toString());
                var_spd2 = Double.parseDouble(spd2.getText().toString());
                ans_spd = var_spd1*var_spd2;
                ans_s.setText("Result: " + ans_spd);
            }});
        
        btn_pwr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var_pwr1 = Double.parseDouble(pwr1.getText().toString());
                var_pwr2 = Double.parseDouble(pwr2.getText().toString());
                ans_pwr = var_pwr1 * var_pwr2;
                ans_p.setText("Result: " + ans_pwr);
            }});
        
        btn_vlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var_vlt1 = Double.parseDouble(vlt1.getText().toString());
                var_vlt2 = Double.parseDouble(vlt2.getText().toString());
                ans_vlt = var_vlt1*var_vlt2;
                ans_v.setText("Result: " + ans_vlt);
            }});
    }
    private void enableFullscreen() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        );
    }
}