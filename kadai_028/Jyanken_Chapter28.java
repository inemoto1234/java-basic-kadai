package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
		
        String input = scanner.nextLine();
        
        //正しいじゃんけんの手であるか判断する
        while(!(input.equals("r")||input.equals("s")||input.equals("p"))) {
        	System.out.println("正しいじゃんけんの手を選びましょう");
        	input = scanner.nextLine();
        }	
        
        return input;
        
        
		
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String [] enemyHand = { "r", "s", "p"};
		int randNum = (int)Math.floor(Math.random() * 3);
		return enemyHand[randNum];
		
	}
	
	//じゃんけんを行う
	public void playGame(String myChoice, String enemyChoice){
		HashMap<String, String> handMap = new HashMap<>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		System.out.println("自分の手は" + handMap.get(myChoice) + ", 対戦相手の手は" + handMap.get(enemyChoice));
		
		if(myChoice.equals(enemyChoice)) {
			System.out.println("あいこです");
		}else if(
				(myChoice.equals("r") && enemyChoice.equals("s")) ||
				(myChoice.equals("s") && enemyChoice.equals("p")) ||
				(myChoice.equals("p") && enemyChoice.equals("r"))
		) {
			System.out.println("自分の勝ちです");
		} else {
            System.out.println("自分の負けです");
		}
		
		
	}
		
	

}
