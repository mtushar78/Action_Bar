package com.hfad.actionbarapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        textView=findViewById(R.id.show);
        switch(item.getItemId()){
            case R.id.add:
                textView.setText("ADD CLICKED");
                return(true);
            case R.id.reset:
                textView.setText("RESET CLICKED");
                return(true);
            case R.id.about:
                textView.setText("ABOUT CLICKED");
                return (true);
            case R.id.exit:
                finish();

        }

        return super.onOptionsItemSelected(item);
    }
}
