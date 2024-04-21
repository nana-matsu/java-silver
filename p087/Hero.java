package javaSilver.chapter02.p087;

public final class Hero extends Character {
	private String name;
	private int hp;
	
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	public int getHp() {return this.hp;}
	public void setHp(int hp) {this.hp = hp;}
	
	public void heal(Hero h) {
		super.heal(h);
	}
}
