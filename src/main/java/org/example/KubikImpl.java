package org.example;

import io.grpc.stub.StreamObserver;
import org.example.grpc.Kubik;
import org.example.grpc.KubikFunGrpc;

public class KubikImpl extends KubikFunGrpc.KubikFunImplBase {
    @Override
    public void frefre(Kubik.RubikRequest request, StreamObserver<Kubik.RubikResponce> responseObserver) {
        System.out.println(request);
        Kubik.RubikResponce responce = Kubik.RubikResponce
                .newBuilder()
                .setYellow("Установлен желтый")
                .build();
        responseObserver.onNext(responce);
        responseObserver.onCompleted();
    }
}
