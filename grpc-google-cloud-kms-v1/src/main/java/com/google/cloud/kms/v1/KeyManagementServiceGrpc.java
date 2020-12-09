/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.kms.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/kms/v1/service.proto")
public final class KeyManagementServiceGrpc {

  private KeyManagementServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.kms.v1.KeyManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.ListKeyRingsRequest, com.google.cloud.kms.v1.ListKeyRingsResponse>
      getListKeyRingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListKeyRings",
      requestType = com.google.cloud.kms.v1.ListKeyRingsRequest.class,
      responseType = com.google.cloud.kms.v1.ListKeyRingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.ListKeyRingsRequest, com.google.cloud.kms.v1.ListKeyRingsResponse>
      getListKeyRingsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.ListKeyRingsRequest,
            com.google.cloud.kms.v1.ListKeyRingsResponse>
        getListKeyRingsMethod;
    if ((getListKeyRingsMethod = KeyManagementServiceGrpc.getListKeyRingsMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getListKeyRingsMethod = KeyManagementServiceGrpc.getListKeyRingsMethod) == null) {
          KeyManagementServiceGrpc.getListKeyRingsMethod =
              getListKeyRingsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.ListKeyRingsRequest,
                          com.google.cloud.kms.v1.ListKeyRingsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListKeyRings"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.ListKeyRingsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.ListKeyRingsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("ListKeyRings"))
                      .build();
        }
      }
    }
    return getListKeyRingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.ListCryptoKeysRequest,
          com.google.cloud.kms.v1.ListCryptoKeysResponse>
      getListCryptoKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCryptoKeys",
      requestType = com.google.cloud.kms.v1.ListCryptoKeysRequest.class,
      responseType = com.google.cloud.kms.v1.ListCryptoKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.ListCryptoKeysRequest,
          com.google.cloud.kms.v1.ListCryptoKeysResponse>
      getListCryptoKeysMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.ListCryptoKeysRequest,
            com.google.cloud.kms.v1.ListCryptoKeysResponse>
        getListCryptoKeysMethod;
    if ((getListCryptoKeysMethod = KeyManagementServiceGrpc.getListCryptoKeysMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getListCryptoKeysMethod = KeyManagementServiceGrpc.getListCryptoKeysMethod) == null) {
          KeyManagementServiceGrpc.getListCryptoKeysMethod =
              getListCryptoKeysMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.ListCryptoKeysRequest,
                          com.google.cloud.kms.v1.ListCryptoKeysResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCryptoKeys"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.ListCryptoKeysRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.ListCryptoKeysResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("ListCryptoKeys"))
                      .build();
        }
      }
    }
    return getListCryptoKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest,
          com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse>
      getListCryptoKeyVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCryptoKeyVersions",
      requestType = com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest.class,
      responseType = com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest,
          com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse>
      getListCryptoKeyVersionsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest,
            com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse>
        getListCryptoKeyVersionsMethod;
    if ((getListCryptoKeyVersionsMethod = KeyManagementServiceGrpc.getListCryptoKeyVersionsMethod)
        == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getListCryptoKeyVersionsMethod =
                KeyManagementServiceGrpc.getListCryptoKeyVersionsMethod)
            == null) {
          KeyManagementServiceGrpc.getListCryptoKeyVersionsMethod =
              getListCryptoKeyVersionsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest,
                          com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListCryptoKeyVersions"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("ListCryptoKeyVersions"))
                      .build();
        }
      }
    }
    return getListCryptoKeyVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.ListImportJobsRequest,
          com.google.cloud.kms.v1.ListImportJobsResponse>
      getListImportJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListImportJobs",
      requestType = com.google.cloud.kms.v1.ListImportJobsRequest.class,
      responseType = com.google.cloud.kms.v1.ListImportJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.ListImportJobsRequest,
          com.google.cloud.kms.v1.ListImportJobsResponse>
      getListImportJobsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.ListImportJobsRequest,
            com.google.cloud.kms.v1.ListImportJobsResponse>
        getListImportJobsMethod;
    if ((getListImportJobsMethod = KeyManagementServiceGrpc.getListImportJobsMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getListImportJobsMethod = KeyManagementServiceGrpc.getListImportJobsMethod) == null) {
          KeyManagementServiceGrpc.getListImportJobsMethod =
              getListImportJobsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.ListImportJobsRequest,
                          com.google.cloud.kms.v1.ListImportJobsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListImportJobs"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.ListImportJobsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.ListImportJobsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("ListImportJobs"))
                      .build();
        }
      }
    }
    return getListImportJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.GetKeyRingRequest, com.google.cloud.kms.v1.KeyRing>
      getGetKeyRingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKeyRing",
      requestType = com.google.cloud.kms.v1.GetKeyRingRequest.class,
      responseType = com.google.cloud.kms.v1.KeyRing.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.GetKeyRingRequest, com.google.cloud.kms.v1.KeyRing>
      getGetKeyRingMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.GetKeyRingRequest, com.google.cloud.kms.v1.KeyRing>
        getGetKeyRingMethod;
    if ((getGetKeyRingMethod = KeyManagementServiceGrpc.getGetKeyRingMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getGetKeyRingMethod = KeyManagementServiceGrpc.getGetKeyRingMethod) == null) {
          KeyManagementServiceGrpc.getGetKeyRingMethod =
              getGetKeyRingMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.GetKeyRingRequest, com.google.cloud.kms.v1.KeyRing>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKeyRing"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.GetKeyRingRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.KeyRing.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("GetKeyRing"))
                      .build();
        }
      }
    }
    return getGetKeyRingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.GetCryptoKeyRequest, com.google.cloud.kms.v1.CryptoKey>
      getGetCryptoKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCryptoKey",
      requestType = com.google.cloud.kms.v1.GetCryptoKeyRequest.class,
      responseType = com.google.cloud.kms.v1.CryptoKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.GetCryptoKeyRequest, com.google.cloud.kms.v1.CryptoKey>
      getGetCryptoKeyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.GetCryptoKeyRequest, com.google.cloud.kms.v1.CryptoKey>
        getGetCryptoKeyMethod;
    if ((getGetCryptoKeyMethod = KeyManagementServiceGrpc.getGetCryptoKeyMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getGetCryptoKeyMethod = KeyManagementServiceGrpc.getGetCryptoKeyMethod) == null) {
          KeyManagementServiceGrpc.getGetCryptoKeyMethod =
              getGetCryptoKeyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.GetCryptoKeyRequest,
                          com.google.cloud.kms.v1.CryptoKey>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCryptoKey"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.GetCryptoKeyRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CryptoKey.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("GetCryptoKey"))
                      .build();
        }
      }
    }
    return getGetCryptoKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.GetCryptoKeyVersionRequest,
          com.google.cloud.kms.v1.CryptoKeyVersion>
      getGetCryptoKeyVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCryptoKeyVersion",
      requestType = com.google.cloud.kms.v1.GetCryptoKeyVersionRequest.class,
      responseType = com.google.cloud.kms.v1.CryptoKeyVersion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.GetCryptoKeyVersionRequest,
          com.google.cloud.kms.v1.CryptoKeyVersion>
      getGetCryptoKeyVersionMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.GetCryptoKeyVersionRequest,
            com.google.cloud.kms.v1.CryptoKeyVersion>
        getGetCryptoKeyVersionMethod;
    if ((getGetCryptoKeyVersionMethod = KeyManagementServiceGrpc.getGetCryptoKeyVersionMethod)
        == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getGetCryptoKeyVersionMethod = KeyManagementServiceGrpc.getGetCryptoKeyVersionMethod)
            == null) {
          KeyManagementServiceGrpc.getGetCryptoKeyVersionMethod =
              getGetCryptoKeyVersionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.GetCryptoKeyVersionRequest,
                          com.google.cloud.kms.v1.CryptoKeyVersion>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetCryptoKeyVersion"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.GetCryptoKeyVersionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CryptoKeyVersion.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("GetCryptoKeyVersion"))
                      .build();
        }
      }
    }
    return getGetCryptoKeyVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.GetPublicKeyRequest, com.google.cloud.kms.v1.PublicKey>
      getGetPublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublicKey",
      requestType = com.google.cloud.kms.v1.GetPublicKeyRequest.class,
      responseType = com.google.cloud.kms.v1.PublicKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.GetPublicKeyRequest, com.google.cloud.kms.v1.PublicKey>
      getGetPublicKeyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.GetPublicKeyRequest, com.google.cloud.kms.v1.PublicKey>
        getGetPublicKeyMethod;
    if ((getGetPublicKeyMethod = KeyManagementServiceGrpc.getGetPublicKeyMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getGetPublicKeyMethod = KeyManagementServiceGrpc.getGetPublicKeyMethod) == null) {
          KeyManagementServiceGrpc.getGetPublicKeyMethod =
              getGetPublicKeyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.GetPublicKeyRequest,
                          com.google.cloud.kms.v1.PublicKey>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPublicKey"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.GetPublicKeyRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.PublicKey.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("GetPublicKey"))
                      .build();
        }
      }
    }
    return getGetPublicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.GetImportJobRequest, com.google.cloud.kms.v1.ImportJob>
      getGetImportJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImportJob",
      requestType = com.google.cloud.kms.v1.GetImportJobRequest.class,
      responseType = com.google.cloud.kms.v1.ImportJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.GetImportJobRequest, com.google.cloud.kms.v1.ImportJob>
      getGetImportJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.GetImportJobRequest, com.google.cloud.kms.v1.ImportJob>
        getGetImportJobMethod;
    if ((getGetImportJobMethod = KeyManagementServiceGrpc.getGetImportJobMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getGetImportJobMethod = KeyManagementServiceGrpc.getGetImportJobMethod) == null) {
          KeyManagementServiceGrpc.getGetImportJobMethod =
              getGetImportJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.GetImportJobRequest,
                          com.google.cloud.kms.v1.ImportJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetImportJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.GetImportJobRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.ImportJob.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("GetImportJob"))
                      .build();
        }
      }
    }
    return getGetImportJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.CreateKeyRingRequest, com.google.cloud.kms.v1.KeyRing>
      getCreateKeyRingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateKeyRing",
      requestType = com.google.cloud.kms.v1.CreateKeyRingRequest.class,
      responseType = com.google.cloud.kms.v1.KeyRing.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.CreateKeyRingRequest, com.google.cloud.kms.v1.KeyRing>
      getCreateKeyRingMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.CreateKeyRingRequest, com.google.cloud.kms.v1.KeyRing>
        getCreateKeyRingMethod;
    if ((getCreateKeyRingMethod = KeyManagementServiceGrpc.getCreateKeyRingMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getCreateKeyRingMethod = KeyManagementServiceGrpc.getCreateKeyRingMethod) == null) {
          KeyManagementServiceGrpc.getCreateKeyRingMethod =
              getCreateKeyRingMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.CreateKeyRingRequest,
                          com.google.cloud.kms.v1.KeyRing>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateKeyRing"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CreateKeyRingRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.KeyRing.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("CreateKeyRing"))
                      .build();
        }
      }
    }
    return getCreateKeyRingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.CreateCryptoKeyRequest, com.google.cloud.kms.v1.CryptoKey>
      getCreateCryptoKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCryptoKey",
      requestType = com.google.cloud.kms.v1.CreateCryptoKeyRequest.class,
      responseType = com.google.cloud.kms.v1.CryptoKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.CreateCryptoKeyRequest, com.google.cloud.kms.v1.CryptoKey>
      getCreateCryptoKeyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.CreateCryptoKeyRequest, com.google.cloud.kms.v1.CryptoKey>
        getCreateCryptoKeyMethod;
    if ((getCreateCryptoKeyMethod = KeyManagementServiceGrpc.getCreateCryptoKeyMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getCreateCryptoKeyMethod = KeyManagementServiceGrpc.getCreateCryptoKeyMethod)
            == null) {
          KeyManagementServiceGrpc.getCreateCryptoKeyMethod =
              getCreateCryptoKeyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.CreateCryptoKeyRequest,
                          com.google.cloud.kms.v1.CryptoKey>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCryptoKey"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CreateCryptoKeyRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CryptoKey.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("CreateCryptoKey"))
                      .build();
        }
      }
    }
    return getCreateCryptoKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest,
          com.google.cloud.kms.v1.CryptoKeyVersion>
      getCreateCryptoKeyVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCryptoKeyVersion",
      requestType = com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest.class,
      responseType = com.google.cloud.kms.v1.CryptoKeyVersion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest,
          com.google.cloud.kms.v1.CryptoKeyVersion>
      getCreateCryptoKeyVersionMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest,
            com.google.cloud.kms.v1.CryptoKeyVersion>
        getCreateCryptoKeyVersionMethod;
    if ((getCreateCryptoKeyVersionMethod = KeyManagementServiceGrpc.getCreateCryptoKeyVersionMethod)
        == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getCreateCryptoKeyVersionMethod =
                KeyManagementServiceGrpc.getCreateCryptoKeyVersionMethod)
            == null) {
          KeyManagementServiceGrpc.getCreateCryptoKeyVersionMethod =
              getCreateCryptoKeyVersionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest,
                          com.google.cloud.kms.v1.CryptoKeyVersion>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CreateCryptoKeyVersion"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CryptoKeyVersion.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier(
                              "CreateCryptoKeyVersion"))
                      .build();
        }
      }
    }
    return getCreateCryptoKeyVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest,
          com.google.cloud.kms.v1.CryptoKeyVersion>
      getImportCryptoKeyVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportCryptoKeyVersion",
      requestType = com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest.class,
      responseType = com.google.cloud.kms.v1.CryptoKeyVersion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest,
          com.google.cloud.kms.v1.CryptoKeyVersion>
      getImportCryptoKeyVersionMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest,
            com.google.cloud.kms.v1.CryptoKeyVersion>
        getImportCryptoKeyVersionMethod;
    if ((getImportCryptoKeyVersionMethod = KeyManagementServiceGrpc.getImportCryptoKeyVersionMethod)
        == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getImportCryptoKeyVersionMethod =
                KeyManagementServiceGrpc.getImportCryptoKeyVersionMethod)
            == null) {
          KeyManagementServiceGrpc.getImportCryptoKeyVersionMethod =
              getImportCryptoKeyVersionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest,
                          com.google.cloud.kms.v1.CryptoKeyVersion>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ImportCryptoKeyVersion"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CryptoKeyVersion.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier(
                              "ImportCryptoKeyVersion"))
                      .build();
        }
      }
    }
    return getImportCryptoKeyVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.CreateImportJobRequest, com.google.cloud.kms.v1.ImportJob>
      getCreateImportJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateImportJob",
      requestType = com.google.cloud.kms.v1.CreateImportJobRequest.class,
      responseType = com.google.cloud.kms.v1.ImportJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.CreateImportJobRequest, com.google.cloud.kms.v1.ImportJob>
      getCreateImportJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.CreateImportJobRequest, com.google.cloud.kms.v1.ImportJob>
        getCreateImportJobMethod;
    if ((getCreateImportJobMethod = KeyManagementServiceGrpc.getCreateImportJobMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getCreateImportJobMethod = KeyManagementServiceGrpc.getCreateImportJobMethod)
            == null) {
          KeyManagementServiceGrpc.getCreateImportJobMethod =
              getCreateImportJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.CreateImportJobRequest,
                          com.google.cloud.kms.v1.ImportJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateImportJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CreateImportJobRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.ImportJob.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("CreateImportJob"))
                      .build();
        }
      }
    }
    return getCreateImportJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.UpdateCryptoKeyRequest, com.google.cloud.kms.v1.CryptoKey>
      getUpdateCryptoKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCryptoKey",
      requestType = com.google.cloud.kms.v1.UpdateCryptoKeyRequest.class,
      responseType = com.google.cloud.kms.v1.CryptoKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.UpdateCryptoKeyRequest, com.google.cloud.kms.v1.CryptoKey>
      getUpdateCryptoKeyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.UpdateCryptoKeyRequest, com.google.cloud.kms.v1.CryptoKey>
        getUpdateCryptoKeyMethod;
    if ((getUpdateCryptoKeyMethod = KeyManagementServiceGrpc.getUpdateCryptoKeyMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getUpdateCryptoKeyMethod = KeyManagementServiceGrpc.getUpdateCryptoKeyMethod)
            == null) {
          KeyManagementServiceGrpc.getUpdateCryptoKeyMethod =
              getUpdateCryptoKeyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.UpdateCryptoKeyRequest,
                          com.google.cloud.kms.v1.CryptoKey>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCryptoKey"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.UpdateCryptoKeyRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CryptoKey.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("UpdateCryptoKey"))
                      .build();
        }
      }
    }
    return getUpdateCryptoKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest,
          com.google.cloud.kms.v1.CryptoKeyVersion>
      getUpdateCryptoKeyVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCryptoKeyVersion",
      requestType = com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest.class,
      responseType = com.google.cloud.kms.v1.CryptoKeyVersion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest,
          com.google.cloud.kms.v1.CryptoKeyVersion>
      getUpdateCryptoKeyVersionMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest,
            com.google.cloud.kms.v1.CryptoKeyVersion>
        getUpdateCryptoKeyVersionMethod;
    if ((getUpdateCryptoKeyVersionMethod = KeyManagementServiceGrpc.getUpdateCryptoKeyVersionMethod)
        == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getUpdateCryptoKeyVersionMethod =
                KeyManagementServiceGrpc.getUpdateCryptoKeyVersionMethod)
            == null) {
          KeyManagementServiceGrpc.getUpdateCryptoKeyVersionMethod =
              getUpdateCryptoKeyVersionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest,
                          com.google.cloud.kms.v1.CryptoKeyVersion>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpdateCryptoKeyVersion"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CryptoKeyVersion.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier(
                              "UpdateCryptoKeyVersion"))
                      .build();
        }
      }
    }
    return getUpdateCryptoKeyVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.EncryptRequest, com.google.cloud.kms.v1.EncryptResponse>
      getEncryptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Encrypt",
      requestType = com.google.cloud.kms.v1.EncryptRequest.class,
      responseType = com.google.cloud.kms.v1.EncryptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.EncryptRequest, com.google.cloud.kms.v1.EncryptResponse>
      getEncryptMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.EncryptRequest, com.google.cloud.kms.v1.EncryptResponse>
        getEncryptMethod;
    if ((getEncryptMethod = KeyManagementServiceGrpc.getEncryptMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getEncryptMethod = KeyManagementServiceGrpc.getEncryptMethod) == null) {
          KeyManagementServiceGrpc.getEncryptMethod =
              getEncryptMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.EncryptRequest,
                          com.google.cloud.kms.v1.EncryptResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Encrypt"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.EncryptRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.EncryptResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("Encrypt"))
                      .build();
        }
      }
    }
    return getEncryptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.DecryptRequest, com.google.cloud.kms.v1.DecryptResponse>
      getDecryptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decrypt",
      requestType = com.google.cloud.kms.v1.DecryptRequest.class,
      responseType = com.google.cloud.kms.v1.DecryptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.DecryptRequest, com.google.cloud.kms.v1.DecryptResponse>
      getDecryptMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.DecryptRequest, com.google.cloud.kms.v1.DecryptResponse>
        getDecryptMethod;
    if ((getDecryptMethod = KeyManagementServiceGrpc.getDecryptMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getDecryptMethod = KeyManagementServiceGrpc.getDecryptMethod) == null) {
          KeyManagementServiceGrpc.getDecryptMethod =
              getDecryptMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.DecryptRequest,
                          com.google.cloud.kms.v1.DecryptResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Decrypt"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.DecryptRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.DecryptResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("Decrypt"))
                      .build();
        }
      }
    }
    return getDecryptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.AsymmetricSignRequest,
          com.google.cloud.kms.v1.AsymmetricSignResponse>
      getAsymmetricSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AsymmetricSign",
      requestType = com.google.cloud.kms.v1.AsymmetricSignRequest.class,
      responseType = com.google.cloud.kms.v1.AsymmetricSignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.AsymmetricSignRequest,
          com.google.cloud.kms.v1.AsymmetricSignResponse>
      getAsymmetricSignMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.AsymmetricSignRequest,
            com.google.cloud.kms.v1.AsymmetricSignResponse>
        getAsymmetricSignMethod;
    if ((getAsymmetricSignMethod = KeyManagementServiceGrpc.getAsymmetricSignMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getAsymmetricSignMethod = KeyManagementServiceGrpc.getAsymmetricSignMethod) == null) {
          KeyManagementServiceGrpc.getAsymmetricSignMethod =
              getAsymmetricSignMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.AsymmetricSignRequest,
                          com.google.cloud.kms.v1.AsymmetricSignResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AsymmetricSign"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.AsymmetricSignRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.AsymmetricSignResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("AsymmetricSign"))
                      .build();
        }
      }
    }
    return getAsymmetricSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.AsymmetricDecryptRequest,
          com.google.cloud.kms.v1.AsymmetricDecryptResponse>
      getAsymmetricDecryptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AsymmetricDecrypt",
      requestType = com.google.cloud.kms.v1.AsymmetricDecryptRequest.class,
      responseType = com.google.cloud.kms.v1.AsymmetricDecryptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.AsymmetricDecryptRequest,
          com.google.cloud.kms.v1.AsymmetricDecryptResponse>
      getAsymmetricDecryptMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.AsymmetricDecryptRequest,
            com.google.cloud.kms.v1.AsymmetricDecryptResponse>
        getAsymmetricDecryptMethod;
    if ((getAsymmetricDecryptMethod = KeyManagementServiceGrpc.getAsymmetricDecryptMethod)
        == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getAsymmetricDecryptMethod = KeyManagementServiceGrpc.getAsymmetricDecryptMethod)
            == null) {
          KeyManagementServiceGrpc.getAsymmetricDecryptMethod =
              getAsymmetricDecryptMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.AsymmetricDecryptRequest,
                          com.google.cloud.kms.v1.AsymmetricDecryptResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AsymmetricDecrypt"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.AsymmetricDecryptRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.AsymmetricDecryptResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier("AsymmetricDecrypt"))
                      .build();
        }
      }
    }
    return getAsymmetricDecryptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest,
          com.google.cloud.kms.v1.CryptoKey>
      getUpdateCryptoKeyPrimaryVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCryptoKeyPrimaryVersion",
      requestType = com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest.class,
      responseType = com.google.cloud.kms.v1.CryptoKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest,
          com.google.cloud.kms.v1.CryptoKey>
      getUpdateCryptoKeyPrimaryVersionMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest,
            com.google.cloud.kms.v1.CryptoKey>
        getUpdateCryptoKeyPrimaryVersionMethod;
    if ((getUpdateCryptoKeyPrimaryVersionMethod =
            KeyManagementServiceGrpc.getUpdateCryptoKeyPrimaryVersionMethod)
        == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getUpdateCryptoKeyPrimaryVersionMethod =
                KeyManagementServiceGrpc.getUpdateCryptoKeyPrimaryVersionMethod)
            == null) {
          KeyManagementServiceGrpc.getUpdateCryptoKeyPrimaryVersionMethod =
              getUpdateCryptoKeyPrimaryVersionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest,
                          com.google.cloud.kms.v1.CryptoKey>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpdateCryptoKeyPrimaryVersion"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CryptoKey.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier(
                              "UpdateCryptoKeyPrimaryVersion"))
                      .build();
        }
      }
    }
    return getUpdateCryptoKeyPrimaryVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest,
          com.google.cloud.kms.v1.CryptoKeyVersion>
      getDestroyCryptoKeyVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyCryptoKeyVersion",
      requestType = com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest.class,
      responseType = com.google.cloud.kms.v1.CryptoKeyVersion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest,
          com.google.cloud.kms.v1.CryptoKeyVersion>
      getDestroyCryptoKeyVersionMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest,
            com.google.cloud.kms.v1.CryptoKeyVersion>
        getDestroyCryptoKeyVersionMethod;
    if ((getDestroyCryptoKeyVersionMethod =
            KeyManagementServiceGrpc.getDestroyCryptoKeyVersionMethod)
        == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getDestroyCryptoKeyVersionMethod =
                KeyManagementServiceGrpc.getDestroyCryptoKeyVersionMethod)
            == null) {
          KeyManagementServiceGrpc.getDestroyCryptoKeyVersionMethod =
              getDestroyCryptoKeyVersionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest,
                          com.google.cloud.kms.v1.CryptoKeyVersion>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "DestroyCryptoKeyVersion"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CryptoKeyVersion.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier(
                              "DestroyCryptoKeyVersion"))
                      .build();
        }
      }
    }
    return getDestroyCryptoKeyVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest,
          com.google.cloud.kms.v1.CryptoKeyVersion>
      getRestoreCryptoKeyVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestoreCryptoKeyVersion",
      requestType = com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest.class,
      responseType = com.google.cloud.kms.v1.CryptoKeyVersion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest,
          com.google.cloud.kms.v1.CryptoKeyVersion>
      getRestoreCryptoKeyVersionMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest,
            com.google.cloud.kms.v1.CryptoKeyVersion>
        getRestoreCryptoKeyVersionMethod;
    if ((getRestoreCryptoKeyVersionMethod =
            KeyManagementServiceGrpc.getRestoreCryptoKeyVersionMethod)
        == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getRestoreCryptoKeyVersionMethod =
                KeyManagementServiceGrpc.getRestoreCryptoKeyVersionMethod)
            == null) {
          KeyManagementServiceGrpc.getRestoreCryptoKeyVersionMethod =
              getRestoreCryptoKeyVersionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest,
                          com.google.cloud.kms.v1.CryptoKeyVersion>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "RestoreCryptoKeyVersion"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.kms.v1.CryptoKeyVersion.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new KeyManagementServiceMethodDescriptorSupplier(
                              "RestoreCryptoKeyVersion"))
                      .build();
        }
      }
    }
    return getRestoreCryptoKeyVersionMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static KeyManagementServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagementServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<KeyManagementServiceStub>() {
          @java.lang.Override
          public KeyManagementServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new KeyManagementServiceStub(channel, callOptions);
          }
        };
    return KeyManagementServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagementServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagementServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<KeyManagementServiceBlockingStub>() {
          @java.lang.Override
          public KeyManagementServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new KeyManagementServiceBlockingStub(channel, callOptions);
          }
        };
    return KeyManagementServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static KeyManagementServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagementServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<KeyManagementServiceFutureStub>() {
          @java.lang.Override
          public KeyManagementServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new KeyManagementServiceFutureStub(channel, callOptions);
          }
        };
    return KeyManagementServiceFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class KeyManagementServiceImplBase implements io.grpc.BindableService {

    /** */
    public void listKeyRings(
        com.google.cloud.kms.v1.ListKeyRingsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ListKeyRingsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListKeyRingsMethod(), responseObserver);
    }

    /** */
    public void listCryptoKeys(
        com.google.cloud.kms.v1.ListCryptoKeysRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ListCryptoKeysResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListCryptoKeysMethod(), responseObserver);
    }

    /** */
    public void listCryptoKeyVersions(
        com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListCryptoKeyVersionsMethod(), responseObserver);
    }

    /** */
    public void listImportJobs(
        com.google.cloud.kms.v1.ListImportJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ListImportJobsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListImportJobsMethod(), responseObserver);
    }

    /** */
    public void getKeyRing(
        com.google.cloud.kms.v1.GetKeyRingRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.KeyRing> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKeyRingMethod(), responseObserver);
    }

    /** */
    public void getCryptoKey(
        com.google.cloud.kms.v1.GetCryptoKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKey> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCryptoKeyMethod(), responseObserver);
    }

    /** */
    public void getCryptoKeyVersion(
        com.google.cloud.kms.v1.GetCryptoKeyVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCryptoKeyVersionMethod(), responseObserver);
    }

    /** */
    public void getPublicKey(
        com.google.cloud.kms.v1.GetPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.PublicKey> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPublicKeyMethod(), responseObserver);
    }

    /** */
    public void getImportJob(
        com.google.cloud.kms.v1.GetImportJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ImportJob> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImportJobMethod(), responseObserver);
    }

    /** */
    public void createKeyRing(
        com.google.cloud.kms.v1.CreateKeyRingRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.KeyRing> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateKeyRingMethod(), responseObserver);
    }

    /** */
    public void createCryptoKey(
        com.google.cloud.kms.v1.CreateCryptoKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKey> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCryptoKeyMethod(), responseObserver);
    }

    /** */
    public void createCryptoKeyVersion(
        com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCryptoKeyVersionMethod(), responseObserver);
    }

    /** */
    public void importCryptoKeyVersion(
        com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion> responseObserver) {
      asyncUnimplementedUnaryCall(getImportCryptoKeyVersionMethod(), responseObserver);
    }

    /** */
    public void createImportJob(
        com.google.cloud.kms.v1.CreateImportJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ImportJob> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateImportJobMethod(), responseObserver);
    }

    /** */
    public void updateCryptoKey(
        com.google.cloud.kms.v1.UpdateCryptoKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKey> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCryptoKeyMethod(), responseObserver);
    }

    /** */
    public void updateCryptoKeyVersion(
        com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCryptoKeyVersionMethod(), responseObserver);
    }

    /** */
    public void encrypt(
        com.google.cloud.kms.v1.EncryptRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.EncryptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEncryptMethod(), responseObserver);
    }

    /** */
    public void decrypt(
        com.google.cloud.kms.v1.DecryptRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.DecryptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDecryptMethod(), responseObserver);
    }

    /** */
    public void asymmetricSign(
        com.google.cloud.kms.v1.AsymmetricSignRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.AsymmetricSignResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getAsymmetricSignMethod(), responseObserver);
    }

    /** */
    public void asymmetricDecrypt(
        com.google.cloud.kms.v1.AsymmetricDecryptRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.AsymmetricDecryptResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getAsymmetricDecryptMethod(), responseObserver);
    }

    /** */
    public void updateCryptoKeyPrimaryVersion(
        com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKey> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCryptoKeyPrimaryVersionMethod(), responseObserver);
    }

    /** */
    public void destroyCryptoKeyVersion(
        com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion> responseObserver) {
      asyncUnimplementedUnaryCall(getDestroyCryptoKeyVersionMethod(), responseObserver);
    }

    /** */
    public void restoreCryptoKeyVersion(
        com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion> responseObserver) {
      asyncUnimplementedUnaryCall(getRestoreCryptoKeyVersionMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListKeyRingsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.ListKeyRingsRequest,
                      com.google.cloud.kms.v1.ListKeyRingsResponse>(this, METHODID_LIST_KEY_RINGS)))
          .addMethod(
              getListCryptoKeysMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.ListCryptoKeysRequest,
                      com.google.cloud.kms.v1.ListCryptoKeysResponse>(
                      this, METHODID_LIST_CRYPTO_KEYS)))
          .addMethod(
              getListCryptoKeyVersionsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest,
                      com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse>(
                      this, METHODID_LIST_CRYPTO_KEY_VERSIONS)))
          .addMethod(
              getListImportJobsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.ListImportJobsRequest,
                      com.google.cloud.kms.v1.ListImportJobsResponse>(
                      this, METHODID_LIST_IMPORT_JOBS)))
          .addMethod(
              getGetKeyRingMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.GetKeyRingRequest, com.google.cloud.kms.v1.KeyRing>(
                      this, METHODID_GET_KEY_RING)))
          .addMethod(
              getGetCryptoKeyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.GetCryptoKeyRequest,
                      com.google.cloud.kms.v1.CryptoKey>(this, METHODID_GET_CRYPTO_KEY)))
          .addMethod(
              getGetCryptoKeyVersionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.GetCryptoKeyVersionRequest,
                      com.google.cloud.kms.v1.CryptoKeyVersion>(
                      this, METHODID_GET_CRYPTO_KEY_VERSION)))
          .addMethod(
              getGetPublicKeyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.GetPublicKeyRequest,
                      com.google.cloud.kms.v1.PublicKey>(this, METHODID_GET_PUBLIC_KEY)))
          .addMethod(
              getGetImportJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.GetImportJobRequest,
                      com.google.cloud.kms.v1.ImportJob>(this, METHODID_GET_IMPORT_JOB)))
          .addMethod(
              getCreateKeyRingMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.CreateKeyRingRequest,
                      com.google.cloud.kms.v1.KeyRing>(this, METHODID_CREATE_KEY_RING)))
          .addMethod(
              getCreateCryptoKeyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.CreateCryptoKeyRequest,
                      com.google.cloud.kms.v1.CryptoKey>(this, METHODID_CREATE_CRYPTO_KEY)))
          .addMethod(
              getCreateCryptoKeyVersionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest,
                      com.google.cloud.kms.v1.CryptoKeyVersion>(
                      this, METHODID_CREATE_CRYPTO_KEY_VERSION)))
          .addMethod(
              getImportCryptoKeyVersionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest,
                      com.google.cloud.kms.v1.CryptoKeyVersion>(
                      this, METHODID_IMPORT_CRYPTO_KEY_VERSION)))
          .addMethod(
              getCreateImportJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.CreateImportJobRequest,
                      com.google.cloud.kms.v1.ImportJob>(this, METHODID_CREATE_IMPORT_JOB)))
          .addMethod(
              getUpdateCryptoKeyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.UpdateCryptoKeyRequest,
                      com.google.cloud.kms.v1.CryptoKey>(this, METHODID_UPDATE_CRYPTO_KEY)))
          .addMethod(
              getUpdateCryptoKeyVersionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest,
                      com.google.cloud.kms.v1.CryptoKeyVersion>(
                      this, METHODID_UPDATE_CRYPTO_KEY_VERSION)))
          .addMethod(
              getEncryptMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.EncryptRequest,
                      com.google.cloud.kms.v1.EncryptResponse>(this, METHODID_ENCRYPT)))
          .addMethod(
              getDecryptMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.DecryptRequest,
                      com.google.cloud.kms.v1.DecryptResponse>(this, METHODID_DECRYPT)))
          .addMethod(
              getAsymmetricSignMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.AsymmetricSignRequest,
                      com.google.cloud.kms.v1.AsymmetricSignResponse>(
                      this, METHODID_ASYMMETRIC_SIGN)))
          .addMethod(
              getAsymmetricDecryptMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.AsymmetricDecryptRequest,
                      com.google.cloud.kms.v1.AsymmetricDecryptResponse>(
                      this, METHODID_ASYMMETRIC_DECRYPT)))
          .addMethod(
              getUpdateCryptoKeyPrimaryVersionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest,
                      com.google.cloud.kms.v1.CryptoKey>(
                      this, METHODID_UPDATE_CRYPTO_KEY_PRIMARY_VERSION)))
          .addMethod(
              getDestroyCryptoKeyVersionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest,
                      com.google.cloud.kms.v1.CryptoKeyVersion>(
                      this, METHODID_DESTROY_CRYPTO_KEY_VERSION)))
          .addMethod(
              getRestoreCryptoKeyVersionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest,
                      com.google.cloud.kms.v1.CryptoKeyVersion>(
                      this, METHODID_RESTORE_CRYPTO_KEY_VERSION)))
          .build();
    }
  }

  /** */
  public static final class KeyManagementServiceStub
      extends io.grpc.stub.AbstractAsyncStub<KeyManagementServiceStub> {
    private KeyManagementServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagementServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagementServiceStub(channel, callOptions);
    }

    /** */
    public void listKeyRings(
        com.google.cloud.kms.v1.ListKeyRingsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ListKeyRingsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListKeyRingsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listCryptoKeys(
        com.google.cloud.kms.v1.ListCryptoKeysRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ListCryptoKeysResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCryptoKeysMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listCryptoKeyVersions(
        com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCryptoKeyVersionsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listImportJobs(
        com.google.cloud.kms.v1.ListImportJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ListImportJobsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListImportJobsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getKeyRing(
        com.google.cloud.kms.v1.GetKeyRingRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.KeyRing> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKeyRingMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void getCryptoKey(
        com.google.cloud.kms.v1.GetCryptoKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCryptoKeyMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getCryptoKeyVersion(
        com.google.cloud.kms.v1.GetCryptoKeyVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCryptoKeyVersionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getPublicKey(
        com.google.cloud.kms.v1.GetPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.PublicKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPublicKeyMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getImportJob(
        com.google.cloud.kms.v1.GetImportJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ImportJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImportJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createKeyRing(
        com.google.cloud.kms.v1.CreateKeyRingRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.KeyRing> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateKeyRingMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createCryptoKey(
        com.google.cloud.kms.v1.CreateCryptoKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCryptoKeyMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createCryptoKeyVersion(
        com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCryptoKeyVersionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void importCryptoKeyVersion(
        com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportCryptoKeyVersionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createImportJob(
        com.google.cloud.kms.v1.CreateImportJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ImportJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateImportJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateCryptoKey(
        com.google.cloud.kms.v1.UpdateCryptoKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCryptoKeyMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateCryptoKeyVersion(
        com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCryptoKeyVersionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void encrypt(
        com.google.cloud.kms.v1.EncryptRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.EncryptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEncryptMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void decrypt(
        com.google.cloud.kms.v1.DecryptRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.DecryptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDecryptMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void asymmetricSign(
        com.google.cloud.kms.v1.AsymmetricSignRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.AsymmetricSignResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAsymmetricSignMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void asymmetricDecrypt(
        com.google.cloud.kms.v1.AsymmetricDecryptRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.AsymmetricDecryptResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAsymmetricDecryptMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateCryptoKeyPrimaryVersion(
        com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCryptoKeyPrimaryVersionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void destroyCryptoKeyVersion(
        com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDestroyCryptoKeyVersionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void restoreCryptoKeyVersion(
        com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRestoreCryptoKeyVersionMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class KeyManagementServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<KeyManagementServiceBlockingStub> {
    private KeyManagementServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagementServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagementServiceBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.kms.v1.ListKeyRingsResponse listKeyRings(
        com.google.cloud.kms.v1.ListKeyRingsRequest request) {
      return blockingUnaryCall(getChannel(), getListKeyRingsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.ListCryptoKeysResponse listCryptoKeys(
        com.google.cloud.kms.v1.ListCryptoKeysRequest request) {
      return blockingUnaryCall(getChannel(), getListCryptoKeysMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse listCryptoKeyVersions(
        com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCryptoKeyVersionsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.ListImportJobsResponse listImportJobs(
        com.google.cloud.kms.v1.ListImportJobsRequest request) {
      return blockingUnaryCall(getChannel(), getListImportJobsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.KeyRing getKeyRing(
        com.google.cloud.kms.v1.GetKeyRingRequest request) {
      return blockingUnaryCall(getChannel(), getGetKeyRingMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.CryptoKey getCryptoKey(
        com.google.cloud.kms.v1.GetCryptoKeyRequest request) {
      return blockingUnaryCall(getChannel(), getGetCryptoKeyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.CryptoKeyVersion getCryptoKeyVersion(
        com.google.cloud.kms.v1.GetCryptoKeyVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCryptoKeyVersionMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.PublicKey getPublicKey(
        com.google.cloud.kms.v1.GetPublicKeyRequest request) {
      return blockingUnaryCall(getChannel(), getGetPublicKeyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.ImportJob getImportJob(
        com.google.cloud.kms.v1.GetImportJobRequest request) {
      return blockingUnaryCall(getChannel(), getGetImportJobMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.KeyRing createKeyRing(
        com.google.cloud.kms.v1.CreateKeyRingRequest request) {
      return blockingUnaryCall(getChannel(), getCreateKeyRingMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.CryptoKey createCryptoKey(
        com.google.cloud.kms.v1.CreateCryptoKeyRequest request) {
      return blockingUnaryCall(getChannel(), getCreateCryptoKeyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.CryptoKeyVersion createCryptoKeyVersion(
        com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCryptoKeyVersionMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.CryptoKeyVersion importCryptoKeyVersion(
        com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getImportCryptoKeyVersionMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.ImportJob createImportJob(
        com.google.cloud.kms.v1.CreateImportJobRequest request) {
      return blockingUnaryCall(getChannel(), getCreateImportJobMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.CryptoKey updateCryptoKey(
        com.google.cloud.kms.v1.UpdateCryptoKeyRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateCryptoKeyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.CryptoKeyVersion updateCryptoKeyVersion(
        com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCryptoKeyVersionMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.EncryptResponse encrypt(
        com.google.cloud.kms.v1.EncryptRequest request) {
      return blockingUnaryCall(getChannel(), getEncryptMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.DecryptResponse decrypt(
        com.google.cloud.kms.v1.DecryptRequest request) {
      return blockingUnaryCall(getChannel(), getDecryptMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.AsymmetricSignResponse asymmetricSign(
        com.google.cloud.kms.v1.AsymmetricSignRequest request) {
      return blockingUnaryCall(getChannel(), getAsymmetricSignMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.AsymmetricDecryptResponse asymmetricDecrypt(
        com.google.cloud.kms.v1.AsymmetricDecryptRequest request) {
      return blockingUnaryCall(
          getChannel(), getAsymmetricDecryptMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.CryptoKey updateCryptoKeyPrimaryVersion(
        com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCryptoKeyPrimaryVersionMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.CryptoKeyVersion destroyCryptoKeyVersion(
        com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDestroyCryptoKeyVersionMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.kms.v1.CryptoKeyVersion restoreCryptoKeyVersion(
        com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRestoreCryptoKeyVersionMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class KeyManagementServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<KeyManagementServiceFutureStub> {
    private KeyManagementServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagementServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagementServiceFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.ListKeyRingsResponse>
        listKeyRings(com.google.cloud.kms.v1.ListKeyRingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListKeyRingsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.ListCryptoKeysResponse>
        listCryptoKeys(com.google.cloud.kms.v1.ListCryptoKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCryptoKeysMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse>
        listCryptoKeyVersions(com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCryptoKeyVersionsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.ListImportJobsResponse>
        listImportJobs(com.google.cloud.kms.v1.ListImportJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListImportJobsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.kms.v1.KeyRing>
        getKeyRing(com.google.cloud.kms.v1.GetKeyRingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKeyRingMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.kms.v1.CryptoKey>
        getCryptoKey(com.google.cloud.kms.v1.GetCryptoKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCryptoKeyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.CryptoKeyVersion>
        getCryptoKeyVersion(com.google.cloud.kms.v1.GetCryptoKeyVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCryptoKeyVersionMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.kms.v1.PublicKey>
        getPublicKey(com.google.cloud.kms.v1.GetPublicKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPublicKeyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.kms.v1.ImportJob>
        getImportJob(com.google.cloud.kms.v1.GetImportJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImportJobMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.kms.v1.KeyRing>
        createKeyRing(com.google.cloud.kms.v1.CreateKeyRingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateKeyRingMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.kms.v1.CryptoKey>
        createCryptoKey(com.google.cloud.kms.v1.CreateCryptoKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCryptoKeyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.CryptoKeyVersion>
        createCryptoKeyVersion(com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCryptoKeyVersionMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.CryptoKeyVersion>
        importCryptoKeyVersion(com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getImportCryptoKeyVersionMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.kms.v1.ImportJob>
        createImportJob(com.google.cloud.kms.v1.CreateImportJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateImportJobMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.kms.v1.CryptoKey>
        updateCryptoKey(com.google.cloud.kms.v1.UpdateCryptoKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCryptoKeyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.CryptoKeyVersion>
        updateCryptoKeyVersion(com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCryptoKeyVersionMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.EncryptResponse>
        encrypt(com.google.cloud.kms.v1.EncryptRequest request) {
      return futureUnaryCall(getChannel().newCall(getEncryptMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.DecryptResponse>
        decrypt(com.google.cloud.kms.v1.DecryptRequest request) {
      return futureUnaryCall(getChannel().newCall(getDecryptMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.AsymmetricSignResponse>
        asymmetricSign(com.google.cloud.kms.v1.AsymmetricSignRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAsymmetricSignMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.AsymmetricDecryptResponse>
        asymmetricDecrypt(com.google.cloud.kms.v1.AsymmetricDecryptRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAsymmetricDecryptMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.kms.v1.CryptoKey>
        updateCryptoKeyPrimaryVersion(
            com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCryptoKeyPrimaryVersionMethod(), getCallOptions()),
          request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.CryptoKeyVersion>
        destroyCryptoKeyVersion(com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDestroyCryptoKeyVersionMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.kms.v1.CryptoKeyVersion>
        restoreCryptoKeyVersion(com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRestoreCryptoKeyVersionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_KEY_RINGS = 0;
  private static final int METHODID_LIST_CRYPTO_KEYS = 1;
  private static final int METHODID_LIST_CRYPTO_KEY_VERSIONS = 2;
  private static final int METHODID_LIST_IMPORT_JOBS = 3;
  private static final int METHODID_GET_KEY_RING = 4;
  private static final int METHODID_GET_CRYPTO_KEY = 5;
  private static final int METHODID_GET_CRYPTO_KEY_VERSION = 6;
  private static final int METHODID_GET_PUBLIC_KEY = 7;
  private static final int METHODID_GET_IMPORT_JOB = 8;
  private static final int METHODID_CREATE_KEY_RING = 9;
  private static final int METHODID_CREATE_CRYPTO_KEY = 10;
  private static final int METHODID_CREATE_CRYPTO_KEY_VERSION = 11;
  private static final int METHODID_IMPORT_CRYPTO_KEY_VERSION = 12;
  private static final int METHODID_CREATE_IMPORT_JOB = 13;
  private static final int METHODID_UPDATE_CRYPTO_KEY = 14;
  private static final int METHODID_UPDATE_CRYPTO_KEY_VERSION = 15;
  private static final int METHODID_ENCRYPT = 16;
  private static final int METHODID_DECRYPT = 17;
  private static final int METHODID_ASYMMETRIC_SIGN = 18;
  private static final int METHODID_ASYMMETRIC_DECRYPT = 19;
  private static final int METHODID_UPDATE_CRYPTO_KEY_PRIMARY_VERSION = 20;
  private static final int METHODID_DESTROY_CRYPTO_KEY_VERSION = 21;
  private static final int METHODID_RESTORE_CRYPTO_KEY_VERSION = 22;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyManagementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyManagementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_KEY_RINGS:
          serviceImpl.listKeyRings(
              (com.google.cloud.kms.v1.ListKeyRingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ListKeyRingsResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_CRYPTO_KEYS:
          serviceImpl.listCryptoKeys(
              (com.google.cloud.kms.v1.ListCryptoKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ListCryptoKeysResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_CRYPTO_KEY_VERSIONS:
          serviceImpl.listCryptoKeyVersions(
              (com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_IMPORT_JOBS:
          serviceImpl.listImportJobs(
              (com.google.cloud.kms.v1.ListImportJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ListImportJobsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_KEY_RING:
          serviceImpl.getKeyRing(
              (com.google.cloud.kms.v1.GetKeyRingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.KeyRing>) responseObserver);
          break;
        case METHODID_GET_CRYPTO_KEY:
          serviceImpl.getCryptoKey(
              (com.google.cloud.kms.v1.GetCryptoKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKey>) responseObserver);
          break;
        case METHODID_GET_CRYPTO_KEY_VERSION:
          serviceImpl.getCryptoKeyVersion(
              (com.google.cloud.kms.v1.GetCryptoKeyVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion>)
                  responseObserver);
          break;
        case METHODID_GET_PUBLIC_KEY:
          serviceImpl.getPublicKey(
              (com.google.cloud.kms.v1.GetPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.PublicKey>) responseObserver);
          break;
        case METHODID_GET_IMPORT_JOB:
          serviceImpl.getImportJob(
              (com.google.cloud.kms.v1.GetImportJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ImportJob>) responseObserver);
          break;
        case METHODID_CREATE_KEY_RING:
          serviceImpl.createKeyRing(
              (com.google.cloud.kms.v1.CreateKeyRingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.KeyRing>) responseObserver);
          break;
        case METHODID_CREATE_CRYPTO_KEY:
          serviceImpl.createCryptoKey(
              (com.google.cloud.kms.v1.CreateCryptoKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKey>) responseObserver);
          break;
        case METHODID_CREATE_CRYPTO_KEY_VERSION:
          serviceImpl.createCryptoKeyVersion(
              (com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion>)
                  responseObserver);
          break;
        case METHODID_IMPORT_CRYPTO_KEY_VERSION:
          serviceImpl.importCryptoKeyVersion(
              (com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion>)
                  responseObserver);
          break;
        case METHODID_CREATE_IMPORT_JOB:
          serviceImpl.createImportJob(
              (com.google.cloud.kms.v1.CreateImportJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.ImportJob>) responseObserver);
          break;
        case METHODID_UPDATE_CRYPTO_KEY:
          serviceImpl.updateCryptoKey(
              (com.google.cloud.kms.v1.UpdateCryptoKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKey>) responseObserver);
          break;
        case METHODID_UPDATE_CRYPTO_KEY_VERSION:
          serviceImpl.updateCryptoKeyVersion(
              (com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion>)
                  responseObserver);
          break;
        case METHODID_ENCRYPT:
          serviceImpl.encrypt(
              (com.google.cloud.kms.v1.EncryptRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.EncryptResponse>)
                  responseObserver);
          break;
        case METHODID_DECRYPT:
          serviceImpl.decrypt(
              (com.google.cloud.kms.v1.DecryptRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.DecryptResponse>)
                  responseObserver);
          break;
        case METHODID_ASYMMETRIC_SIGN:
          serviceImpl.asymmetricSign(
              (com.google.cloud.kms.v1.AsymmetricSignRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.AsymmetricSignResponse>)
                  responseObserver);
          break;
        case METHODID_ASYMMETRIC_DECRYPT:
          serviceImpl.asymmetricDecrypt(
              (com.google.cloud.kms.v1.AsymmetricDecryptRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.AsymmetricDecryptResponse>)
                  responseObserver);
          break;
        case METHODID_UPDATE_CRYPTO_KEY_PRIMARY_VERSION:
          serviceImpl.updateCryptoKeyPrimaryVersion(
              (com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKey>) responseObserver);
          break;
        case METHODID_DESTROY_CRYPTO_KEY_VERSION:
          serviceImpl.destroyCryptoKeyVersion(
              (com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion>)
                  responseObserver);
          break;
        case METHODID_RESTORE_CRYPTO_KEY_VERSION:
          serviceImpl.restoreCryptoKeyVersion(
              (com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.kms.v1.CryptoKeyVersion>)
                  responseObserver);
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

  private abstract static class KeyManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.kms.v1.KmsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagementService");
    }
  }

  private static final class KeyManagementServiceFileDescriptorSupplier
      extends KeyManagementServiceBaseDescriptorSupplier {
    KeyManagementServiceFileDescriptorSupplier() {}
  }

  private static final class KeyManagementServiceMethodDescriptorSupplier
      extends KeyManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyManagementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new KeyManagementServiceFileDescriptorSupplier())
                      .addMethod(getListKeyRingsMethod())
                      .addMethod(getListCryptoKeysMethod())
                      .addMethod(getListCryptoKeyVersionsMethod())
                      .addMethod(getListImportJobsMethod())
                      .addMethod(getGetKeyRingMethod())
                      .addMethod(getGetCryptoKeyMethod())
                      .addMethod(getGetCryptoKeyVersionMethod())
                      .addMethod(getGetPublicKeyMethod())
                      .addMethod(getGetImportJobMethod())
                      .addMethod(getCreateKeyRingMethod())
                      .addMethod(getCreateCryptoKeyMethod())
                      .addMethod(getCreateCryptoKeyVersionMethod())
                      .addMethod(getImportCryptoKeyVersionMethod())
                      .addMethod(getCreateImportJobMethod())
                      .addMethod(getUpdateCryptoKeyMethod())
                      .addMethod(getUpdateCryptoKeyVersionMethod())
                      .addMethod(getEncryptMethod())
                      .addMethod(getDecryptMethod())
                      .addMethod(getAsymmetricSignMethod())
                      .addMethod(getAsymmetricDecryptMethod())
                      .addMethod(getUpdateCryptoKeyPrimaryVersionMethod())
                      .addMethod(getDestroyCryptoKeyVersionMethod())
                      .addMethod(getRestoreCryptoKeyVersionMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
