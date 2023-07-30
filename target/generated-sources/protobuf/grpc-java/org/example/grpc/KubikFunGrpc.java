package org.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: Kubik.proto")
public final class KubikFunGrpc {

  private KubikFunGrpc() {}

  public static final String SERVICE_NAME = "org.example.grpc.KubikFun";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.grpc.Kubik.RubikRequest,
      org.example.grpc.Kubik.RubikResponce> getFrefreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "frefre",
      requestType = org.example.grpc.Kubik.RubikRequest.class,
      responseType = org.example.grpc.Kubik.RubikResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.Kubik.RubikRequest,
      org.example.grpc.Kubik.RubikResponce> getFrefreMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.Kubik.RubikRequest, org.example.grpc.Kubik.RubikResponce> getFrefreMethod;
    if ((getFrefreMethod = KubikFunGrpc.getFrefreMethod) == null) {
      synchronized (KubikFunGrpc.class) {
        if ((getFrefreMethod = KubikFunGrpc.getFrefreMethod) == null) {
          KubikFunGrpc.getFrefreMethod = getFrefreMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.Kubik.RubikRequest, org.example.grpc.Kubik.RubikResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "frefre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Kubik.RubikRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Kubik.RubikResponce.getDefaultInstance()))
              .setSchemaDescriptor(new KubikFunMethodDescriptorSupplier("frefre"))
              .build();
        }
      }
    }
    return getFrefreMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KubikFunStub newStub(io.grpc.Channel channel) {
    return new KubikFunStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KubikFunBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KubikFunBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KubikFunFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KubikFunFutureStub(channel);
  }

  /**
   */
  public static abstract class KubikFunImplBase implements io.grpc.BindableService {

    /**
     */
    public void frefre(org.example.grpc.Kubik.RubikRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.Kubik.RubikResponce> responseObserver) {
      asyncUnimplementedUnaryCall(getFrefreMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFrefreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.Kubik.RubikRequest,
                org.example.grpc.Kubik.RubikResponce>(
                  this, METHODID_FREFRE)))
          .build();
    }
  }

  /**
   */
  public static final class KubikFunStub extends io.grpc.stub.AbstractStub<KubikFunStub> {
    private KubikFunStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KubikFunStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KubikFunStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KubikFunStub(channel, callOptions);
    }

    /**
     */
    public void frefre(org.example.grpc.Kubik.RubikRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.Kubik.RubikResponce> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFrefreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KubikFunBlockingStub extends io.grpc.stub.AbstractStub<KubikFunBlockingStub> {
    private KubikFunBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KubikFunBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KubikFunBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KubikFunBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.grpc.Kubik.RubikResponce frefre(org.example.grpc.Kubik.RubikRequest request) {
      return blockingUnaryCall(
          getChannel(), getFrefreMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KubikFunFutureStub extends io.grpc.stub.AbstractStub<KubikFunFutureStub> {
    private KubikFunFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KubikFunFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KubikFunFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KubikFunFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.Kubik.RubikResponce> frefre(
        org.example.grpc.Kubik.RubikRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFrefreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FREFRE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KubikFunImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KubikFunImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FREFRE:
          serviceImpl.frefre((org.example.grpc.Kubik.RubikRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.Kubik.RubikResponce>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KubikFunBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KubikFunBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.grpc.Kubik.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KubikFun");
    }
  }

  private static final class KubikFunFileDescriptorSupplier
      extends KubikFunBaseDescriptorSupplier {
    KubikFunFileDescriptorSupplier() {}
  }

  private static final class KubikFunMethodDescriptorSupplier
      extends KubikFunBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KubikFunMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KubikFunGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KubikFunFileDescriptorSupplier())
              .addMethod(getFrefreMethod())
              .build();
        }
      }
    }
    return result;
  }
}
