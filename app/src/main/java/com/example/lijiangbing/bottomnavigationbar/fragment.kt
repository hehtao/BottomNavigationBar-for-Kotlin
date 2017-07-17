package com.example.lijiangbing.bottomnavigationbar


import android.widget.TextView
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.fragment.*


class fragment(val title: String) : Fragment(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState);

        val mview = inflater?.inflate(R.layout.fragment,container,false) as View;
        val tv = mview.findViewById(R.id.tv_titleView) as TextView
        tv.text = title;
        Log.e("textView","${tv.text}");
        return mview;
    }

}
