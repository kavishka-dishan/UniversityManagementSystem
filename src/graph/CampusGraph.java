package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CampusGraph {

    private ArrayList<Location> locations;
    private ArrayList<ArrayList<Integer>> adjacencyList;

    public CampusGraph() {
        locations = new ArrayList<>();
        adjacencyList = new ArrayList<>();
    }

    // Add a campus location
    public boolean addLocation(String name) {

        if (findLocation(name) != -1) {
            System.out.println("Location already exists.");
            return false;
        }

        locations.add(new Location(name));
        adjacencyList.add(new ArrayList<>());

        System.out.println("Location added successfully.");
        return true;
    }

    // Find location index
    private int findLocation(String name) {

        for (int i = 0; i < locations.size(); i++) {

            if (locations.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }

        return -1;
    }

    // Add connection between two locations
    public boolean addConnection(String location1, String location2) {

        int index1 = findLocation(location1);
        int index2 = findLocation(location2);

        if (index1 == -1 || index2 == -1) {
            System.out.println("One or both locations were not found.");
            return false;
        }

        if (index1 == index2) {
            System.out.println("Cannot connect a location to itself.");
            return false;
        }

        if (adjacencyList.get(index1).contains(index2)) {
            System.out.println("Connection already exists.");
            return false;
        }

        adjacencyList.get(index1).add(index2);
        adjacencyList.get(index2).add(index1);

        System.out.println("Connection added successfully.");
        return true;
    }

    // Remove connection
    public boolean removeConnection(String location1, String location2) {

        int index1 = findLocation(location1);
        int index2 = findLocation(location2);

        if (index1 == -1 || index2 == -1) {
            System.out.println("One or both locations were not found.");
            return false;
        }

        boolean removed1 =
                adjacencyList.get(index1).remove(Integer.valueOf(index2));

        boolean removed2 =
                adjacencyList.get(index2).remove(Integer.valueOf(index1));

        if (removed1 && removed2) {
            System.out.println("Connection removed successfully.");
            return true;
        }

        System.out.println("Connection does not exist.");
        return false;
    }

    // Remove location
    public boolean removeLocation(String name) {

        int index = findLocation(name);

        if (index == -1) {
            System.out.println("Location was not found.");
            return false;
        }

        locations.remove(index);
        adjacencyList.remove(index);

        for (ArrayList<Integer> connections : adjacencyList) {

            connections.remove(Integer.valueOf(index));

            for (int i = 0; i < connections.size(); i++) {

                if (connections.get(i) > index) {
                    connections.set(i, connections.get(i) - 1);
                }
            }
        }

        System.out.println("Location removed successfully.");
        return true;
    }

    // Display campus graph
    public void displayGraph() {

        if (locations.isEmpty()) {
            System.out.println("Campus graph is empty.");
            return;
        }

        System.out.println();
        System.out.println("========== CAMPUS ROUTES ==========");

        for (int i = 0; i < locations.size(); i++) {

            System.out.print(locations.get(i).getName() + " -> ");

            for (int connectedIndex : adjacencyList.get(i)) {
                System.out.print(
                    locations.get(connectedIndex).getName() + " "
                );
            }

            System.out.println();
        }
    }

    // Breadth First Search
    public void bfs(String startLocation) {

        int startIndex = findLocation(startLocation);

        if (startIndex == -1) {
            System.out.println("Starting location was not found.");
            return;
        }

        boolean[] visited = new boolean[locations.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[startIndex] = true;
        queue.add(startIndex);

        System.out.println("BFS Traversal:");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(
                locations.get(current).getName() + " "
            );

            for (int neighbour : adjacencyList.get(current)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }

    // Depth First Search
    public void dfs(String startLocation) {

        int startIndex = findLocation(startLocation);

        if (startIndex == -1) {
            System.out.println("Starting location was not found.");
            return;
        }

        boolean[] visited = new boolean[locations.size()];

        System.out.println("DFS Traversal:");

        dfsRecursive(startIndex, visited);

        System.out.println();
    }

    private void dfsRecursive(int current, boolean[] visited) {

        visited[current] = true;

        System.out.print(
            locations.get(current).getName() + " "
        );

        for (int neighbour : adjacencyList.get(current)) {

            if (!visited[neighbour]) {
                dfsRecursive(neighbour, visited);
            }
        }
    }
}