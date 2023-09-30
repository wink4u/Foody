package com.foody.food.contoller;

import com.foody.food.service.FoodService;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/food")
public class FoodController {

    private final FoodService foodService;

    @GetMapping("/autocomplete")
    public ResponseEntity<Set<String>> getFoodSuggestion(@RequestParam String query){
        Set<String> suggestion = foodService.getFoodSuggestions(query, 10);
        return ResponseEntity.ok()
                             .body(suggestion);
    }


}
