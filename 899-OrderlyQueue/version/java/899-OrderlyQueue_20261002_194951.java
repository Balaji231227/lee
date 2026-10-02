// Last updated: 02/10/2026, 19:49:51
1class Solution {
2    public String orderlyQueue(String s, int k) {
3        StringBuilder sb = new StringBuilder(s);
4        if(k==1){
5            List<String>list = new ArrayList<>();
6            list.add(s);
7            for(int i=0;i<s.length()-1;i++){
8                char ch = sb.charAt(0);
9                sb = new StringBuilder(sb.substring(1));
10                sb.append(ch);
11                list.add(sb.toString());
12            }
13
14            Collections.sort(list);
15            return list.get(0);
16            
17        }
18
19        int freq[] = new int[26];
20        for(int i=0;i<s.length();i++){
21            freq[s.charAt(i)-'a']++;
22        }
23
24        sb = new StringBuilder();
25        for(int i=0;i<26;i++){
26            while(freq[i]!=0){
27                sb.append((char)('a'+i));
28                freq[i]--;
29            }
30        }
31
32        return sb.toString();
33    }
34}