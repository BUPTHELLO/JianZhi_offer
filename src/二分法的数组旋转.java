public class 二分法的数组旋转 {
//
//    把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
//    输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
//    例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
//    NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
//    注意数组中可能存在重复元素

    public static int minNumberInRotateArray(int [] array) {

        if(array==null || array.length == 0) return 0;
        int L = 0;
        int R = array.length-1;

        while (L<R){
            int mid  = (L+R)/2;
            if (array[mid]>array[R]) L = mid+1;
            else if(array[mid] == array[R]) R = R-1;
            else if (array[mid]<array[R]) R = mid;
        }
        return array[L];

    }

    public static void main(String[] args) {
            System.out.println(minNumberInRotateArray(new int[]{2,2,2,1,2}));
        System.out.println(minNumberInRotateArray(new int[]{1,3}));



    }
}
