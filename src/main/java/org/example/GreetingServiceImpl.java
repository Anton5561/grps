package org.example;

import io.grpc.stub.StreamObserver;
import org.example.grpc.GreetingServiceGrpc;
import org.example.grpc.GreetingServiceOuterClass;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greeting(GreetingServiceOuterClass.HelloRequest request,
                         StreamObserver<GreetingServiceOuterClass.HelloResponce> responseObserver) {

        System.out.println(request);
        GreetingServiceOuterClass.HelloResponce responce = GreetingServiceOuterClass.HelloResponce
                .newBuilder()
                .setGreeting("HELLO " + request.getName())
                .build();
        responseObserver.onNext(responce);
        responseObserver.onCompleted();
    }
}
