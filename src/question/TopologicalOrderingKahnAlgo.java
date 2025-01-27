package question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalOrderingKahnAlgo {
    public void go2(ArrayList<ArrayList<Integer>> graph){
        List<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int count[]=new int[graph.size()];
        for(int i=0;i< count.length;i++){
            int counter=0;
            for(int j=0;j<graph.size();j++){
                if(graph.get(j).contains(i)){
                    counter++;
                }
            }
            count[i]=counter;
            if(counter==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int k=q.poll();
            ans.add(k);
            for(int j:graph.get(k)){
                count[j]--;
                if(count[j]==0){
                    q.add(j);
                }
            }
        }
        System.out.println(ans.toString());

    }
}
