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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

public interface PublicKeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.PublicKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The public key, encoded in PEM format. For more information, see the
   * [RFC 7468](https://tools.ietf.org/html/rfc7468) sections for
   * [General Considerations](https://tools.ietf.org/html/rfc7468#section-2) and
   * [Textual Encoding of Subject Public Key Info]
   * (https://tools.ietf.org/html/rfc7468#section-13).
   * </pre>
   *
   * <code>string pem = 1;</code>
   *
   * @return The pem.
   */
  java.lang.String getPem();
  /**
   *
   *
   * <pre>
   * The public key, encoded in PEM format. For more information, see the
   * [RFC 7468](https://tools.ietf.org/html/rfc7468) sections for
   * [General Considerations](https://tools.ietf.org/html/rfc7468#section-2) and
   * [Textual Encoding of Subject Public Key Info]
   * (https://tools.ietf.org/html/rfc7468#section-13).
   * </pre>
   *
   * <code>string pem = 1;</code>
   *
   * @return The bytes for pem.
   */
  com.google.protobuf.ByteString getPemBytes();

  /**
   *
   *
   * <pre>
   * The [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] associated
   * with this key.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 2;</code>
   *
   * @return The enum numeric value on the wire for algorithm.
   */
  int getAlgorithmValue();
  /**
   *
   *
   * <pre>
   * The [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] associated
   * with this key.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 2;</code>
   *
   * @return The algorithm.
   */
  com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm getAlgorithm();

  /**
   *
   *
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [PublicKey.pem][google.cloud.kms.v1.PublicKey.pem]. An integrity check of [PublicKey.pem][google.cloud.kms.v1.PublicKey.pem] can be performed
   * by computing the CRC32C checksum of [PublicKey.pem][google.cloud.kms.v1.PublicKey.pem] and
   * comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum.
   * Note: This field is defined as int64 for reasons of compatibility across
   * different languages. However, it is a non-negative integer, which will
   * never exceed 2^32-1, and can be safely downconverted to uint32 in languages
   * that support this type.
   * NOTE: This field is in Beta.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value pem_crc32c = 3;</code>
   *
   * @return Whether the pemCrc32c field is set.
   */
  boolean hasPemCrc32C();
  /**
   *
   *
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [PublicKey.pem][google.cloud.kms.v1.PublicKey.pem]. An integrity check of [PublicKey.pem][google.cloud.kms.v1.PublicKey.pem] can be performed
   * by computing the CRC32C checksum of [PublicKey.pem][google.cloud.kms.v1.PublicKey.pem] and
   * comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum.
   * Note: This field is defined as int64 for reasons of compatibility across
   * different languages. However, it is a non-negative integer, which will
   * never exceed 2^32-1, and can be safely downconverted to uint32 in languages
   * that support this type.
   * NOTE: This field is in Beta.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value pem_crc32c = 3;</code>
   *
   * @return The pemCrc32c.
   */
  com.google.protobuf.Int64Value getPemCrc32C();
  /**
   *
   *
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [PublicKey.pem][google.cloud.kms.v1.PublicKey.pem]. An integrity check of [PublicKey.pem][google.cloud.kms.v1.PublicKey.pem] can be performed
   * by computing the CRC32C checksum of [PublicKey.pem][google.cloud.kms.v1.PublicKey.pem] and
   * comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum.
   * Note: This field is defined as int64 for reasons of compatibility across
   * different languages. However, it is a non-negative integer, which will
   * never exceed 2^32-1, and can be safely downconverted to uint32 in languages
   * that support this type.
   * NOTE: This field is in Beta.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value pem_crc32c = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getPemCrc32COrBuilder();

  /**
   *
   *
   * <pre>
   * The [name][google.cloud.kms.v1.CryptoKeyVersion.name] of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] public key.
   * Provided here for verification.
   * NOTE: This field is in Beta.
   * </pre>
   *
   * <code>string name = 4;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The [name][google.cloud.kms.v1.CryptoKeyVersion.name] of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] public key.
   * Provided here for verification.
   * NOTE: This field is in Beta.
   * </pre>
   *
   * <code>string name = 4;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] public key.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 5;</code>
   *
   * @return The enum numeric value on the wire for protectionLevel.
   */
  int getProtectionLevelValue();
  /**
   *
   *
   * <pre>
   * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] public key.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 5;</code>
   *
   * @return The protectionLevel.
   */
  com.google.cloud.kms.v1.ProtectionLevel getProtectionLevel();
}
