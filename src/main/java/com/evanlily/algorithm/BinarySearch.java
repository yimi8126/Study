package com.evanlily.algorithm;

import java.util.Comparator;

/**
 * User: 一米
 * Date: 13-7-15
 * Time: 上午9:43
 * Description:
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a={1,4,6,7,9,12,15,18,38,59};
//        System.out.println(binaryS(9, a));
        System.out.println(recursionSearch(66,a,0,a.length));
    }

    /**
     * 普通二分查找
     * @param key
     * @param array
     * @return
     */
    public static int binaryS(int key,int[] array){
        int l=0;
        int u=array.length-1;
        while (true){
            if(l>u){
                return -1;
            }
            int middle=(l+u)/2;
            int middleValue=array[middle];
            if(middleValue>key){
                u=middle-1;
            }else if(middleValue<key){
                l=middle+1;
            }else{
                int lower=middle;
                for(int i=middle;i>0;i--){
                    if(array[i]==key){
                        lower=i;
                    }else{
                        break;
                    }
                }
                return lower;
            }
        }
    }

    /**
     * 递归二分查找
     * @param key
     * @param array
     * @param low
     * @param up
     * @return
     */
    public static int recursionSearch(int key,int[] array,int low,int up){
        if(low>up){
            return -1;
        }
        int middle=(low+up)/2;
        int middleValue=array[middle];
        if(key>middleValue){
            return recursionSearch(key,array,middle+1,up);
        }else if(key<middleValue){
            return recursionSearch(key,array,low,middle-1);
        }else {
            return middle;
        }
    }

    /**
     * 泛型二分
     * @param key
     * @param array
     * @param comparator
     * @param <T>
     * @return
     */
    public static<T>  int genericsSearch(T key,T[] array,Comparator<T> comparator){
       int l=0;
       int u=array.length-1;
        while (l<=u){
            int middle=(l+u)/2;
            if(comparator.compare(key,array[middle])>0){
                l=middle+1;
            }else if(comparator.compare(key,array[middle])<0){
                u=middle-1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
