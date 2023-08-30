import java.util.*;

class Solution{
    static int[] parent; // union find 알고리즘을 사용하기 위해

    public int solution (int n, int[][] costs){
        Arrays.sort(costs,(int[] c1, int[] c2) -> c1[2]-c2[2]); // 크루스칼 알고리즘을 위해서 가중치로 오름차순 정렬
        
        //union find 알고리즘 
        parent = new int[n]; 

        for(int i = 0; i < n; i++){
            parent[i] = i;
        }

        int total = 0;
        for(int[] edge : costs){
            int from = edge[0];
            int to = edge[1];
            int cost = edge[2];

            int fromParent = findParent(from);
            int toParent = findParent(to);

            //부모노드가 같으면(두 노드가 같은 그래프에 속하면)
            //해당 간선르 선택하지 않는다.

            if(fromParent == toParent) continue;

            total += cost;
            parent[toParent] = fromParent; //간성을 연결했을 떄 두 노드가 같은 그래프에 속하게 되었으므로 부모 노드를 갱신
        }
        return total;
    }    

    // 부모노드가 자기 자신과 같은 노드를 찾을 때 까지 재귀호출

    private int findParent(int node){
        if(parent[node] == node) return node;
        return parent[node] = findParent(parent[node]);
    }
}
