package utils;

import java.util.Random;

public class RandomArray {
    int _size;
    int _min;
    int _max;

    int[] _data = new int[this._size];

    public RandomArray(int size, int min, int max) {
        this._size = size;
        this._min = min;
        this._max = max;
    }

    public int[] Generate(){
        Random random = new Random();
        _data = new int[this._size];
        for(int i=0; i<_data.length; i++){
            int rValue = random.nextInt(this._max - this._min + 1);
            _data[i] = rValue;
        }
        return this._data;
    }

    public void print(){
        System.out.print("[ ");
        for(int i=0; i< this._data.length-1; i++){
            System.out.print(_data[i] + ", ");
        }
        System.out.print(_data[this._data.length-1] + " ]");
        System.out.println("\n");

    }
}
