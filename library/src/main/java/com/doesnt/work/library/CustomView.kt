package com.doesnt.work.library

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.doesnt.work.library.databinding.CustomViewBinding

class CustomView(context: Context, attrs: AttributeSet?) : FrameLayout(context, attrs) {

    private val binding = CustomViewBinding.inflate(LayoutInflater.from(context), this, true)

    fun show() {
        binding.text.animate().alpha(1f).start()
    }

    fun hide() {
        binding.text.animate().alpha(0f).start()
    }
}
