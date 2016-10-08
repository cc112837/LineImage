package com.cc.lineimage;

import android.app.Activity;
import android.os.Bundle;

import com.cc.lineimage.view.MoreLineView;

import java.util.ArrayList;

public class NextLineActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nextline);
		zouni();
	}

	public void zouni(){
		MoreLineView lineView = (MoreLineView) findViewById(R.id.more_line_view);
		lineView.setShowPopup(MoreLineView.SHOW_POPUPS_All); // 控制是否显示节点提示
		ArrayList<ArrayList<Integer>> dataLists=new ArrayList<ArrayList<Integer>>();
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
		dataLists.add(dataList);
		//第二根线
		ArrayList<Integer> dataList1 = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			dataList1.add((int) (Math.random() * random));
		}
		dataLists.add(dataList1);
		
		lineView.setDataList(dataLists);
	}
}
