package javaSilver.chapter03.p136;


import java.util.List;
//import java.util.*; �e�L�X�g�̉𓚂ł�util.*�Autil.stream.*���C���|�[�g����悤�L�ڂ���������ctrl�{s�ŕۑ������util.List�̂݃C���|�[�g�ƂȂ��Ă��܂�
//import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		//	3-4
		List<String> names = List.of("���Y��", "���������", "������^", "��]�x�l");
		names.stream()
		.filter(n -> n.length() <= 4)
		.map(n -> n + "����")
		.forEach(System.out::println);
	}
}