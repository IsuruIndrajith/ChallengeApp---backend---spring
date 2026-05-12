package com.rest.ChallengeApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChallengeController {
    private ChallengeService challengeService;

    public ChallengeController(ChallengeService challengeService){
        this.challengeService = challengeService;
    }

    @GetMapping("/challenges")
    public  List<Challenge> getAllChallenges(){
        return challengeService.ReturnChallenges();
    }


    @PostMapping("/challenges")
    public String addChallenge(@RequestBody Challenge challenge){
        boolean is_challenge_added =  challengeService.addChallenge(challenge);
        if (is_challenge_added)
            return "Challenge Added successfully";
        else;
            return "Challenge not added succesfully";
    }

}

