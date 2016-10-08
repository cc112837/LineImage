package com.cc.lineimage;

import android.app.Activity;
import android.os.Bundle;

import com.cc.lineimage.view.PieHelper;
import com.cc.lineimage.view.PieView;

import java.util.ArrayList;

/**
 * @author 
 * 2014-6-26
 * 注释:饼形图
 */
public class PieActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pie);
		PieView pieView = (PieView) findViewById(R.id.pie_view);
		ArrayList<PieHelper> pieHelperArrayList = new ArrayList<PieHelper>();
		PieHelper pieHelper = new PieHelper(0,0,5,8);
		pieHelperArrayList.add(pieHelper);
		pieView.setDate(pieHelperArrayList);
	}
}
