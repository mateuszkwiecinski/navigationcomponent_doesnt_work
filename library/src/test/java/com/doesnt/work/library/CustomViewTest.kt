package com.doesnt.work.library

import androidx.databinding.DataBindingComponent
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CustomViewTest {

    @Test
    fun dummy() {
        val view = CustomView(ApplicationProvider.getApplicationContext(), null)
        view.show()
        view.hide()
    }

    fun shouldCompile(component: DataBindingComponent) {

    }
}
