package com.evanlily.algorithm;

/**
 * User: 一米
 * Date: 13-8-7
 * Time: 上午9:45
 * Description:
 */
public class Primes {
    public static void main(String[] args) {
        countPrimes3(10000000);
    }

    //    爱拉托逊斯筛选法（以下简称筛法），是一种高效的判断素数的方法。
// 能够一次性的筛选出某个区间的素数。其算法原理本质还是充分利用了素数的定义，
// 即素数的约数只有1和它本身。如果某个数m是另一个数n的倍数，则说明m肯定不是素数。
// 所以我们只要在某个范围内，将已知素数的所有倍数都筛去，剩下的肯定是素数。
// 因为只有它不是其他数的倍数（1和本身除外）。  具体做法是：先把N个自然数按次序排列起来。
// 1不是质数，也不是合数，要划去。第二个数2是质数留下来，而把2后面所有能被2整除的数都划去。
// 2后面第一 个没划去的数是3，把3留下，再把3后面所有能被3整除的数都划去。
// 3后面第一个没划去的数是5，把5留下，再把5后面所有能被5整除的数都划去。这样一 直做下去，
// 就会把不超过N的全部合数都筛掉，留下的就是不超过N的全部质数。因为希腊人是把数写在涂腊的板上，
// 每要划去一个数，就在上面记以小点，寻求质 数的工作完毕后，这许多小点就像一个筛子，
// 所以就把埃拉托斯特尼的方法叫做“埃拉托斯特尼筛”，简称“筛法”。
    public static void countPrimes(int num) {
        long begin = System.currentTimeMillis();
        boolean[] array = new boolean[num];
        for (int i = 0; i < num; i=i+2) {
            array[i]=false;
        }
        for (int i = 1; i < num; i=i+2) {
            array[i]=true;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (array[i]) {
                for (int j = i + i; j < num; j = j + i) {
                    array[j] = false;
                }
            }
        }
        int count = 0;
        for (boolean b : array) {
            if (b) {
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("total=" + count + "cost=" + (end - begin));
    }

    public static void countPrimes2(int num){
        int[] p=new int[num];
        boolean[] isPrime=new boolean[num+1];
        int np=0;
        for(int i=2;i<=num;i++){
            if(!isPrime[i])
                p[np++]=i;
            for(int j=0;j<np&&p[j]*i<=num;j++){
                isPrime[p[j]*i]=true;
                if(i%p[j]==0)break;
            }
        }
        System.out.println(p.length);
    }

    public static void countPrimes3(int size){
        long start = System.currentTimeMillis();
        boolean[] flags = new boolean[size + 1];
        int num = (int) Math.sqrt(size);

        int count = 1;
        for (int i = 3; i <= num; i = i + 2) {
            if (flags[i]) {
                continue;
            }
            for (int j = i * i; j < size + 1; j = j + 2 * i) {
                if (!flags[j]) {
                    count++;
                    flags[j] = true;
                }
            }
        }
        count = count + size/2-1;
        System.out.println("time:"+(System.currentTimeMillis()-start)+"ms");
        System.out.println("count:"+(size-count));

    }
}
