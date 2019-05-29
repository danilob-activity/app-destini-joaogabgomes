package com.londonappbrewery.destini;


public class Answer {
    private int mAnswerID;
    Story mChildStory;

    public Answer(int mId, Story c){
        mAnswerID = mId;
        mChildStory = c;
    }

    public Answer(int mId){
        mAnswerID = mId;
    }

    public int getAnswerID() {
        return mAnswerID;
    }

    public void setAnswerID(int answerID) {
        mAnswerID = answerID;
    }


    public Story getChildStory() {
        return mChildStory;
    }

    public void setChildStory(Story childStory) {
        mChildStory = childStory;
    }
}
