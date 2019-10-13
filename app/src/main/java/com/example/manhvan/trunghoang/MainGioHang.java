package com.example.manhvan.trunghoang;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainGioHang extends AppCompatActivity {
    ActionBar actionBar;
    Button btnDathang,btntieptuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gio_hang);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar=getSupportActionBar();
        actionBar.setTitle("Giỏ hàng");
        anhxa();
        btntieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainGioHang.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnDathang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainGioHang.this,MainMuaHang.class);
                startActivity(intent);
            }
        });
    }

    private void anhxa() {
        btnDathang=(Button)findViewById(R.id.bdathang);
        btntieptuc=(Button)findViewById(R.id.btt);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}
