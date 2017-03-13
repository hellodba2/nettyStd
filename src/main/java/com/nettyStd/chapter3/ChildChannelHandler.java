/*
package com.nettyStd.Chapter3;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

*/
/**
 * Created by Administrator on 2017/3/10.
 *//*

public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(new TimeServerHandler());
    }

    public static void main(String[] args) throws InterruptedException {
        int port = 8080;
        if(args != null && args.length >0) {
            port = Integer.valueOf(args[0]);
        }
        new TimeServer().bind(port);
    }
}
*/
