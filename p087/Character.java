package javaSilver.chapter02.p087;

public sealed class Character permits Hero, Wizard {
	//	sealed���`���邱�Ƃ�promits�Ɏw�肳�ꂽ�N���X�ɑ΂��A���g��K���p������悤�ɂł���

	char c = 'a';
	
		public void heal(Character target) {
			switch(c) { // �O��̐i���񍐉�̍ۂɋL�ڂ������e_��������
			case 'a':
				break; // �����܂�
			
//			switch(target){ // ���ނɋL�ڂ̃R�[�h
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