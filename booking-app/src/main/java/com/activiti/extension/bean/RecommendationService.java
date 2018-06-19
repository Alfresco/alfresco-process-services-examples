package com.activiti.extension.bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class RecommendationService {

    private static final Map<String, List<String>> recommendationMap = new HashMap<>();
    static {
        recommendationMap.put("London", Arrays.asList("Big Ben", "London Eye", "Tower of London"));
        recommendationMap.put("Paris", Arrays.asList("Eiffel Tower", "The Louvre", "Notre-Dame de Paris"));
        recommendationMap.put("Berlin", Arrays.asList("Brandenburg Gate", "Reichstag building", "Berlin Wall"));
        recommendationMap.put("New York", Arrays.asList("Statue of Liberty", "Central Park", "Empire State Building"));
    }
    
    public static List<String> getRecommendations(String city) {
        return recommendationMap.get(city);
    }
}
