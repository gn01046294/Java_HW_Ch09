package Ch09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q02 {
	/*
	 * 張君雅1 潘美雪1 劉雪莉1 黃彬彬1 黃美華1 劉雪麗1 
	 * String[] names =
	 * {"張君雅", "潘美雪", "劉雪莉", "黃彬彬", "潘美雪", "黃美華", "劉雪麗", "黃彬彬", "潘美雪", "潘美雪"}
	 * 此陣列有十個元素，其中某些元素重複，請利用java.util.Set的特性，將重複的元素去除，只留一份。請將去除重複後的資料顯示在螢幕上。
	 */
	public static void main(String[] args) {
		String[] names = { "張君雅", "潘美雪", "劉雪莉", "黃彬彬", "潘美雪", "黃美華", "劉雪麗", "黃彬彬", "潘美雪", "潘美雪" };
		Set<String> set = new HashSet<>();
		for (int i = 0; i < names.length; i++) {
			set.add(names[i]);
		}
		System.out.println(set);

	}

}
