package com.nettyStd.chapter2.part2p3.part2p3p5;

/**
 * Created by xiaoyx on 2017/3/13.
 */
/*代码清单2-9*/

public class TimeClient {
    public static void main(String[] args) {
        int port = 8080;
        if (args !=null && args.length > 0) {
           try {
               port = Integer.valueOf(args[0]);
           } catch (NumberFormatException e) {
               //采用默认值
           }
        }
        new Thread(new TimeClientHandle("127.0.0.1", port), "TimeClient-001").start();
    }
}
