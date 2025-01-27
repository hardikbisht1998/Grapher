package question;

import java.util.ArrayList;
import java.util.Stack;

public class DFsearch {

     public void dfs(ArrayList<ArrayList<Integer>> graph,boolean[] vis,int curr){
         vis[curr]=true;
         System.out.println("node is :"+ curr);
         for(int neighbour: graph.get(curr)){
             if(!vis[neighbour]){
                 dfs(graph,vis,neighbour);
             }
         }
     }

     public void dfsIterative(ArrayList<ArrayList<Integer>> graph,boolean vis[],int curr){
             Stack<Integer> st=new Stack<>();
             st.push(curr);
             vis[curr]=true;

             while(!st.empty()){
                 int temp=st.pop();
                 System.out.println("node is -"+ temp);
                 for(int neighbour:graph.get(temp)){
                     if(!vis[neighbour]){
                         st.push(neighbour);
                         vis[neighbour]=true;
                     }
                 }
             }


     }
}
