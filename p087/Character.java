package javaSilver.chapter02.p087;

public sealed class Character permits Hero, Wizard {
	//	sealedを定義することでpromitsに指定されたクラスに対し、自身を必ず継承するようにできる

	char c = 'a';
	
		public void heal(Character target) {
			switch(c) { // 前回の進捗報告会の際に記載した内容_ここから
			case 'a':
				break; // ここまで
			
//			switch(target){ // 教材に記載のコード
//			case Hero h -> {h.hp += 20;}
//			case Wizard w -> {w.hp += 5;}
			}
		}

//	public void heal(Character target) {
//		if(target instanceof Hero) {
//			Hero h = (Hero)target;
//		}
//		if(target instanceof Wizard) {
//			Wizard w = (Wizard)target;
//		}
//	}
}