package com.cc.lineimage;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    private LineView mLineView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLineView= new LineView(this);
        mLineView.SetInfo(
                new String[]{"9-5", "9-6", "9-7", "9-8", "9-9", "9-10", "9-11"},   //X轴刻度
                new String[]{"", "4000", "8000", "12000", "16000","20000"},   //Y轴刻度
                new String[]{"1544", "2334", "10", "3632", "12345", "402", "1212"},  //数据
                "线性图的绘制"
        );
        setContentView(mLineView);

    }
}
