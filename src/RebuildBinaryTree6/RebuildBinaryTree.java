package RebuildBinaryTree6;

import java.util.Arrays;

/**
 * Title: ǰ�����������������������
 * Description:����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡���������ǰ���������
 * {1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 * 
 * @author rico
 * @created 2017��5��30�� ����10:01:44
 */
public class RebuildBinaryTree {
	  
	/**     
	 * @description �ݹ��㷨
	 * @author rico       
	 * @created 2017��5��30�� ����10:04:09     
	 * @param pre
	 * @param in
	 * @return     
	 */
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre != null && in != null && pre.length == in.length
				&& pre.length != 0) {
			TreeNode root = new TreeNode(pre[0]);
			int index = 0;
			while (in[index] != pre[0]) {
				index++;
			}
			if (index > 0) {  //���������ݹ���ֹ����(û��������)
				int[] left_pre = Arrays.copyOfRange(pre, 1, index + 1);
				int[] left_in = Arrays.copyOfRange(in, 0, index);
				root.left = reConstructBinaryTree(left_pre, left_in);
			}
			if (index < pre.length - 1) {  // �ݹ���ֹ����(û��������)
				int[] right_pre = Arrays
						.copyOfRange(pre, index + 1, pre.length);
				int[] right_in = Arrays.copyOfRange(in, index + 1, pre.length);
				root.right = reConstructBinaryTree(right_pre, right_in);
			}
			return root;
		}
		return null;
	}

	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };

		RebuildBinaryTree tree = new RebuildBinaryTree();
		System.out.println(tree.printBinaryTree(tree.reConstructBinaryTree(pre,
				in)));
	}

	/**
	 * @description �Թ�������ʽ��ӡ��������ǰ�������Ӧ��
	 * @author rico
	 * @created 2017��5��24�� ����8:13:08
	 * @param root
	 * @return
	 */
	public String printBinaryTree(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		if (root != null) {
			sb.append(root.data);
			if (root.left != null || root.right != null) {
				sb.append('(');
				sb.append(printBinaryTree(root.left));
				sb.append(',');
				sb.append(printBinaryTree(root.right));
				sb.append(')');
			}
		}
		return sb.toString();
	}
}

/**
 * Title: ���Ľ�� Description:
 * 
 * @author rico
 * @created 2017��5��29�� ����9:56:09
 */
class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data) {
		this.data = data;
	}
}
