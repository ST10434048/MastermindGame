package algs;

public class Bubble {
    public static int[] sort(int[] _random_array){
        for(int j = 0;j <_random_array.length; j++ ){
            for(int i = 0;i <_random_array.length-1-j; i++ ){
                if(_random_array[i]> _random_array[i+1] ){
                    int temp = _random_array[i+1];
                    _random_array[i+1] = _random_array[i]
                    _random_array[i]=temp;
                }
            }
            return _random_array;
        }
    }
}
