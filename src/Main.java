import basic.GraphImplAdjacencyList;
import basic.GraphImplAdjacencyMatrix;
import question.BFsearch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        GraphImplAdjacencyList graphImplAdjacencyList=new GraphImplAdjacencyList(6);
        graphImplAdjacencyList.addEdge(0,1);
        graphImplAdjacencyList.addEdge(0,2);
        graphImplAdjacencyList.addEdge(0,3);
        graphImplAdjacencyList.addEdge(1,2);
        graphImplAdjacencyList.addEdge(3,4);
        graphImplAdjacencyList.addEdge(4,5);

        GraphImplAdjacencyMatrix graphImplAdjacencyMatrix=new GraphImplAdjacencyMatrix(5);
        graphImplAdjacencyMatrix.addEdge(1,3,8);
        graphImplAdjacencyMatrix.addEdge(3,4,6);

        BFsearch bFsearch=new BFsearch();
        bFsearch.bfs(graphImplAdjacencyList.graph,5,new boolean[graphImplAdjacencyList.size]);

    }
}