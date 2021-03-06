package com.ecnu.redo.service;

import com.ecnu.redo.core.PhaseNode;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DevelopingSequencePerformServiceTest {



    @Test
    public void performRefactoring() {
        Logger.getGlobal().setLevel(Level.SEVERE);
        DevelopingSequencePerformService refactoringPerformService=new DevelopingSequencePerformService();
        double simpleMatrix[][] = {{3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.5, 0, 0},
                {1, 4, 1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0},
                {0, 1, 4, 0.5, 0, 0, 0.5, 1, 0, 0, 0, 0, 0},
                {0, 0, 0.5, 1, 0.5, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0.5, 2, 0.5, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0.5, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0.5, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 2, 0.5, 0, 0, 1, 0.5},
                {0, 0, 0, 0, 0, 0, 0, 0.5, 4, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0},
                {0.5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.5, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0.5, 4, 0},
                {0, 0, 0, 0, 0, 0, 0, 0.5, 0, 0, 0, 0, 1}
        };
        PhaseNode refactorNode= refactoringPerformService.performRefactoring(simpleMatrix);
        double[][] res=refactorNode.getCostMatrix();
        for(int i=0;i<res.length;i++){
            for (int j = 0; j < res.length; j++) {
                Logger.getGlobal().severe("res: "+i+j+res[i][j]);
            }
        }
//        System.out.println(.toString());
    }
}