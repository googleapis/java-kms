// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface GetPublicKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.GetPublicKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The [name][google.cloud.kms.v1.CryptoKeyVersion.name] of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] public key to
   * get.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The [name][google.cloud.kms.v1.CryptoKeyVersion.name] of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] public key to
   * get.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
