import basic.GraphImplAdjacencyList;
import basic.GraphImplAdjacencyMatrix;
import question.*;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        GraphImplAdjacencyList graphImplAdjacencyList=new GraphImplAdjacencyList(6);
        graphImplAdjacencyList.addEdge(0,1);
        graphImplAdjacencyList.addEdge(0,2);
        graphImplAdjacencyList.addEdge(0,1);
        graphImplAdjacencyList.addEdge(1,2);
        graphImplAdjacencyList.addEdge(3,4);
//        graphImplAdjacencyList.addEdge(4,5);

        GraphImplAdjacencyMatrix graphImplAdjacencyMatrix=new GraphImplAdjacencyMatrix(5);
        graphImplAdjacencyMatrix.addEdge(1,3,8);
        graphImplAdjacencyMatrix.addEdge(3,4,6);
//
//        BFsearch bFsearch=new BFsearch();
//        bFsearch.bfs(graphImplAdjacencyList.graph,5,new boolean[graphImplAdjacencyList.size]);

        DFsearch dFsearch=new DFsearch();
//        dFsearch.dfs(graphImplAdjacencyList.graph,new boolean[graphImplAdjacencyList.size], 0);
//        dFsearch.dfsIterative(graphImplAdjacencyList.graph,new boolean[graphImplAdjacencyList.size], 0);
//        ConnectedComponent connectedComponent=new ConnectedComponent();
//        connectedComponent.go1(graphImplAdjacencyList.graph);

        GraphImplAdjacencyList graphImplAdjacencyList1=new GraphImplAdjacencyList(6);
        graphImplAdjacencyList1.singleAddEdge(0,3);
        graphImplAdjacencyList1.singleAddEdge(0,2);
        graphImplAdjacencyList1.singleAddEdge(2,3);
        graphImplAdjacencyList1.singleAddEdge(2,1);
        graphImplAdjacencyList1.singleAddEdge(3,1);
        graphImplAdjacencyList1.singleAddEdge(4,5);
        graphImplAdjacencyList1.singleAddEdge(5,1);
        graphImplAdjacencyList1.singleAddEdge(4,1);
        Topologicaly topologicaly=new Topologicaly();
        topologicaly.go2(graphImplAdjacencyList1.graph);
        TopologicalOrderingKahnAlgo topologicalOrderingKahnAlgo=new TopologicalOrderingKahnAlgo();
        topologicalOrderingKahnAlgo.go2(graphImplAdjacencyList1.graph);


    }
}