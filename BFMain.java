package Ch09;
/*���g�{�����Өk�B�ͦp�U(���@�~�º�O�m�ߡA���������ӱƳ̫e���A�������@�w�ּ֡A�ּ֤��@�w�����A���`�������|���ߤl�k���d�B�ּ֡K)
1. �Ťp�l  �~�~ 500000    ����  168
2. �B����  �~�~ 650000    ����  170
3. ������  �~�~ 750000    ����  160
4. �P�P�P  �~�~ 500000    ����  165
5. �����  �~�~ 500000    ����  170
�д����g�������g�@��Java�{���A��華�g���k�B�Ͷi�檺�ƧǡA
�ƧǪ��ǫh�p�U�G
�̨k�Ī��~�~�Ѱ��ƨ�C�A�~�~�ۦP�ɡA�Ѩ����M�w�A�������̦b�e�A�C�̦b��C
�{��������O�p�U�A�A�����ק�BoyFriend���O�A�M�����D���OBFMain.java*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BFMain {

	public static void main(String[] args) {
		 BoyFriend bf1 =  new BoyFriend("�Ťp�l", 50000, 168);
         BoyFriend bf2 =  new BoyFriend("�B����", 65000, 170);
         BoyFriend bf3 =  new BoyFriend("������", 75000, 160);
         BoyFriend bf4 =  new BoyFriend("�P�P�P", 50000, 165);
         BoyFriend bf5 =  new BoyFriend("�����", 50000, 170);
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
