// Last updated: 02/10/2026, 19:47:39
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        String arr[] = new String[score.length];
4        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
5        for(int i=0;i<score.length;i++){
6            pq.add(score[i]);
7        }
8        HashMap<Integer,String> map = new HashMap<>();
9        int idx = 1;
10        while(!pq.isEmpty()){
11            if(idx==1){
12                map.put(pq.remove(),"Gold Medal");
13            }
14            else if(idx ==2){
15                map.put(pq.remove(),"Silver Medal");
16            }
17            else if(idx ==3){
18                map.put(pq.remove(),"Bronze Medal");
19            }
20            else{
21                map.put(pq.remove(),Integer.toString(idx));
22            }
23            idx++;
24        }
25        for(int i=0;i<score.length;i++){
26            arr[i] = map.get(score[i]);
27        }
28        return arr;
29    }
30}