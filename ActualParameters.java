public class ActualParameters {
    public static void update(int arr[]) {
        for(int i=0;i<5;i++) 
        arr[i] += 1;
    } 

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.print("Array before update : ");
        for(int i=0;i<5;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        update(arr);
        System.out.print("Array after update : ");
        for(int i=0;i<5;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}