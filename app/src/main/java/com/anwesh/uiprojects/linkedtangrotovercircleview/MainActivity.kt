package com.anwesh.uiprojects.linkedtangrotovercircleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.tangrotovercircleview.TangRotOverCircleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TangRotOverCircleView.create(this)
    }
}
