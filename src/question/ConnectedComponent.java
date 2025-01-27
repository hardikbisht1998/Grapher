package question;

import java.util.ArrayList;

public class ConnectedComponent {
    public void callDfs(ArrayList<ArrayList<Integer>> graph,int i,boolean[] vis){
        vis[i]=true;
        for(int j:graph.get(i)){
            if(!vis[j]){
                callDfs(graph,j,vis);
            }
        }


    }
    public void go1(ArrayList<ArrayList<Integer>> graph){
        int n=graph.size();
        boolean[] vis=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                count++;
                callDfs(graph,i,vis);
            }
        }

        System.out.println("No. of connected component :"+ count);

    }
}
