package tw.org.iii.android201914;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private Fragment[] fs = new Fragment[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fs[0] = new P0();fs[1] = new P1();fs[2] = new P2();
        fs[3] = new P3();fs[4] = new P4();

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if (position == 0){
                    viewPager.setCurrentItem(1);
                }else if (position==4){
                    viewPager.setCurrentItem(3);
                }
            }
        });
        viewPager.setCurrentItem(1);
    }

    private class MyPagerAdapter extends FragmentStatePagerAdapter {

        public MyPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fs[position];
        }

        @Override
        public int getCount() {
            return fs.length;
        }
    }

    public void test1(View view) {
        viewPager.setCurrentItem(1);
    }
    public void test2(View view) {
        viewPager.setCurrentItem(2);
    }
    public void test3(View view) {
        viewPager.setCurrentItem(3);
    }
}
