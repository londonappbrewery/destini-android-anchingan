package com.londonappbrewery.destini;

public class ChoiceSet {
    private int mStoryID;
    private int mChoice1ID;
    private int mChoice2ID;

    public ChoiceSet(int story, int choice1, int choice2){
        mStoryID = story;
        mChoice1ID = choice1;
        mChoice2ID = choice2;
    }

    public int getStoryID() {
        return mStoryID;
    }

    public void setStoryID(int storyID) {
        mStoryID = storyID;
    }

    public int getChoice1ID() {
        return mChoice1ID;
    }

    public void setChoice1ID(int choice1ID) {
        mChoice1ID = choice1ID;
    }

    public int getChoice2ID() {
        return mChoice2ID;
    }

    public void setChoice2ID(int choice2ID) {
        mChoice2ID = choice2ID;
    }
}
