package com.wave.sparsearray;

public class SparseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��11*11��ԭʼ��ά����
		//0��ʾ��1��ʾ��2��ʾ��
		int chessArr1[][]= new int[11][11];
		chessArr1[1][2]=1;
		chessArr1[2][3]=2;
		//���ԭʼ�Ķ�ά����
		for(int[] row:chessArr1) {
			for(int data:row) {
				System.out.printf("%d\t",data);
				
			}
			System.out.println();
		}
		//����ά�����Ϊϡ������
		//�ȱ�����ά���飬�õ���0���ݵĸ���
		int sum=0;
		for(int i=0;i<chessArr1.length;i++) {
			for(int j=0;j<11;j++) {
				if(chessArr1[i][j]!=0) {
					sum++;
				}
			}
		}
		//������Ӧ��ϡ������
		int sparseArr[][]=new int[sum+1][3];
		//��ϡ�����鸳ֵ
		sparseArr[0][0]=11;
		sparseArr[0][1]=11;
		sparseArr[0][2]=sum;
		//������ά���飬����0 ��ֵ��ŵ�ϡ��������
		int count=0;//���ڼ�¼�ǵڼ�����0 ����
		for(int i=0;i<chessArr1.length;i++) {
			for(int j=0;j<11;j++) {
				if(chessArr1[i][j]!=0) {
					count++;
					sparseArr[count][0]=i;
					sparseArr[count][1]=j;
					sparseArr[count][2]=chessArr1[i][j];
				}
			}
		}
		//���ϡ������
		System.out.println();
		System.out.println("�õ���ϡ������Ϊ");
		for(int i=0;i<sparseArr.length;i++) {
			System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
		}
		//����ά����ָ��ɶ�ά����
		//�ȶ�ȡϡ�������һ�У��ﵽԭʼ��ά����
		int chessArr2[][]=new int[sparseArr[0][0]][sparseArr[0][1]];
		//���Ԫ��
		for(int i=1;i<sparseArr.length;i++) {
			chessArr2[sparseArr[i][0]][sparseArr[i][1]]=sparseArr[i][2];
		}
		//����ָ���Ķ�ά����
		System.out.println();
		System.out.println("��ԭ��Ķ�ά����");
		for(int[] row:chessArr2) {
			for(int data:row) {
				System.out.printf("%d\t",data);
				
			}
			System.out.println();
		}
	}

}
