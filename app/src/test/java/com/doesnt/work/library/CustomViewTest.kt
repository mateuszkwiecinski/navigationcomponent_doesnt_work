package com.doesnt.work.app

import androidx.databinding.DataBindingComponent
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.doesnt.work.library.CustomView
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
internal class CustomViewTest {

    @Test
    fun dummy() {
        val view = CustomView(ApplicationProvider.getApplicationContext(), null)
        view.show()
        view.hide()
    }

    fun shouldCompile(component: DataBindingComponent?) {
        checkNotNull(component)
    }
}

