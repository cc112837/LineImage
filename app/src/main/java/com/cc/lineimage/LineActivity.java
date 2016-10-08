package com.cc.lineimage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

import com.cc.lineimage.view.LineView;

import java.util.ArrayList;


/**
 * @author
 * 2014-6-26
 * 注释:线形图
 */
public class LineActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.line);
		zouni();
	}

	@SuppressLint("ResourceAsColor")
	public void zouni() {
		LineView lineView = (LineView) findViewById(R.id.line_view);
//		lineView.setShowPopup(LineView.SHOW_POPUPS_MAXMIN_ONLY); // optional
//		ArrayList<ArrayList<Integer>> dataLists=new ArrayList<ArrayList<Integer>>();
		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i < 30; i++) {
			strList.add((i+1)+"日");
		}
		lineView.setBottomTextList(strList);
		//第一根线
		ArrayList<Integer> dataList = new ArrayList<Integer>();
		int random = (int) (Math.random() * 100 + 1);
		for (int i = 0; i < 30; i++) {
			dataList.add((int) (Math.random() * random));
		}
//		dataLists.add(dataList);
		//第二根线
//		ArrayList<Integer> dataList1 = new ArrayList<Integer>();
//		for (int i = 0; i < 20; i++) {
//			dataList1.add((int) (Math.random() * random));
//		}
//		dataLists.add(dataList1);
		
		lineView.setDataList(dataList);
	}
}
