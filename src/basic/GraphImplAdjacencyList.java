package basic;

import java.util.ArrayList;

public class GraphImplAdjacencyList {

    public ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
    public int size=0;

    public GraphImplAdjacencyList(int vertices){
        size=vertices;
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
    }


    public void addEdge(int a,int b){
        if(!graph.get(a).contains(b)){
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
    }



}
