package DS_And_Algorithms.AdjacencyMatrix;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private int [][] matrix;
    private List<Node> nodes;

    public Graph (int size) {
        this.matrix = new int[size][size];
        this.nodes = new ArrayList<>();
    }

    public void addNode (Node node) {
        nodes.add(node);
    }

    public void addEdge (int row, int col) {
        matrix[row][col] = 1;
    }

    public boolean checkEdge(int row, int col) {
        return matrix[row][col] == 1;
    }

    public void print () {
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.getData() + " ");
        }
        System.out.println();

        for (int row = 0; row < matrix.length; row++) {
            System.out.print(nodes.get(row).getData() + " ");
            for (int col = 0; col < matrix[row].length ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
