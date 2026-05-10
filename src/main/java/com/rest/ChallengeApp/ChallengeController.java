package com.rest.ChallengeApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChallengeController {
    private List<Challenge> challenges = new ArrayList<>();

    public ChallengeController(){
        Challenge challenge01 = new Challenge(1, "January", "Learn a new programming Language");
        challenges.add(challenge01);
    }



    @GetMapping("/challenges")
    public  List<Challenge> getAllChallenges(){
        return challenges;
    }
}