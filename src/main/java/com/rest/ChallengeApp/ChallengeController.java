package com.rest.ChallengeApp;

import org.springframework.web.bind.annotation.*;

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

//    By default the methods are get methods
    @GetMapping("/challenges/{id}")
    public Challenge getChallengeById(@PathVariable int id){
        return challengeService.getChallengeById(id);
    }

    @PostMapping("/challenges")
    public void addNewChallenge(@RequestBody Challenge challenge){
        challengeService.addNewChallenge(challenge);
    }


//    @PostMapping("/challenges")
//    public String addChallenge(@RequestBody Challenge challenge){
//        boolean is_challenge_added =  challengeService.addChallenge(challenge);
//        if (is_challenge_added)
//            return "Challenge Added successfully";
//        else;
//            return "Challenge not added succesfully";
//    }

}

