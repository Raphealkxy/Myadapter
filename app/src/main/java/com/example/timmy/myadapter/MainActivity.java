package com.example.timmy.myadapter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{


    private ListView listview;

    private TextListViewAdapter adapter;
    private TextImgAdapter adapter1;
    private Textimg2Adapter adapter2;

    private List<String> data;
    private List<ItemBean> data1;
    private List<ItemBean2> data2;
    private int[] imageidleft;
    private int []imageidright;
    private String[] name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView)this.findViewById(R.id.listview);

        //getData();
       initData();
        adapter2 = new Textimg2Adapter(this.getApplicationContext(), data2,R.layout.layout_item);

        listview.setAdapter(adapter2);
        listview.setOnItemClickListener(this);
    }

    public void getData(){
        data = new ArrayList<String>();
        for(int i=0; i<20; i++){
            data.add("数据"+i);
        }
    }

    public void initData(){
        //data1 = new ArrayList<ItemBean>();
        data2 = new ArrayList<ItemBean2>();

        name=new String[]{"haha","haha"};
        imageidright=new int[]{R.drawable.web_icon_right_dis1,R.drawable.web_icon_right_dis1};
        imageidleft=new int[]{R.drawable.pass,R.drawable.pass};
        for(int i=0; i<2; i++){
            ItemBean2 bean = new ItemBean2(imageidleft[i],imageidright[i],name[i]);
            data2.add(bean);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //通过view获取其内部的组件，进而进行操作
        String text = (String) ((TextView)view.findViewById(R.id.text)).getText();
        //大多数情况下，position和id相同，并且都从0开始
        String showText = "点击第" + position + "项，文本内容为：" + text + "，ID为：" + id;
        Toast.makeText(this, showText, Toast.LENGTH_LONG).show();
    }
}
