public class Mini01 {

	public static void main(String[] args) {
		System.out.println("[구구단출력]");

		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				String msg = String.format("%02d * %02d = %02d\t", i, j, j * i);
				System.out.print(msg);
			}
			System.out.println("버그 수정중 .행");
			System.out.println("new_branch 생성했습니다");
			System.out.println("new_branch 수정합니다. 줄 추가");
		}

	}

}
