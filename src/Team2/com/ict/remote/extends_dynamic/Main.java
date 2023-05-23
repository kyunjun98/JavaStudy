package Team2.com.ict.remote.extends_dynamic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		Speaker speaker = new Speaker();
		Earphone earphone = new Earphone();

		while (true) {
			System.out.println("볼륨을 조절할 장치를 선택하세요.");
			System.out.print("1.TV, 2.스피커, 3.이어폰 4.나가기 >>>>> ");
			int device = sc.nextInt();
			if (device == 1) {
				while (true) {
					System.out.print("1.볼륨 올리기, 2.볼륨 내리기, 3. 나가기 >>>>> ");
					int volumeUpDown = sc.nextInt();
					if (volumeUpDown == 3) {
						break;
					}
					tv.setVolume(volumeUpDown);
				}
			} else if (device == 2) {
				while (true) {
					System.out.print("1.볼륨 올리기, 2.볼륨 내리기, 3. 나가기 >>>>> ");
					int volumeUpDown = sc.nextInt();
					if (volumeUpDown == 3) {
						break;
					}
					speaker.setVolume(volumeUpDown);
				}
			} else if (device == 3) {
				while (true) {
					System.out.print("1.볼륨 올리기, 2.볼륨 내리기, 3. 나가기 >>>>> ");
					int volumeUpDown = sc.nextInt();
					if (volumeUpDown == 3) {
						break;
					}
					earphone.setVolume(volumeUpDown);
				}
			} else if (device == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
