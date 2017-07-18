package com.example.lijiangbing.bottomnavigationbar


import android.widget.TextView
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.fragment.*
import kotlinx.android.synthetic.main.fragment.view.*


class fragment(val title: String) : Fragment(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState);

        val mview = inflater?.inflate(R.layout.fragment,container,false)!!;
        mview.tv_titleView.text = title;
//        val tv = mview.findViewById(R.id.tv_titleView) as TextView
//        tv.text = title;
//        tv_titleView.text = title;  此处不可直接使用 Kotlin-extention 调用  tv_titleView,
//                                    在本方法返回mView之后,mView(fragment)才会被渲染绘制,对应的 tv_titleView 为 null
        return mview;
    }

}
