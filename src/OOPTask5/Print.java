package OOPTask5;

public class Print {
    public void print(int val) {
        System.out.println(val);
    }

    public void print(String val) {
        System.out.println(val);
    }

    public void print(int[] arr) {
        StringBuilder str = new StringBuilder();
        for (int item : arr)
            str.append(item).append(" ");
        System.out.print(str);
    }

    public void print(String[] arr) {
        StringBuilder str = new StringBuilder();
        for (String item : arr)
            str.append(item).append(" ");
        System.out.print(str);
    }
}
