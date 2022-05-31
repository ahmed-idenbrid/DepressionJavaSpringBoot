package com.example.demo.activity;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {
    public List<Activity> getActivity(){
        return List.of(
                new Activity(
                        1L,
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""

                )
        );
    }
}
