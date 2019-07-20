import java.util.Arrays;

public class shuzukaobe {
    /**
     *
     * @author Essence
     *arraycopy(Object src, int srcPos, Object dest,int destPos, int length)
     *该方法接收四个参数
     *object src :原数组，即被拷贝的数组
     *int srcPos: 原数组的目标位置 即从哪个位置开始拷贝起
     *Object dest:目标数组 即用来存储被拷贝的数组
     *int destPos：目标数组中的起始位置，即向目标数组中插入数据的起始位置
     *int length:要复制的元素数量
     */
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D"};
        String[] arr1 = new String[5];
        System.out.println(Arrays.toString(arr1)); // 拷贝之前 ： [null, null, null, null, null]
        System.arraycopy(arr, 1, arr1,2, 3);
        System.out.println(Arrays.toString(arr1)); //拷贝之后： [null, null, B, C, D]m

    }
}
