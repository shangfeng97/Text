public class maopao2 {
    /**
     *  冒泡排序：
     *         相邻两个元素依次相比较
     *         先出现最大值，最后出现最小值
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = {6, 9, 4589, 442, 458, 5232, -788, 7, 545, -44, 55, -11};
        sortMethod(arr);
        p(arr);
    }

    private static void p(int[] arr) {
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

    private static void sortMethod(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}