// Last updated: 02/10/2026, 19:43:10
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12
13    private ListNode findmid(ListNode head){
14        if(head == null || head.next == null){
15            return head;
16        }
17
18        ListNode slow = head;
19        ListNode fast = head.next;
20
21        while(fast != null && fast.next != null){
22            slow = slow.next;
23            fast = fast.next.next;
24        }
25
26        return slow;
27    }
28
29    private ListNode merge(ListNode head1, ListNode head2){
30        ListNode mergeLL = new ListNode(-1);
31        ListNode temp = mergeLL;
32
33        while(head1 != null && head2 != null){
34            if(head1.val <= head2.val){
35                temp.next = head1;
36                head1 = head1.next;
37            }
38            else{
39                temp.next = head2;
40                head2 = head2.next;
41            }
42
43            temp = temp.next;
44        }
45
46        while(head1 != null){
47            temp.next = head1;
48            head1 = head1.next;
49            temp = temp.next;
50        }
51
52        while(head2 != null){
53            temp.next = head2;
54            head2 = head2.next;
55            temp = temp.next;
56        }
57
58        return mergeLL.next;
59    }
60
61    public ListNode sortList(ListNode head) {
62
63        if(head == null || head.next == null){
64            return head;
65        }
66
67        ListNode mid = findmid(head);
68
69        ListNode righthead = mid.next;
70        mid.next = null;
71
72        ListNode left = sortList(head);
73        ListNode right = sortList(righthead);
74
75        return merge(left, right);
76    }
77}