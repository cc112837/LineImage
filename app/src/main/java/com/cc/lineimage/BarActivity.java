package com.cc.lineimage;

import android.app.Activity;
import android.os.Bundle;

import com.cc.lineimage.view.BarView;

import java.util.ArrayList;

/**
 * @author lihexun
 * 2014-6-26
 * 注释:柱形图
 */
public class BarActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bar);
		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i < 30; i++) {
			strList.add((i+1)+"日");
		}
		ArrayList<Integer> dataList = new ArrayList<Integer>();
		int random = (int) (Math.random() * 100 + 1);
		for (int i = 0; i < 30; i++) {
			dataList.add((int) (Math.random() * random));
		}
		BarView barView = (BarView)findViewById(R.id.bar_view);
		barView.setBottomTextList(strList);
		barView.setDataList(dataList,100);//100是MAX值
	}
}
