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
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface AsymmetricDecryptResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.AsymmetricDecryptResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The decrypted data originally encrypted with the matching public key.
   * </pre>
   *
   * <code>bytes plaintext = 1;</code>
   *
   * @return The plaintext.
   */
  com.google.protobuf.ByteString getPlaintext();

  /**
   *
   *
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [AsymmetricDecryptResponse.plaintext][google.cloud.kms.v1.AsymmetricDecryptResponse.plaintext].
   * An integrity check of
   * [AsymmetricDecryptResponse.plaintext][google.cloud.kms.v1.AsymmetricDecryptResponse.plaintext]
   * can be performed by computing the CRC32C checksum of
   * [AsymmetricDecryptResponse.plaintext][google.cloud.kms.v1.AsymmetricDecryptResponse.plaintext]
   * and comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility
   * across different languages. However, it is a non-negative integer, which
   * will never exceed 2^32-1, and can be safely downconverted to uint32 in
   * languages that support this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value plaintext_crc32c = 2;</code>
   *
   * @return Whether the plaintextCrc32c field is set.
   */
  boolean hasPlaintextCrc32C();
  /**
   *
   *
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [AsymmetricDecryptResponse.plaintext][google.cloud.kms.v1.AsymmetricDecryptResponse.plaintext].
   * An integrity check of
   * [AsymmetricDecryptResponse.plaintext][google.cloud.kms.v1.AsymmetricDecryptResponse.plaintext]
   * can be performed by computing the CRC32C checksum of
   * [AsymmetricDecryptResponse.plaintext][google.cloud.kms.v1.AsymmetricDecryptResponse.plaintext]
   * and comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility
   * across different languages. However, it is a non-negative integer, which
   * will never exceed 2^32-1, and can be safely downconverted to uint32 in
   * languages that support this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value plaintext_crc32c = 2;</code>
   *
   * @return The plaintextCrc32c.
   */
  com.google.protobuf.Int64Value getPlaintextCrc32C();
  /**
   *
   *
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [AsymmetricDecryptResponse.plaintext][google.cloud.kms.v1.AsymmetricDecryptResponse.plaintext].
   * An integrity check of
   * [AsymmetricDecryptResponse.plaintext][google.cloud.kms.v1.AsymmetricDecryptResponse.plaintext]
   * can be performed by computing the CRC32C checksum of
   * [AsymmetricDecryptResponse.plaintext][google.cloud.kms.v1.AsymmetricDecryptResponse.plaintext]
   * and comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility
   * across different languages. However, it is a non-negative integer, which
   * will never exceed 2^32-1, and can be safely downconverted to uint32 in
   * languages that support this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value plaintext_crc32c = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getPlaintextCrc32COrBuilder();

  /**
   *
   *
   * <pre>
   * Integrity verification field. A flag indicating whether
   * [AsymmetricDecryptRequest.ciphertext_crc32c][google.cloud.kms.v1.AsymmetricDecryptRequest.ciphertext_crc32c]
   * was received by
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] and used
   * for the integrity verification of the
   * [ciphertext][google.cloud.kms.v1.AsymmetricDecryptRequest.ciphertext]. A
   * false value of this field indicates either that
   * [AsymmetricDecryptRequest.ciphertext_crc32c][google.cloud.kms.v1.AsymmetricDecryptRequest.ciphertext_crc32c]
   * was left unset or that it was not delivered to
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService]. If you've
   * set
   * [AsymmetricDecryptRequest.ciphertext_crc32c][google.cloud.kms.v1.AsymmetricDecryptRequest.ciphertext_crc32c]
   * but this field is still false, discard the response and perform a limited
   * number of retries.
   * </pre>
   *
   * <code>bool verified_ciphertext_crc32c = 3;</code>
   *
   * @return The verifiedCiphertextCrc32c.
   */
  boolean getVerifiedCiphertextCrc32C();

  /**
   *
   *
   * <pre>
   * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] used in
   * decryption.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 4;</code>
   *
   * @return The enum numeric value on the wire for protectionLevel.
   */
  int getProtectionLevelValue();
  /**
   *
   *
   * <pre>
   * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] used in
   * decryption.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 4;</code>
   *
   * @return The protectionLevel.
   */
  com.google.cloud.kms.v1.ProtectionLevel getProtectionLevel();
}
