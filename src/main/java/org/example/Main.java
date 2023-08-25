package org.example;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        workSpace workSpace=new workSpace("job",10,10);
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                workSpace.change_index_value(i,j,1);
            }
        }
        excel_sheet excelSheet=new excel_sheet(List.of(workSpace));
        sum sum=new sum();
        average average=new average();
        System.out.println(sum.evaluate(excelSheet.workSpaceList.get(0).cellExtractor(0,0,-1,-1)));

        //System.out.println(average.evaluate(workSpace.cellExtractor(0,0,1,1)));
    }
}