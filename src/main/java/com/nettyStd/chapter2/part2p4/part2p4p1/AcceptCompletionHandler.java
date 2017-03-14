package com.nettyStd.chapter2.part2p4.part2p4p1;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * Created by xiaoyx on 2017/3/14.
 */
/*代码清单2-13*/
public class AcceptCompletionHandler implements CompletionHandler{
    public void completed(AsynchronousSocketChannel result, AsyncTimeServerHandler attachment) {
        attachment.asynchronousServerSocketChannel.accept(attachment, (CompletionHandler<AsynchronousSocketChannel, ? super AsyncTimeServerHandler>) this);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        result.read(buffer, buffer, new ReadCompletionHandler(result));
    }

    public void failed(Throwable exc, AsyncTimeServerHandler attachment) {
        exc.printStackTrace();
        attachment.latch.countDown();
    }

    @Override
    public void completed(Object result, Object attachment) {

    }

    @Override
    public void failed(Throwable exc, Object attachment) {

    }
}
