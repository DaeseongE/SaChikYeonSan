package SaChikYeonSan;

import java.util.Scanner;

public class SaChikYeonSan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("~~~~~ 재미있는 사칙연산 게임 ~~~~~");
		System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");
		System.out.println("# 엔터를 누르면 시작합니다.");
		System.out.println("===========================");
		System.out.println("\n");

		while (true) {
			System.out.println("# 난이도를 입력하세요! [상, 중, 하]");
			System.out.print(">> ");
			Scanner sc = new Scanner(System.in);
			String level = sc.nextLine();

			int[] arr = new int[3];
			int count = (int) (Math.random() * 3);

			if (level.equals("상")) {
				System.out.println("상급 난이도 입니다. 1~1000 범위로 출제됩니다.");
				while (true) {
					int num3 = (int) (Math.random() * 1000 + 1);
					int num6 = (int) (Math.random() * 1000 + 1);

					if ((int) count == 0) {
						System.out.print(num3 + " + " + num6 + " = ");
						int awnser = sc.nextInt();

						if (awnser == (num3 + num6)) {
							System.out.println("정답이다리");
							count = (int) (Math.random() * 3);

						} else if (awnser == 0) {
							System.out.println("난이도 단계로 이동합니다. \n 게임을 완전히 종료하고 싶으시다면 한번 더 0을 눌러주세요.");
							break;
						} else {
							System.out.println("오답입니다.");
							continue;

						}

					} else if ((int) count == 1) {
						System.out.print(num3 + " - " + num6 + " = ");
						int awnser = sc.nextInt();

						if (awnser == (num3 - num6)) {
							System.out.println("정답이다리");
							count = (int) (Math.random() * 3);
						} else if (awnser == 0) {
							System.out.println("난이도 단계로 이동합니다. \n 게임을 완전히 종료하고 싶으시다면 한번 더 0을 눌러주세요.");
							break;
						} else {
							System.out.println("오답입니다.");
							continue;

						}
					}

					else if ((int) count == 2) {
						System.out.print(num3 + " * " + num6 + " = ");
						int awnser = sc.nextInt();

						if (awnser == (num3 * num6)) {
							System.out.println("정답이다리");
							count = (int) (Math.random() * 3);
						} else if (awnser == 0) {
							System.out.println("난이도 단계로 이동합니다. \n 게임을 완전히 종료하고 싶으시다면 한번 더 0을 눌러주세요.");
							break;
						} else {
							System.out.println("오답입니다.");
							continue;

						}
					}

				}

			}

			else if (level.equals("중")) {
				System.out.println("중급 난이도 입니다. 1~100 범위로 출제됩니다.");

				while (true) {
					int num2 = (int) (Math.random() * 100 + 1);
					int num5 = (int) (Math.random() * 100 + 1);

					if ((int) count == 0) {
						System.out.print(num2 + " + " + num5 + " = ");
						int awnser = sc.nextInt();

						if (awnser == (num2 + num5)) {
							System.out.println("정답이다리");
							count = (int) (Math.random() * 3);

						} else if (awnser == 0) {
							System.out.println("난이도 단계로 이동합니다. \n 게임을 완전히 종료하고 싶으시다면 한번 더 0을 눌러주세요.");
							break;
						} else {
							System.out.println("오답입니다.");
							continue;

						}

					} else if ((int) count == 1) {
						System.out.print(num2 + " - " + num5 + " = ");
						int awnser = sc.nextInt();

						if (awnser == (num2 - num5)) {
							System.out.println("정답이다리");
							count = (int) (Math.random() * 3);
						} else if (awnser == 0) {
							System.out.println("난이도 단계로 이동합니다. \n 게임을 완전히 종료하고 싶으시다면 한번 더 0을 눌러주세요.");
							break;
						} else {
							System.out.println("오답입니다.");
							continue;

						}
					}

					else if ((int) count == 2) {
						System.out.print(num2 + " * " + num5 + " = ");
						int awnser = sc.nextInt();

						if (awnser == (num2 * num5)) {
							System.out.println("정답이다리");
							count = (int) (Math.random() * 3);
						} else if (awnser == 0) {
							System.out.println("난이도 단계로 이동합니다. \n 게임을 완전히 종료하고 싶으시다면 한번 더 0을 눌러주세요.");
							break;
						} else {
							System.out.println("오답입니다.");
							continue;

						}
					}

				}

			}

			else if (level.equals("하")) {
				System.out.println("하급 난이도 입니다. 1~20 범위로 출제됩니다.");

				while (true) {
					int num1 = (int) (Math.random() * 20 + 1);
					int num4 = (int) (Math.random() * 20 + 1);
					if ((int) count == 0) {

						System.out.print(num1 + " + " + num4 + " = ");
						int awnser = sc.nextInt();

						if (awnser == (num1 + num4)) {
							System.out.println("정답이다리");
							count = (int) (Math.random() * 3);

						} else if (awnser == 0) {
							System.out.println("난이도 단계로 이동합니다. \n 게임을 완전히 종료하고 싶으시다면 한번 더 0을 눌러주세요.");
							break;
						} else {
							System.out.println("오답입니다.");
							continue;

						}

					} else if ((int) count == 1) {
						System.out.print(num1 + " - " + num4 + " = ");
						int awnser = sc.nextInt();

						if (awnser == (num1 - num4)) {
							System.out.println("정답이다리");
							count = (int) (Math.random() * 3);
						} else if (awnser == 0) {
							System.out.println("난이도 단계로 이동합니다. \n 게임을 완전히 종료하고 싶으시다면 한번 더 0을 눌러주세요.");
							break;
						} else {
							System.out.println("오답입니다.");
							continue;

						}
					}

					else if ((int) count == 2) {
						System.out.print(num1 + " * " + num4 + " = ");
						int awnser = sc.nextInt();

						if (awnser == (num1 * num4)) {
							System.out.println("정답이다리");
							count = (int) (Math.random() * 3);
						} else if (awnser == 0) {
							System.out.println("난이도 단계로 이동합니다. \n 게임을 완전히 종료하고 싶으시다면 한번 더 0을 눌러주세요.");
							break;
						} else {
							System.out.println("오답입니다.");
							continue;

						}
					}

				}

			} else if (level.equals("0")) {
				System.out.println("게임이 종료됩니다.");

				break;
			} else {
				System.out.println("난이도를 다시 입력해 주세요.");
				continue;
			}

		}
	}
}
