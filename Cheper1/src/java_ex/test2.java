package java_ex;

import java.util.LinkedList;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		try {
			user u = new user();
			u.userInput();
		} catch (Exception e) {
			System.out.println("메소드 오류");
			e.printStackTrace();
		}
	}
}
class user {
	Scanner sc;
	int number = 0;
	LinkedList<Integer> numberArr;
	int count = 0;

	public void userInput() {
		numberArr = new LinkedList<>();
		System.out.println("추가할 값을 입력해주세요");

		while (true) {
			try {
				sc = new Scanner(System.in);
				if (count >= 1) {
					System.out.println("추가할 값을 입력해주세요 " + count + "번째");
				}
				if (numberArr.size() == 7) {
					System.out.println("배열값을 모두 추가 하셨습니다.");
					break;
				}
				this.number = sc.nextInt();
				numberArr.add(this.number);
				System.out.println(numberArr);
				count++;
			} catch (Exception e) {
				System.out.println("숫자만 입력가능합니다");
				continue;
			}
		}
	}
}