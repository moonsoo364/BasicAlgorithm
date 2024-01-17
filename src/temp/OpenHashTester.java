package temp;
import java.util.Scanner;

public class OpenHashTester {

    static Scanner stdIn = new Scanner(System.in);


    static class Data {
        static final int NO   = 1;        
        static final int NAME = 2;        

        private Integer no;              
        private String  name;             

        Integer keyCode() {
            return no;
        }

        public String toString() {
            return name;
        }

        void scanData(String guide, int sw) {
            System.out.println(guide + "�� �곗�댄�곕�� ���ν���몄��.");

            if ((sw & NO) == NO) {
                System.out.print("踰���: ");
                no = stdIn.nextInt();
            }
            if ((sw & NAME) == NAME) {
                System.out.print("�대�: ");
                name = stdIn.next();
            }
        }
    }

    enum Menu {
        ADD(      "異�媛�"),
        REMOVE(   "����"),
        SEARCH(   "寃���"),
        DUMP(     "����"),
        TERMINATE("醫�猷�");

        private final String message;        

        static Menu MenuAt(int idx) {        
            for (Menu m : Menu.values())
                if (m.ordinal() == idx)
                    return m;
            return null;
        }

        Menu(String string) {               
            message = string;
        }

        String getMessage() {                
            return message;
        }
    }

    static Menu SelectMenu() {
        int key;
        do {
            for (Menu m : Menu.values())
                System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
            System.out.print(" : ");
            key = stdIn.nextInt();
        } while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());

        return Menu.MenuAt(key);
    }

    public static void main(String[] args) {
        Menu menu;                                // 硫��� 
        Data data;                                // 異�媛��� �곗�댄�� 李몄“
        Data temp = new Data();                   // �쎌�� �ㅼ�� �곗�댄��

        OpenHash<Integer, Data> hash = new OpenHash<Integer, Data>(13);
        do {
            switch (menu = SelectMenu()) {
             case ADD :                           // 異�媛�
                data = new Data();
                data.scanData("異�媛�", Data.NO | Data.NAME);
                 int k = hash.add(data.keyCode(), data);
                 switch (k) {
                  case 1: System.out.println("洹� �ㅺ��� �대�� �깅����� ���듬����.");
                              break;
                  case 2: System.out.println("�댁�� ���대��� 媛��� 李쇱�듬����.");
                              break; 
                 }
                 break;

             case REMOVE :                               // ����
                 temp.scanData("����", Data.NO);
                 hash.remove(temp.keyCode());
                 break;

             case SEARCH :                               // 寃���
                temp.scanData("寃���", Data.NO);
                 Data t = hash.search(temp.keyCode());
                 if (t != null)
                     System.out.println("洹� �ㅻ�� 媛��� �곗�댄�곕�� " + t + "������.");
                else
                     System.out.println("�대�� �곗�댄�곌� ���듬����.");
                 break;

             case DUMP :                                 // ����
                 hash.dump();
                 break;
            }
        } while (menu != Menu.TERMINATE);
    }
}
