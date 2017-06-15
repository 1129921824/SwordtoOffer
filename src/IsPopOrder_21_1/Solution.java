package IsPopOrder_21_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Title: ջ��ѹ�롢��������
 * Description:
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ���������1
 * ,2,3,4,5��ĳջ��ѹ��˳��
 * ,����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 * 
 * @author rico
 * @created 2017��6��15�� ����4:56:55
 */

public class Solution {
    public boolean IsPopOrder(int [] pushA, int [] popA) {
    	if (pushA == null && popA == null) {
    		return true;
		}else if(pushA == null || popA == null){
			return false;
		}else if (pushA.length != popA.length) {
			return false;
		}
    	LinkedList<Integer> stack1 = new LinkedList<Integer>();
    	ArrayList<Integer> popList = new ArrayList<Integer>();
    	int n = pushA.length;
    	int index = 0;
    	for (int i = 0; i < n; i++) {
    		if (stack1.isEmpty()) {
				stack1.push(pushA[i]);
			}
    		if(stack1.peek() != popA[index]){
				stack1.push(pushA[i]);
			}else{
				popList.add(stack1.pop());
				index ++;
				while(!stack1.isEmpty() && stack1.peek() == popA[index]){
					popList.add(stack1.pop());
					index ++;
				}
			}
		}
    	
    	while(!stack1.isEmpty()){
    		popList.add(stack1.pop());
    	}
    	
    	for (int i = 0; i < popA.length; i++) {
			if (popA[i] != popList.get(i)) 
				return false;
		}
    	return true;
    }
}
