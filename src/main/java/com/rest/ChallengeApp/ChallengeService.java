package com.rest.ChallengeApp;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChallengeService {
    private List<Challenge> challenges = new ArrayList<>();

    public ChallengeService(){
//        Added a dummy Challenge
        Challenge challenge01 = new Challenge(1, "January", "Learn a new programming Language");
        challenges.add(challenge01);
    }

    public List<Challenge> ReturnChallenges() {
        return challenges;
    }

    public Challenge getChallengeById(int id){
        return challenges.stream()
                .filter(p -> p.getId() == id)
                .findFirst().orElse(new Challenge(100, "Not Found", "No challenge found for this ID"));
    }

    public void addNewChallenge(Challenge challenge){
        challenges.add(challenge);
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

    public void updateChallenge(Challenge challenge) {
        int index=0;
        for (int i=0; i<challenges.size();i++)
            if(challenges.get(i).getId() == challenge.getId())
                index = i;

        challenges.set(index,challenge);
    }

    public void deleteChallenge(int id) {
        int index=0;
        for (int i=0; i<challenges.size();i++)
            if(challenges.get(i).getId() == id)
                index = i;

        challenges.remove(id);

    }
}
