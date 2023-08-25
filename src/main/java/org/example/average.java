package org.example;

import java.util.List;

public class average implements formula{

    @Override
    public float evaluate(List<cell> input) {
        float sum=0;
        for(int i=0;i<input.size();i++)
        {
            sum+=input.get(i).value;
        }
        return sum/(input.size());
    }
}
