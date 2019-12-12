/*
 * Copyright 2019 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface CreateCryptoKeyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.CreateCryptoKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the KeyRing associated with the
   * [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the KeyRing associated with the
   * [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. It must be unique within a KeyRing and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string crypto_key_id = 2;</code>
   *
   * @return The cryptoKeyId.
   */
  java.lang.String getCryptoKeyId();
  /**
   *
   *
   * <pre>
   * Required. It must be unique within a KeyRing and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string crypto_key_id = 2;</code>
   *
   * @return The bytes for cryptoKeyId.
   */
  com.google.protobuf.ByteString getCryptoKeyIdBytes();

  /**
   *
   *
   * <pre>
   * A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey crypto_key = 3;</code>
   *
   * @return Whether the cryptoKey field is set.
   */
  boolean hasCryptoKey();
  /**
   *
   *
   * <pre>
   * A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey crypto_key = 3;</code>
   *
   * @return The cryptoKey.
   */
  com.google.cloud.kms.v1.CryptoKey getCryptoKey();
  /**
   *
   *
   * <pre>
   * A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey crypto_key = 3;</code>
   */
  com.google.cloud.kms.v1.CryptoKeyOrBuilder getCryptoKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true, the request will create a [CryptoKey][google.cloud.kms.v1.CryptoKey] without any
   * [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion]. You must manually call
   * [CreateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.CreateCryptoKeyVersion] or
   * [ImportCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.ImportCryptoKeyVersion]
   * before you can use this [CryptoKey][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>bool skip_initial_version_creation = 5;</code>
   *
   * @return The skipInitialVersionCreation.
   */
  boolean getSkipInitialVersionCreation();
}
