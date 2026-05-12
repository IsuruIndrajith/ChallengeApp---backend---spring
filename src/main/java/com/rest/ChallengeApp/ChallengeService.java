package com.rest.ChallengeApp;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChallengeService {
    private List<Challenge> challenges = new ArrayList<>();

    public ChallengeService(){
        Challenge challenge01 = new Challenge(1, "January", "Learn a new programming Language");
        challenges.add(challenge01);
    }

    public List<Challenge> ReturnChallenges() {
        return challenges;
    }

    public boolean addChallenge(Challenge challenge){
        if (challenge != null){
            challenges.add(challenge);
            return true;
        }else {
            return  false;
        }
    }

    public List<Challenge> getAllChallenges() {
        return null;
    }
}
