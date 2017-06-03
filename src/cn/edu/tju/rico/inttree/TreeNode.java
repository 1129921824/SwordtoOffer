package cn.edu.tju.rico.inttree;

/**
 * Title: ����� 
 * Description: �������Ľ��
 * 
 * @author rico
 * @created 2017��4��6�� ����9:55:58
 */
public class TreeNode {

	public int data; // �������
	public TreeNode left; // ָ�����ӽ��
	public TreeNode right; // ָ���Һ��ӽ��
	public boolean flag; // ���ڷǵݹ�������

	/**
	 * ���캯��
	 * 
	 * @description ����һ���½��
	 * @author rico
	 * @created 2017��4��6�� ����9:56:56
	 * @param data
	 *            ��Ԫ������
	 * @param next
	 *            ��Ԫ���������Ͻ��
	 */
	public TreeNode(int data) {
		this.data = data;
	}

	public TreeNode() {
	}
	
	@Override
	public String toString() {
		return String.valueOf(data);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof TreeNode) {
			TreeNode temp = (TreeNode) obj;
			if (data == temp.data) {
				return true;
			}
		}
		return false;
	}
}
