 package com.cc.lineimage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author lihexun
 * 2014-8-27
 * @CLASSNAME MainActivity.java
 * 注释:主界面
 */
public class MainActivity extends Activity implements OnClickListener {
	private Button showLine, showPie,showBar,showmore_line;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		showLine = (Button) findViewById(R.id.showLine);
		showLine.setOnClickListener(this);
		showPie = (Button) findViewById(R.id.showPie);
		showPie.setOnClickListener(this);
		showBar= (Button) findViewById(R.id.showBar);
		showBar.setOnClickListener(this);
		showmore_line= (Button) findViewById(R.id.showmore_line);
		showmore_line.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent=new Intent();
		switch (v.getId()) {
		case R.id.showLine:
			intent.setClass(MainActivity.this,LineActivity.class);
			break;
		case R.id.showPie:
			intent.setClass(MainActivity.this,PieActivity.class);
			break;
		case R.id.showBar:
			intent.setClass(MainActivity.this,BarActivity.class);
			break;
		case R.id.showmore_line:
			intent.setClass(MainActivity.this,NextLineActivity.class);
			break;
		default:
			break;
		}
		MainActivity.this.startActivity(intent);
	}

}
