package p0212;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		// 5개의 게임을 만들어주세요.
		/*
		 * 1. name=삼국지,price=30000,genre=전략
		 * 2. name=LOL,price=0;genre=실시간전략
		 * 3. name=카트라이더,price=0,genre=스포츠
		 * 4. name=스타크래프트,price=15000,genre=실시간전략
		 * 5. name=오버워치,price=32000,genre=RTS
		 */
		Game game1 = new Game();
		Game game2 = new Game();
		Game game3 = new Game();
		Game game4 = new Game();
		Game game5 = new Game();
		
		game1.setName("삼국지");
		game2.setName("LOL");
		game3.setName("카트라이더");
		game4.setName("스타크래프트");
		game5.setName("오버워치");
		
		game1.setPrice(30000);
		game2.setPrice(0);
		game3.setPrice(0);
		game4.setPrice(15000);
		game5.setPrice(32000);
		
		game1.setGenre("전략");
		game2.setGenre("실시간전략");
		game3.setGenre("스포츠");
		game4.setGenre("실시간전략");
		game5.setGenre("RTS");
		
		ArrayList<Game> gameList = new ArrayList<>();
		gameList.add(game1);
		gameList.add(game2);
		gameList.add(game3);
		gameList.add(game4);
		gameList.add(game5);
		for(Game g : gameList) {
			// 장르에 "전략"이라는 단어가 들어간 게임만 출력해주세요.
			String genre = g.getGenre();
			if(genre.contains("전략")) {
				System.out.println(g);
			}
			int price = g.getPrice();
			// 장르에 전략 이라는 단어가 들어가고 price가 0원이 아닌것만 출력
			if(genre.contains("전략") && price != 0) {
				System.out.println(g);
			}
		}
		System.out.println();
		for(Game g : gameList) {
			int price = g.getPrice();
			//price가 15000원 이상 30000원 미만인 것만 출력
			if(price >= 15000 && price < 30000) {
				System.out.println(g);
			}
		}
	}
}
