import java.util.Arrays;

public class CloneEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		//�迭 arr�� �����ؼ� ���� ������ ���ο� �迭�� �����.
		int[] arrclone = arr.clone();
		arrclone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrclone));
	}

}
