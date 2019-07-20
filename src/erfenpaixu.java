public class erfenpaixu {
    /**
     * 二分查找法：
     *     先对代码进行排序，再取中间值，再拿指定值跟中间值进行比较，如果小于中间值，查找范围就变成最小的索引值到中间值索引减1，如果指定值大于中间值，则查找范围变成中间值索引加1到最大的索引值。
     * 优点：缩小查找范围，提高性能
     * @param args
     */

    //查找指定数组指定元素的索引值。
    public static void main(String[] args) {
        int[] arr = {5,4,231,45,75,45,11,-11,-21,-45};
        int key = 45;
        sortMethod(arr);
        printSort(arr);
        int index = binarySeach(arr,key,0,arr.length - 1);
        System.out.println("----------->所求索引值："+index);
    }
    //二分查找法核心代码
    private static int binarySeach(int[] arr, int key,int fromIndex,int toInedx) {
        //最小索引与最大索引
        //fromIndex 表示从哪个位置开始查找，toIndex表示到那个位置结束
        int minIndex = fromIndex,maxIndex = toInedx;
        while(maxIndex >= minIndex){
            //中间索引
            int midIndex = (maxIndex + minIndex)/2;
            //中间索引的值
            int midIndexVal = arr[midIndex];
            if(key > midIndexVal){
                minIndex = midIndex + 1;
            }else if(key < midIndexVal){
                maxIndex = midIndex - 1;
            }else{
                return midIndex;
            }
        }
        return -1;
    }
    //打印排序后的代码
    private static void printSort(int[] arr) {
        String ret = "[";
        for(int i = 0;i<arr.length;i++){
            ret +=arr[i];
            if(i == arr.length - 1){
                ret += "]";
            }else{
                ret += ",";
            }
        }
        System.out.println("----------->排序：" + ret);
    }
    //对代码进行排序
    private static void sortMethod(int[] arr) {
        for(int j = 0;j<arr.length - 1;j++){
            for(int i = 0;i<arr.length - j - 1;i++){
                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

}
