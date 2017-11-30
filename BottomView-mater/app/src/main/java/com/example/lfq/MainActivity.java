package com.example.lfq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;

import com.example.lfq.view.BaseBottomView;
import com.example.lfq.view.OnDismissListener;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        final BaseBottomView bottomView = new BaseBottomView(this, R.layout.layout_bottom);
        bottomView.findViewById(R.id.tv_content1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                bottomView.setOnDismissListener(new OnDismissListener() {
                    @Override
                    public void onDismiss(Object o) {
                        Toast.makeText(MainActivity.this, "跳转SecondActivity", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });

        bottomView.findViewById(R.id.tv_content2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "选择 content2", Toast.LENGTH_SHORT).show();
                bottomView.dismiss();
            }
        });
        bottomView.setCancelable(true);
        bottomView.show();
    }

    public void onClick1(View view) {
//        Toast.makeText(this, "onClick1", Toast.LENGTH_SHORT).show();
    }

    public void onClick2(View view) {
        Toast.makeText(this, "onClick2", Toast.LENGTH_SHORT).show();
    }

    public void onClick3(View view) {
        Toast.makeText(this, "onClick3", Toast.LENGTH_SHORT).show();
    }
}
