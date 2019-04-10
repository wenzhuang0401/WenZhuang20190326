package weektest.baway.com.wenzhuang20190326;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import weektest.baway.com.wenzhuang20190326.adapter.MyFragmentAdapter;
import weektest.baway.com.wenzhuang20190326.fragment.FragmentDome1;
import weektest.baway.com.wenzhuang20190326.fragment.FragmentDome2;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private TabLayout tab;
    private List<Fragment> list;
    private List<String> title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager=findViewById(R.id.main_pager);
        tab=findViewById(R.id.main_tab);
        list=new ArrayList<>();
        title=new ArrayList<>();
        list.add(new FragmentDome1());
        list.add(new FragmentDome2());
        title.add("登陆");
        title.add("我的");
        MyFragmentAdapter adapter = new MyFragmentAdapter(getSupportFragmentManager(), list, title);
        pager.setAdapter(adapter);
        tab.setupWithViewPager(pager);


    }
}
