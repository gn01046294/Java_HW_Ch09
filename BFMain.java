package Ch09;
/*玫君現有五個男朋友如下(此作業純粹是練習，金錢不應該排最前面，有錢不一定快樂，快樂不一定有錢，正常的父母會期盼子女健康、快樂…)
1. 溫小彬  年薪 500000    身高  168
2. 劉幼傑  年薪 650000    身高  170
3. 王丹丹  年薪 750000    身高  160
4. 周星星  年薪 500000    身高  165
5. 趙初明  年薪 500000    身高  170
請替玫君的媽媽寫一個Java程式，能對玫君的男朋友進行的排序，
排序的準則如下：
依男孩的年薪由高排到低，年薪相同時，由身高決定，身高高者在前，低者在後。
現有兩個類別如下，你必須修改BoyFriend類別，然後執行主類別BFMain.java*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BFMain {

	public static void main(String[] args) {
		 BoyFriend bf1 =  new BoyFriend("溫小彬", 50000, 168);
         BoyFriend bf2 =  new BoyFriend("劉幼傑", 65000, 170);
         BoyFriend bf3 =  new BoyFriend("王丹丹", 75000, 160);
         BoyFriend bf4 =  new BoyFriend("周星星", 50000, 165);
         BoyFriend bf5 =  new BoyFriend("趙初明", 50000, 170);
         List<BoyFriend> c = new ArrayList<>();
         c.add(bf1);
         c.add(bf2);
         c.add(bf3);
         c.add(bf4);
         c.add(bf5);
         
         Collections.sort(c);
         for(BoyFriend bf: c){
       	  System.out.println(bf);
         }

	}

}
