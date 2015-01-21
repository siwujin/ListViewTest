package com.example.listviewtest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {
    
    private List<Fruit> fruitList=new ArrayList<Fruit>();//�������ݼ��ϡ�����ΪFruit��
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	initFruits();//��ʼ��ˮ������
	FruitAdapter adapter=new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);//��������������
	//(�����ģ�������ļ�id,�������ݣ�
	ListView listview=(ListView) findViewById(R.id.list_view);//�ҵ�ָ����ListView
	listview.setAdapter(adapter);//���Զ�������������ݸ����ListView
    }
    private void initFruits(){
	Fruit apple=new Fruit("Apple",R.drawable.apple);
	fruitList.add(apple);
	Fruit banana=new Fruit("banana",R.drawable.banana);
	fruitList.add(banana);
	Fruit cherry=new Fruit("chery",R.drawable.cherry);
	fruitList.add(cherry);
	Fruit grape=new Fruit("grape",R.drawable.grape);
	fruitList.add(grape);
	Fruit mango=new Fruit("mango",R.drawable.mango);
	fruitList.add(mango);
	Fruit orange=new Fruit("orange",R.drawable.orange);
	fruitList.add(orange);
	Fruit pear=new Fruit("pear",R.drawable.pear);
	fruitList.add(pear);
	Fruit pineapple=new Fruit("pineapple",R.drawable.pineapple);
	fruitList.add(pineapple);
	Fruit strawberry=new Fruit("strawberry",R.drawable.strawberry);
	fruitList.add(strawberry);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
	// Handle action bar item clicks here. The action bar will
	// automatically handle clicks on the Home/Up button, so long
	// as you specify a parent activity in AndroidManifest.xml.
	int id = item.getItemId();
	if (id == R.id.action_settings) {
	    return true;
	}
	return super.onOptionsItemSelected(item);
    }
}
