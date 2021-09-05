import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        List<Integer> row , pre=null;
        for (int i = 0; i <numRows ; i++) {
            row= new ArrayList<Integer>();
            for (int j = 0; j <=i ; j++)
                if(j==0 || j==i)
                    row.add(1);
                else
                    row.add(pre.get(j-1)+ pre.get(j));
             pre =row;
             res.add(row);
            }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int row=5;
        generate(row);


    }
}
//when rows and column is given and we have tell which number is there at 5th row and 3rd column we can use the formula
//(R-1)^C(c-1)= R-1/C-2
//Computation of N^C(R)
//for(int i=0; i<k; ++i){
//res*=(n-i);
//res/=(i+1);