package question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFsearch {

    public void bfs(ArrayList<ArrayList<Integer>> graph,int a,boolean[] vis){
        Queue<Integer> q=new LinkedList<>();
        int pres[]=new int[vis.length];
        pres[a]=-1;

        vis[a]=true;
        int dist[]=new int[vis.length];
        dist[a]=0;
        q.add(a);

        while(!q.isEmpty()){
            int curr=q.poll();
            System.out.println(curr);
            for(int i=0;i<graph.get(curr).size();i++){
                if(!vis[graph.get(curr).get(i)]){
                    q.add(graph.get(curr).get(i));
                    vis[graph.get(curr).get(i)]=true;
                    dist[graph.get(curr).get(i)]=dist[curr]+1;
                    pres[graph.get(curr).get(i)]=curr;
                }
            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.println(i+"-------->"+dist[i]);
        }


    }
}