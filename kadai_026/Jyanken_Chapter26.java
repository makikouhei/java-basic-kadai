package kadai_026;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	//ユーザーのじゃんけんの手
	public String getMyChoice(){
		
		System.out.println("あなたのじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょ");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String myChoice = "";
		
		boolean validInput = false;
		
		while (!validInput) {
	        myChoice = scanner.next();
	        if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
	            validInput = true;
	        } else {
	            System.out.println("(r , s , p)の中からもう一度入力してください。");
	        }
	    }
		scanner.close();
		
		return myChoice;
	}
	//コンピューターのじゃんけんの手
	public String getRandom() {
		//じゃんけんの手をランダムで選択
		Random random = new Random();
		int randomNumber = random.nextInt(3);
		
		String[] computerChoice = {"r","s","p"};
		return computerChoice[randomNumber];
		
	}
	//じゃんけんを行う
	public void playGame(String myChoice, String computerChoice) {
		HashMap<String, String> choice = new HashMap<>();
		
		choice.put("r", "グー");
		choice.put("s", "チョキ");
		choice.put("p", "パー");
			
		System.out.println("あなたの手は" + choice.get(myChoice) + "、対戦相手の手は" + choice.get(computerChoice));
		//じゃんけんの判定
		if(myChoice.equals(computerChoice)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("r") && computerChoice.equals("s")) ||
				   (myChoice.equals("s") && computerChoice.equals("p")) ||
				   (myChoice.equals("p") && computerChoice.equals("r"))) {
			System.out.println("あなたの勝ちです!");
		} else {
			System.out.println("あなたの負けです!");
		}
	}
	
	
}
