package com.example.wee_fomulascalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class volume_all extends AppCompatActivity {

    Button btn_tri_prm, btn_rec_prm, btn_sph;
    EditText tri_prm1, tri_prm2, tri_prm3, rec_prm1, rec_prm2, rec_prm3, sph1;
    double var_tri_prm1, var_tri_prm2, var_tri_prm3, var_rec_prm1, var_rec_prm2, var_rec_prm3, var_sph1, ans_tri_prm, ans_rec_prm, ans_sph;
    TextView ans_t, ans_r, ans_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        enableFullscreen();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_main);
        btn_tri_prm = findViewById(R.id.calc_tri_prm);
        btn_rec_prm = findViewById(R.id.calc_rec_prm);
        btn_sph = findViewById(R.id.calc_sph);

        tri_prm1 = findViewById(R.id.var1_tri_prm);
        tri_prm2 = findViewById(R.id.var2_tri_prm);
        tri_prm3 = findViewById(R.id.var3_tri_prm);
        rec_prm1 = findViewById(R.id.var1_rec_prm);
        rec_prm2 = findViewById(R.id.var2_rec_prm);
        rec_prm3 = findViewById(R.id.var3_rec_prm);
        sph1 = findViewById(R.id.var1);

        ans_t = findViewById(R.id.ans_tri_prm);
        ans_r = findViewById(R.id.ans_rec_prm);
        ans_s = findViewById(R.id.ans_sph);

        btn_tri_prm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var_tri_prm1 = Double.parseDouble(tri_prm1.getText().toString());
                var_tri_prm2 = Double.parseDouble(tri_prm2.getText().toString());
                var_tri_prm3 = Double.parseDouble(tri_prm3.getText().toString());
                ans_tri_prm = var_tri_prm1*var_tri_prm2*var_tri_prm3*0.5;
                ans_t.setText("Result: " + ans_tri_prm);
            }});

        btn_rec_prm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var_rec_prm1 = Double.parseDouble(rec_prm1.getText().toString());
                var_rec_prm2 = Double.parseDouble(rec_prm2.getText().toString());
                var_rec_prm3 = Double.parseDouble(rec_prm3.getText().toString());
                ans_rec_prm = var_rec_prm1*var_rec_prm2*var_rec_prm3;
                ans_r.setText("Result: " + ans_rec_prm);
            }});

        btn_sph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var_sph1 = Double.parseDouble(sph1.getText().toString());
                ans_sph = Math.PI * var_sph1 *var_sph1*var_sph1*1.33;
                ans_s.setText("Result: " + ans_sph);
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