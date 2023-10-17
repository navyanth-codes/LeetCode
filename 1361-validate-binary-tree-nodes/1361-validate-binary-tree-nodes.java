class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int root = -1, indegree[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) ++indegree[leftChild[i]];
            if (rightChild[i] != -1) ++indegree[rightChild[i]];
        }
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                root = i;
                break;
            }
        }
        if (root == -1) return false;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);
        Set<Integer> visited = new HashSet<>();
        visited.add(root);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (leftChild[cur] != -1) {
                if (visited.contains(leftChild[cur])) return false;
                visited.add(leftChild[cur]);
                queue.offer(leftChild[cur]);
            }
            if (rightChild[cur] != -1) {
                if (visited.contains(rightChild[cur])) return false;
                visited.add(rightChild[cur]);
                queue.offer(rightChild[cur]);
            }
        }
        return visited.size() == n;
    }
}