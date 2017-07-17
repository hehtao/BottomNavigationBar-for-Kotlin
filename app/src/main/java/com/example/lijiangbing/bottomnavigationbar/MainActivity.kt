package com.example.lijiangbing.bottomnavigationbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import com.ashokvarma.bottomnavigation.BottomNavigationItem
import com.ashokvarma.bottomnavigation.TextBadgeItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment.*

class MainActivity : AppCompatActivity(),BottomNavigationBar.OnTabSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        with(bottom_bar){
                setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
                setMode(BottomNavigationBar.MODE_FIXED)
                addItem(BottomNavigationItem(R.drawable.icon_wechat_g,R.string.nv_bottom).setActiveColorResource(R.color.colorPrimaryDark).setBadgeItem(TextBadgeItem().setText("2")));
                addItem(BottomNavigationItem(R.drawable.icon_wechat_g,R.string.nv_bottom).setActiveColorResource(R.color.colorPrimaryDark));
                addItem(BottomNavigationItem(R.drawable.icon_wechat_g,R.string.nv_bottom).setActiveColorResource(R.color.colorPrimaryDark));
                addItem(BottomNavigationItem(R.drawable.icon_wechat_g,R.string.nv_bottom).setActiveColorResource(R.color.colorPrimaryDark));
                setFirstSelectedPosition(0);
                initialise();
        }

        bottom_bar.setTabSelectedListener(this);

        val manager = getSupportFragmentManager();
        val transaction = manager.beginTransaction();
        transaction.replace(R.id.fl,fragment("first"));
        transaction.commit();
    }

    override fun onTabSelected(position: Int) {
        val manager = getSupportFragmentManager();
        val transaction = manager.beginTransaction();
        when (position){
            0 -> {
                    transaction.replace(R.id.fl, fragment("first"))
                    transaction.commit();

            }
            1 -> {
                transaction.replace(R.id.fl, fragment("second"));
                transaction.commit();
            }
            2 -> {
                transaction.replace(R.id.fl, fragment("third"));
                transaction.commit();
            }
            else -> {
                transaction.replace(R.id.fl, fragment("last"));
                transaction.commit();
            }
        }
    }

    override fun onTabUnselected(position: Int) {

    }

    override fun onTabReselected(position: Int) {

    }
}
