package com.knu.lab_1_korchak_oleksandr.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.knu.lab_1_korchak_oleksandr.MainActivity;

import java.util.Arrays;
import java.util.List;

public class HomeViewModel extends ViewModel {

    MutableLiveData<List<String>> courses;
    List<String> coursesNames = Arrays.asList("Course 1", "Course 2", "Course 3");

    public HomeViewModel() {
        courses = new MutableLiveData<>();
        courses.setValue(coursesNames);
    }

    public LiveData<List<String>> getCourses() { return courses; }
}