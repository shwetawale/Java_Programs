public class ArrayMirror {
 
    // Function that returns true if
    // the array is mirror-inverse
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
 
            // If condition fails for any element
            if (arr[arr[i]] != i)
                return false;
        }
 
    
        return true;
    }
 
    
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 0 };
        if (isMirrorInverse(arr))
            System.out.println("Yes,the given arrray is mirror inverse");
        else
            System.out.println("No,the given arrray is not a mirror inverse");
    }
}