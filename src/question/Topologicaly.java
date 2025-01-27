package question;

import java.util.ArrayList;
import java.util.Stack;

public class Topologicaly {

    public void topo(ArrayList<ArrayList<Integer>> graph, Stack<Integer> ans,int curr, boolean[] vis){

        vis[curr]=true;
        for(int nei:graph.get(curr)){
            if(!vis[nei]){
                topo(graph,ans,nei,vis);
            }
        }
        ans.push(curr);

    }

    public void go2(ArrayList<ArrayList<Integer>> graph){
        boolean[] vis =new boolean[graph.size()];
        Stack<Integer> ans=new Stack<>();
        for(int i=0;i<graph.size();i++){
            if(!vis[i]){
                topo(graph,ans,i,vis);
            }
        }

        while(!ans.empty()){
            System.out.println("Node :"+ans.pop());
        }


    }
}
