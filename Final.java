
import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.Player;

public class Final {

	public static void main(String[] args) throws Exception {

		Random r = new Random();
		Scanner scanStr = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		int chance1 = 3;

		tink();
		System.out.println("姫を救え！");
		System.out.println();
		System.out.println("お姫様を救うために、さまざまなチャレンジを乗り越えてください");
		System.out.println("ルール：すべてのチャレンジをクリアするとお姫様を救えます。1つでも失敗するとゲームオーバーです！");

		System.out.println();
		start();
		System.out.println("ROUND 1:言葉当てゲーム");
		ready();
		go();
		System.out.println("チャンスは3回！");

		while (true) {
			System.out.println("ヒント: ウェブサイトを作るものです。タグを使います。");
			hint();
			System.out.println("H _ _ _: ");
			String answer1 = scanStr.nextLine();

			if (answer1.equals("html") || answer1.equals("HTML")) {
				System.out.println("おめでとう！正解です！次のチャレンジへ進みましょう！");
				win();
				pass();
				break;
			} else {
				chance1 -= 1;
				System.out.println("チャンスあと" + chance1 + "回");
			}
			if (chance1 == 0) {
				System.out.println("ゲームオーバ―！お姫様を救えませんでした。");
				lose();
				fail();
				return;
			}
		}

		System.out.println();
		System.out.println("ROUND 2: まるばつゲーム");
		ready();
		go();
		String[] board = {
				"1", "2", "3",
				"4", "5", "6",
				"7", "8", "9"
		};
		System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
		System.out.println("-----");
		System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
		System.out.println("-----");
		System.out.println(board[6] + "|" + board[7] + "|" + board[8]);

		while (true) {

			int choice = scanInt.nextInt();
			board[choice - 1] = "X";

			while (true) {
				int compt = r.nextInt(9);
				if (board[compt].equals("X") == false && board[compt].equals("O") == false) {
					board[compt] = "O";
					break;
				}
			}
			System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
			System.out.println("-----");
			System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
			System.out.println("-----");
			System.out.println(board[6] + "|" + board[7] + "|" + board[8]);

			if (board[0].equals("X") && board[1].equals("X") && board[2].equals("X")) {
				System.out.println("おめでとう！次のチャレンジへ進みましょう！");
				win();
				pass();
				break;
			} else if (board[3].equals("X") && board[4].equals("X") && board[5].equals("X")) {
				System.out.println("おめでとう！次のチャレンジへ進みましょう！");
				win();
				pass();
				break;
			} else if (board[6].equals("X") && board[7].equals("X") && board[8].equals("X")) {
				System.out.println("おめでとう！次のチャレンジへ進みましょう！");
				win();
				pass();
				break;
			} else if (board[0].equals("X") && board[3].equals("X") && board[6].equals("X")) {
				System.out.println("おめでとう！次のチャレンジへ進みましょう！");
				win();
				pass();
				break;
			} else if (board[1].equals("X") && board[4].equals("X") && board[7].equals("X")) {
				System.out.println("おめでとう！次のチャレンジへ進みましょう！");
				win();
				pass();
				break;
			} else if (board[2].equals("X") && board[5].equals("X") && board[8].equals("X")) {
				System.out.println("おめでとう！次のチャレンジへ進みましょう！");
				win();
				pass();
				break;
			} else if (board[0].equals("X") && board[4].equals("X") && board[8].equals("X")) {
				System.out.println("おめでとう！次のチャレンジへ進みましょう！");
				win();
				pass();
				;
			} else if (board[2].equals("X") && board[4].equals("X") && board[6].equals("X")) {
				System.out.println("おめでとう！次のチャレンジへ進みましょう！");
				win();
				pass();
				break;
			} else if (board[0].equals("O") && board[1].equals("O") && board[2].equals("O")) {
				System.out.println("ゲームオーバ―！お姫様を救えませんでした。");
				lose();
				fail();
				return;
			} else if (board[3].equals("O") && board[4].equals("O") && board[5].equals("O")) {
				System.out.println("ゲームオーバ―！お姫様を救えませんでした。");
				lose();
				fail();
				return;
			} else if (board[6].equals("O") && board[7].equals("O") && board[8].equals("O")) {
				System.out.println("ゲームオーバ―！お姫様を救えませんでした。");
				lose();
				fail();
				return;
			} else if (board[0].equals("O") && board[3].equals("O") && board[6].equals("O")) {
				System.out.println("ゲームオーバ―！お姫様を救えませんでした。");
				lose();
				fail();
				return;
			} else if (board[1].equals("O") && board[4].equals("O") && board[7].equals("O")) {
				System.out.println("ゲームオーバ―！お姫様を救えませんでした。");
				lose();
				fail();
				return;
			} else if (board[2].equals("O") && board[5].equals("O") && board[8].equals("O")) {
				System.out.println("ゲームオーバ―！お姫様を救えませんでした。");
				lose();
				fail();
				return;
			} else if (board[0].equals("O") && board[4].equals("O") && board[8].equals("O")) {
				System.out.println("ゲームオーバ―！お姫様を救えませんでした。");
				lose();
				fail();
				return;
			} else if (board[2].equals("O") && board[4].equals("O") && board[6].equals("O")) {
				System.out.println("ゲームオーバ―！お姫様を救えませんでした。");
				lose();
				fail();
				return;
			}
		}

		System.out.println();
		System.out.println("ROUND 3:数字当てゲーム");
		System.out.println("1から20までの数字を選んでください!");
		ready();
		go();
		System.out.println("チャンスは5回！");
		int secret = r.nextInt(20) + 1;
		int chance3 = 5;
		while (true) {
			int guess = scanInt.nextInt();
			if (guess == secret) {
				System.out.println("おめでとう！正解です！次のチャレンジへ進みましょう！");
				win();
				break;
			} else if (guess < secret) {
				System.out.println("もっと大きいです！");
				num();
				chance3 -= 1;
				System.out.println("チャンスはあと" + chance3 + "回!");
			} else if (guess > secret) {
				System.out.println("もっと小さいです！");
				num();
				chance3 -= 1;
				System.out.println("チャンスはあと" + chance3 + "回!");
			}
			if (chance3 == 0) {
				System.out.println("ゲームオーバ―！お姫様を救えませんでした。");
				lose();
				fail();
				return;
			}
		}

		System.out.println();
		System.out.println("ROUND 4:言葉当てゲーム");
		ready();
		go();
		int chance2 = 3;
		System.out.println("チャンスは3回！");

		while (true) {
			System.out.println("ヒント: プログラミン言語");
			hint();
			System.out.println(" _ A _ _ : ");
			String answer2 = scanStr.nextLine();

			if (answer2.equals("java") || answer2.equals("JAVA")) {
				break;
			} else {
				chance2 -= 1;
				System.out.println("チャンスあと" + chance2 + "回");
			}
			if (chance2 == 0) {
				System.out.println("ゲームオーバ―！お姫様を救えませんでした。");
				lose();
				fail();
				return;
			}
		}

		System.out.println("おめでとうございます！お姫様を救うことができます！");
		win();
		victory();

	}

