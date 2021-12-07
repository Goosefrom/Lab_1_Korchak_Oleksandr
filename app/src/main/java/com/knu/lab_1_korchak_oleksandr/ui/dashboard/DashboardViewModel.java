package com.knu.lab_1_korchak_oleksandr.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.knu.lab_1_korchak_oleksandr.MainActivity;

import java.util.Arrays;
import java.util.List;

public class DashboardViewModel extends ViewModel {

    MutableLiveData<List<String>> myCourses;
    List<String> myCoursesNames = Arrays.asList("Course 1", "Course 3");

    public DashboardViewModel() {
        myCourses = new MutableLiveData<>();
        myCourses.setValue(myCoursesNames);
    }

    public LiveData<List<String>> getMyCourses() {
        return myCourses;
    }
}