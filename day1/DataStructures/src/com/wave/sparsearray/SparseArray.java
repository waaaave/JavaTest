package com.wave.sparsearray;

public class SparseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个11*11的原始二维数组
		//0表示空1表示黑2表示白
		int chessArr1[][]= new int[11][11];
		chessArr1[1][2]=1;
		chessArr1[2][3]=2;
		//输出原始的二维数组
		for(int[] row:chessArr1) {
			for(int data:row) {
				System.out.printf("%d\t",data);
				
			}
			System.out.println();
		}
		//将二维数组变为稀疏数组
		//先遍历二维数组，得到非0数据的个数
		int sum=0;
		for(int i=0;i<chessArr1.length;i++) {
			for(int j=0;j<11;j++) {
				if(chessArr1[i][j]!=0) {
					sum++;
				}
			}
		}
		//创建对应的稀疏数组
		int sparseArr[][]=new int[sum+1][3];
		//给稀疏数组赋值
		sparseArr[0][0]=11;
		sparseArr[0][1]=11;
		sparseArr[0][2]=sum;
		//遍历二维数组，将非0 的值存放到稀疏数组中
		int count=0;//用于记录是第几个非0 数据
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
		//输出稀疏数组
		System.out.println();
		System.out.println("得到的稀疏数组为");
		for(int i=0;i<sparseArr.length;i++) {
			System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
		}
		//将二维数组恢复成二维数组
		//先读取稀疏数组第一行，达到原始二维数组
		int chessArr2[][]=new int[sparseArr[0][0]][sparseArr[0][1]];
		//添加元素
		for(int i=1;i<sparseArr.length;i++) {
			chessArr2[sparseArr[i][0]][sparseArr[i][1]]=sparseArr[i][2];
		}
		//输出恢复后的二维数组
		System.out.println();
		System.out.println("复原后的二维数组");
		for(int[] row:chessArr2) {
			for(int data:row) {
				System.out.printf("%d\t",data);
				
			}
			System.out.println();
		}
	}

}
