package com.example.manhvan.trunghoang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        caidattbhost();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent=new Intent(MainActivity.this,MainGioHang.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.giohang,menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void caidattbhost() {
        tabHost.setup();
        TabHost.TabSpec tabSpec=tabHost.newTabSpec("tab1");
        tabSpec.setContent(R.id.tab1);
        tabSpec.setIndicator("Laptop");
        tabHost.addTab(tabSpec);

        tabSpec=tabHost.newTabSpec("tab2");
        tabSpec.setContent(R.id.tab2);
        tabSpec.setIndicator("Điện thoại");
        tabHost.addTab(tabSpec);

        tabSpec=tabHost.newTabSpec("tab3");
        tabSpec.setContent(R.id.tab3);
        tabSpec.setIndicator("Tivi");
        tabHost.addTab(tabSpec);
    }

    private void anhxa() {
        tabHost=(TabHost)findViewById(R.id.tbhost);
    }
}
