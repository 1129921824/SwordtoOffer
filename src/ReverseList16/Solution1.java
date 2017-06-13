package ReverseList16;

/**        
 * Title: ��ת����()   
 * Description:����һ��������ת�����������������Ԫ�ء�
 * ʱ�临�Ӷȣ�O(n),�ռ临�Ӷȣ�O(n)
 * @author rico       
 * @created 2017��6��10�� ����5:47:21    
 */  
public class Solution1 {
	public ListNode ReverseList(ListNode head) {
		if (head != null && head.next != null) {
			ListNode p1 = head;
			ListNode p2 = p1.next;
			while(p2 != null){
				ListNode tmp = p2.next;
				p2.next = p1;
				if (p1 == head) {
					p1.next = null;
				}
				p1 = p2;
				p2 = tmp;
			}
			head = p1;
		}
		return head;
	}
}
