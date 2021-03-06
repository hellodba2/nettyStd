package com.nettyStd.chapter2.part2p4.part2p4p1;

/**
 * Created by xiaoyx on 2017/3/14.
 */
/*代码清单2-15*/
public class TimeClient {
    public static void main(String[] args) {
        int port = 8080;
        if (args != null && args.length >0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                //采用默认值
            }
        }
        new Thread(new AsyncTimeClientHandler("127.0.0.1", port),"AIO-AsyncTimeClientHandler-001").start();
    }
}
