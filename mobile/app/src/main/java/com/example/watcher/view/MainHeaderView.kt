package com.example.watcher.view

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.example.watcher.R

/**
 * TODO: document your custom view class.
 */

class MainHeaderView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.main_header_view, this)
    }
}
