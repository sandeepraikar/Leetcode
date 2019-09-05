package com.algo.ds.easy;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int udCounter = 0;
        int lrCounter = 0;
        for(char x: moves.toCharArray()){
            if(x == 'U'){
                udCounter++;
            }
            if(x == 'D'){
                udCounter--;
            }
            if(x == 'L'){
                lrCounter++;
            }
            if(x == 'R'){
                lrCounter--;
            }
        }

        return udCounter==0 && lrCounter==0;
    }
}
