package ru.relastic.meet002;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private Context context = this;
    private Button mButtonPrev;
    private Button mButtonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initViews();
        initListeners();
    }
    private void initViews(){
        mButtonPrev = findViewById(R.id.btnPrevious);
        mButtonNext = findViewById(R.id.btnNext);
    }
    private void initListeners(){
        mButtonPrev.setOnClickListener(new ButtonClickListener());
        mButtonNext.setOnClickListener(new ButtonClickListener());
    }
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent;
            if (v.getId()==mButtonPrev.getId()) {
                intent = new Intent(context, SplashActivity.class);
            }else {
                intent = new Intent(context, DetailsActivity.class);
            }
            startActivity(intent);
        }
    }
}

