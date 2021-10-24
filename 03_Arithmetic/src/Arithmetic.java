public class Arithmetic {

    int num1;
    int num2;

    public Arithmetic(int i, int j) {
        this.num1 = i;
        this.num2 = j;

    public static void main(String[] args) {
            Arithmetic first = new Arithmetic(25, 10);
            System.out.println(summa());
            System.out.println(proizvedenye());
            System.out.println("Большее значение" + maximum());
            System.out.println("Меньшее значение" + num2);
        }
    }
        public int summa () {
            return num1 + num2;
        }
        public int proizvedenye () {
            return num1 * num2;
        }
        public int maximum () {
            if (num1 > num2) {
                return num1;
            }
            return num2;
        }
    }


