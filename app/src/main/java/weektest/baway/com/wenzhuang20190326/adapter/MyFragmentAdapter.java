package weektest.baway.com.wenzhuang20190326.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author: 温壮
 * @Date: 2019/3/26  9:05
 * @description: $描述
 */
public class MyFragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> list;
    private List<String> title;

    public MyFragmentAdapter(FragmentManager fm, List<Fragment> list, List<String> title) {
        super(fm);
        this.list = list;
        this.title = title;
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
