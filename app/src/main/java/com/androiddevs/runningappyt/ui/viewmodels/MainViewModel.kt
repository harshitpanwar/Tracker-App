package com.androiddevs.runningappyt.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.androiddevs.runningappyt.db.Run
import com.androiddevs.runningappyt.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {


    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()


    fun insertRun(run: Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }



}