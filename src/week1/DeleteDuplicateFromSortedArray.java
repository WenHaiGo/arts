package week1;

/*
2018年6月17日21:11:00
    思考:1.为什么是有序数组  是否可以使用二分法?
         2.什么是原地删除
 */
public class DeleteDuplicateFromSortedArray {

    //法1,将不重复的数字放到新的数组
    public int removeDuplicates1(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i = 1;i<nums.length;i++){

        }
        return 0;
    }
    //法2因为是有序的所以只需要对于每一个第一次出现的数字做好标记就可以了
    public int[] removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return null;
        //判断无输入
        int number = 0;//标记计数
        for (int i=0; i < nums.length ; i++) {
            if ( nums[i] != nums[number] ) {
                number++;
                nums[number] = nums[i];
            }
        }
        number+=1; //标记+1即为数字个数
        return nums;
    }

    public static void main(String[] args) {

        int []num = {0,1,1,2,2,3,3,4};
        DeleteDuplicateFromSortedArray de = new DeleteDuplicateFromSortedArray();
        int[] arr=de.removeDuplicates(num);

        for (int a:arr
             ) {
            System.out.println(a);
        }
    }
}
