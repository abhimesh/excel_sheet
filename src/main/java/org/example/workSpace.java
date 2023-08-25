package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class workSpace {
    String name;
    List<List<cell>> row_column;
    workSpace(String name,int n,int m){
        this.name=name;
        this.row_column = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<cell> row=new ArrayList<>();
            for(int j=0;j<m;j++)
            {
                cell cell=new cell(0);
                row.add(cell);
            }
            row_column.add(row);
        }
    }

    void change_index_value(int i,int j,float val)
    {
        if(i<0||j<0||i>=row_column.size()||j>=row_column.get(0).size())
        {System.out.println("no index exists");return;}
        List<cell> row=row_column.get(i);
        cell cell=row.get(j);
        cell.value=val;
        row.set(j,cell);
        row_column.set(i,row);
    }

    List<cell> cellExtractor(int row1,int row2, int col1,int col2)
    {
        List<cell> ans=new ArrayList<>();
        try{
        for(int i=min(row1,row2);i<=max(row1,row2);i++)
        {
            for(int j=min(col1,col2);j<=max(col1,col2);j++)
            {
                ans.add(row_column.get(i).get(j));
            }
        }
        return ans;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());

        }
        return  ans;
    }

}
