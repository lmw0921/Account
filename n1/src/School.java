import java.util.Scanner;
public class School {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int K, S, M;
		boolean Circles;
		int Circlesing = 0;
		
		for(int i = 1; i <= 3; i++){
		System.out.println("���Ƹ� ���� ���� > true < , > false <");
		Circles = s.nextBoolean();
		
		if(Circles = true){
			System.out.println("���Ƹ� ���� ���� ����...!");
		} else if(Circles = false){
			System.out.println("���Ƹ� ���� ���� ����...!");
		}
		System.out.println("����,����,���� ������ �Է� �Ͻÿ�");
		K = s.nextInt();
		S = s.nextInt();
		M = s.nextInt();
		
		System.out.print("���Ƹ� ���� ���� : "+Circles);
		System.out.println(" ���� : [" +K+ "] ���� : [" +S+ "] ���� : [" +M+"]" );
		
		Circlesing++;
		}
		
		System.out.println(Circlesing = 1);
		int[][] AA = new int[2][3];
	}
}