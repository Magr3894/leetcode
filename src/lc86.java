
class ListNode
{
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}

/**
 * 20200103
 */
public class lc86 {
    ListNode head;
    public void init()
    {
        int[] A = {1,4,3,2,5,2};
        head = new ListNode(A[0]);
        ListNode p = head;
        for (int i = 1; i < A.length; i++) {
            p.next = new ListNode(A[i]);
            p = p.next;
        }
    }
    public void visit(ListNode hh)
    {
        ListNode p = hh;
        while(p!=null)
        {
            System.out.println(p.val);
            p=p.next;
        }
    }
    public ListNode partition(ListNode head, int x) {
        if(head==null)return null; //空指针要考虑到
        ListNode p = head, pFather = null,qHead = new ListNode(-1),q = qHead;
        while(p!=null)
        {
            if(p.val>=x)
            {
                if(pFather!=null)
                {
                    pFather.next = p.next;
                }else
                {
                    head = p.next;
                }
                /**
                 * 这里是两种情况都需要进行的操作
                 */
                q.next = new ListNode(p.val);
                q = q.next;
            }else {
                pFather = p;
            }

            p = p.next;
        }
        if(pFather==null)return qHead.next;
        pFather.next = qHead.next;
        return head;

    }
    public static void main(String[] args) {
        lc86 tt  = new lc86();
        tt.init();
        ListNode ans =tt.partition(tt.head, 3);
        tt.visit(ans);
    }

}
