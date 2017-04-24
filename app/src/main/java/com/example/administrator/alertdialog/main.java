package com.example.administrator.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

public class main extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Builder dialog=new AlertDialog.Builder(main.this);
        dialog.setIcon(android.R.drawable.ic_dialog_info);
        dialog.setTitle("欢迎来到德莱联盟");
        dialog.setMessage("不欢迎使用本程序");
        dialog.setPositiveButton("确定", new OnClickListener() {
            @Override
            public void onClick(DialogInterface a, int b) {
                finish();
            }
        });
        dialog.setNegativeButton("退出", new OnClickListener() {
            @Override
            public void onClick(DialogInterface a, int b) {
                TextView text=(TextView) findViewById(R.id.text);
                text.setText("扎心了老铁");
            }
        });
        dialog.create();
        dialog.show();
    }
}