	public static void tink() throws Exception {
		FileInputStream fis = new FileInputStream("放送開始チャイム.mp3");
		Player player = new Player(fis);
		player.play();
	}

	public static void start() throws Exception {
		FileInputStream fis = new FileInputStream("「スタート」.mp3");
		Player player = new Player(fis);
		player.play();
	}

	public static void hint() throws Exception {
		FileInputStream fis = new FileInputStream("「ヒントだよ」.mp3");
		Player player = new Player(fis);
		player.play();
	}

	public static void ready() throws Exception {
		FileInputStream fis = new FileInputStream("「レディー…」.mp3");
		Player player = new Player(fis);
		player.play();
	}

	public static void go() throws Exception {
		FileInputStream fis = new FileInputStream("「ゴー」.mp3");
		Player player = new Player(fis);
		player.play();
	}

	public static void win() throws Exception {
		FileInputStream fis = new FileInputStream("「おめでとうございます」.mp3");
		Player player = new Player(fis);
		player.play();
	}

	public static void lose() throws Exception {
		FileInputStream fis = new FileInputStream("「残念でした」.mp3");
		Player player = new Player(fis);
		player.play();
	}

	public static void victory() throws Exception {
		FileInputStream fis = new FileInputStream("レベルアップ.mp3");
		Player player = new Player(fis);
		player.play();
	}

	public static void pass() throws Exception {
		FileInputStream fis = new FileInputStream("ジャジャーン.mp3");
		Player player = new Player(fis);
		player.play();
	}

	public static void fail() throws Exception {
		FileInputStream fis = new FileInputStream("dragon-studio-game-over-retro-8bit-sfx-499656.mp3");
		Player player = new Player(fis);
		player.play();
	}

	public static void num() throws Exception {
		FileInputStream fis = new FileInputStream("ニュースタイトル表示1.mp3");
		Player player = new Player(fis);
		player.play();
	}
}
