public class maopao {
    /**
     *     选择排序：
     *         选定一个元素，一次和后面的元素相比较，如果选定的元素大雨后面的比较元素，就交换位置
     *         先出现最小值，最后出现最大值。
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 12, 55, 565, 421, 12, 2512, -5, -56};
        sortMethod(arr);
        p(arr);
    }
    //排序核心代码
    private static void sortMethod(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    //打印数组元素
    static void p(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i == arr.length - 1) {
                ret += "]";
            } else {
                ret += ",";
            }
        }
        System.out.println("---------->" + ret);
    }
}