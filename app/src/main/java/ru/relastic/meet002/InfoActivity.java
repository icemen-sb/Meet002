package ru.relastic.meet002;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class InfoActivity extends AppCompatActivity {
    private Context context = this;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        initViews();
        initListeners();
    }
    private void initViews(){
        mButton = findViewById(R.id.btnToSplash);
    }
    private void initListeners(){
        mButton.setOnClickListener(new ButtonClickListener());
    }
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, SplashActivity.class);
            startActivity(intent);
        }
    }

}
