package Ch09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q02 {
	/*
	 * �i�g��1 �����1 �B����1 ���l�l1 ������1 �B���R1 
	 * String[] names =
	 * {"�i�g��", "�����", "�B����", "���l�l", "�����", "������", "�B���R", "���l�l", "�����", "�����"}
	 * ���}�C���Q�Ӥ����A�䤤�Y�Ǥ������ơA�ЧQ��java.util.Set���S�ʡA�N���ƪ������h���A�u�d�@���C�бN�h�����ƫ᪺�����ܦb�ù��W�C
	 */
	public static void main(String[] args) {
		String[] names = { "�i�g��", "�����", "�B����", "���l�l", "�����", "������", "�B���R", "���l�l", "�����", "�����" };
		Set<String> set = new HashSet<>();
		for (int i = 0; i < names.length; i++) {
			set.add(names[i]);
		}
		System.out.println(set);

	}

}
