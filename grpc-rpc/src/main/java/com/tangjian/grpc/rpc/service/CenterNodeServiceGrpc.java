package com.tangjian.grpc.rpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: CenterNodeRpcServer.proto")
public final class CenterNodeServiceGrpc {

  private CenterNodeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tangjian.grpc.rpc.CenterNodeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tangjian.grpc.rpc.model.RegisterRequest,
      com.tangjian.grpc.rpc.model.RegisterResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = com.tangjian.grpc.rpc.model.RegisterRequest.class,
      responseType = com.tangjian.grpc.rpc.model.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tangjian.grpc.rpc.model.RegisterRequest,
      com.tangjian.grpc.rpc.model.RegisterResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.tangjian.grpc.rpc.model.RegisterRequest, com.tangjian.grpc.rpc.model.RegisterResponse> getRegisterMethod;
    if ((getRegisterMethod = CenterNodeServiceGrpc.getRegisterMethod) == null) {
      synchronized (CenterNodeServiceGrpc.class) {
        if ((getRegisterMethod = CenterNodeServiceGrpc.getRegisterMethod) == null) {
          CenterNodeServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<com.tangjian.grpc.rpc.model.RegisterRequest, com.tangjian.grpc.rpc.model.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tangjian.grpc.rpc.model.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tangjian.grpc.rpc.model.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CenterNodeServiceMethodDescriptorSupplier("register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tangjian.grpc.rpc.model.HeartbeatRequest,
      com.tangjian.grpc.rpc.model.HeartbeatResponse> getHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "heartbeat",
      requestType = com.tangjian.grpc.rpc.model.HeartbeatRequest.class,
      responseType = com.tangjian.grpc.rpc.model.HeartbeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tangjian.grpc.rpc.model.HeartbeatRequest,
      com.tangjian.grpc.rpc.model.HeartbeatResponse> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<com.tangjian.grpc.rpc.model.HeartbeatRequest, com.tangjian.grpc.rpc.model.HeartbeatResponse> getHeartbeatMethod;
    if ((getHeartbeatMethod = CenterNodeServiceGrpc.getHeartbeatMethod) == null) {
      synchronized (CenterNodeServiceGrpc.class) {
        if ((getHeartbeatMethod = CenterNodeServiceGrpc.getHeartbeatMethod) == null) {
          CenterNodeServiceGrpc.getHeartbeatMethod = getHeartbeatMethod =
              io.grpc.MethodDescriptor.<com.tangjian.grpc.rpc.model.HeartbeatRequest, com.tangjian.grpc.rpc.model.HeartbeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tangjian.grpc.rpc.model.HeartbeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tangjian.grpc.rpc.model.HeartbeatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CenterNodeServiceMethodDescriptorSupplier("heartbeat"))
              .build();
        }
      }
    }
    return getHeartbeatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CenterNodeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CenterNodeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CenterNodeServiceStub>() {
        @Override
        public CenterNodeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CenterNodeServiceStub(channel, callOptions);
        }
      };
    return CenterNodeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CenterNodeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CenterNodeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CenterNodeServiceBlockingStub>() {
        @Override
        public CenterNodeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CenterNodeServiceBlockingStub(channel, callOptions);
        }
      };
    return CenterNodeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CenterNodeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CenterNodeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CenterNodeServiceFutureStub>() {
        @Override
        public CenterNodeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CenterNodeServiceFutureStub(channel, callOptions);
        }
      };
    return CenterNodeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CenterNodeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(com.tangjian.grpc.rpc.model.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.tangjian.grpc.rpc.model.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void heartbeat(com.tangjian.grpc.rpc.model.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.tangjian.grpc.rpc.model.HeartbeatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHeartbeatMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tangjian.grpc.rpc.model.RegisterRequest,
                com.tangjian.grpc.rpc.model.RegisterResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getHeartbeatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tangjian.grpc.rpc.model.HeartbeatRequest,
                com.tangjian.grpc.rpc.model.HeartbeatResponse>(
                  this, METHODID_HEARTBEAT)))
          .build();
    }
  }

  /**
   */
  public static final class CenterNodeServiceStub extends io.grpc.stub.AbstractAsyncStub<CenterNodeServiceStub> {
    private CenterNodeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CenterNodeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CenterNodeServiceStub(channel, callOptions);
    }

    /**
     */
    public void register(com.tangjian.grpc.rpc.model.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.tangjian.grpc.rpc.model.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void heartbeat(com.tangjian.grpc.rpc.model.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.tangjian.grpc.rpc.model.HeartbeatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CenterNodeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CenterNodeServiceBlockingStub> {
    private CenterNodeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CenterNodeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CenterNodeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tangjian.grpc.rpc.model.RegisterResponse register(com.tangjian.grpc.rpc.model.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tangjian.grpc.rpc.model.HeartbeatResponse heartbeat(com.tangjian.grpc.rpc.model.HeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHeartbeatMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CenterNodeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CenterNodeServiceFutureStub> {
    private CenterNodeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CenterNodeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CenterNodeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tangjian.grpc.rpc.model.RegisterResponse> register(
        com.tangjian.grpc.rpc.model.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tangjian.grpc.rpc.model.HeartbeatResponse> heartbeat(
        com.tangjian.grpc.rpc.model.HeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_HEARTBEAT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CenterNodeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CenterNodeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.tangjian.grpc.rpc.model.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.tangjian.grpc.rpc.model.RegisterResponse>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((com.tangjian.grpc.rpc.model.HeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<com.tangjian.grpc.rpc.model.HeartbeatResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CenterNodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CenterNodeServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CenterNodeServer.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CenterNodeService");
    }
  }

  private static final class CenterNodeServiceFileDescriptorSupplier
      extends CenterNodeServiceBaseDescriptorSupplier {
    CenterNodeServiceFileDescriptorSupplier() {}
  }

  private static final class CenterNodeServiceMethodDescriptorSupplier
      extends CenterNodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CenterNodeServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CenterNodeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CenterNodeServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getHeartbeatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
