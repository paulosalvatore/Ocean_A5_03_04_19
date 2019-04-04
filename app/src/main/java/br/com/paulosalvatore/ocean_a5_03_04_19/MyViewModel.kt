package br.com.paulosalvatore.ocean_a5_03_04_19

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import java.util.*

class MyViewModel : ViewModel() {
    val text = MutableLiveData<String>()

    fun updateText() {
        text.value = Calendar.getInstance().time.toString()
    }
}
