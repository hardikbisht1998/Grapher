package basic;

public class GraphImplAdjacencyMatrix {
    public int [][] graph;
    public GraphImplAdjacencyMatrix(int verices){
        graph=new int[verices][verices];
    }

    public void addEdge(int a,int b){
        graph[a][b]=1;
        graph[b][a]=1;

    }

    public void addEdge(int a,int b,int w){
        graph[a][b]=w;
        graph[b][a]=w;
    }
}
