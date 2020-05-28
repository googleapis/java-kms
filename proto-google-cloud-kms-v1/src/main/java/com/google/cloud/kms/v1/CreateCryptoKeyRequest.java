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

/**
 *
 *
 * <pre>
 * Request message for [KeyManagementService.CreateCryptoKey][google.cloud.kms.v1.KeyManagementService.CreateCryptoKey].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.CreateCryptoKeyRequest}
 */
public final class CreateCryptoKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.CreateCryptoKeyRequest)
    CreateCryptoKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateCryptoKeyRequest.newBuilder() to construct.
  private CreateCryptoKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateCryptoKeyRequest() {
    parent_ = "";
    cryptoKeyId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateCryptoKeyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateCryptoKeyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              cryptoKeyId_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.kms.v1.CryptoKey.Builder subBuilder = null;
              if (cryptoKey_ != null) {
                subBuilder = cryptoKey_.toBuilder();
              }
              cryptoKey_ =
                  input.readMessage(com.google.cloud.kms.v1.CryptoKey.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cryptoKey_);
                cryptoKey_ = subBuilder.buildPartial();
              }

              break;
            }
          case 40:
            {
              skipInitialVersionCreation_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_CreateCryptoKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_CreateCryptoKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.CreateCryptoKeyRequest.class,
            com.google.cloud.kms.v1.CreateCryptoKeyRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the KeyRing associated with the
   * [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the KeyRing associated with the
   * [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CRYPTO_KEY_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object cryptoKeyId_;
  /**
   *
   *
   * <pre>
   * Required. It must be unique within a KeyRing and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string crypto_key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The cryptoKeyId.
   */
  @java.lang.Override
  public java.lang.String getCryptoKeyId() {
    java.lang.Object ref = cryptoKeyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cryptoKeyId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. It must be unique within a KeyRing and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string crypto_key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for cryptoKeyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCryptoKeyIdBytes() {
    java.lang.Object ref = cryptoKeyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cryptoKeyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CRYPTO_KEY_FIELD_NUMBER = 3;
  private com.google.cloud.kms.v1.CryptoKey cryptoKey_;
  /**
   *
   *
   * <pre>
   * Required. A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey crypto_key = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the cryptoKey field is set.
   */
  @java.lang.Override
  public boolean hasCryptoKey() {
    return cryptoKey_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey crypto_key = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The cryptoKey.
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.CryptoKey getCryptoKey() {
    return cryptoKey_ == null ? com.google.cloud.kms.v1.CryptoKey.getDefaultInstance() : cryptoKey_;
  }
  /**
   *
   *
   * <pre>
   * Required. A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey crypto_key = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.CryptoKeyOrBuilder getCryptoKeyOrBuilder() {
    return getCryptoKey();
  }

  public static final int SKIP_INITIAL_VERSION_CREATION_FIELD_NUMBER = 5;
  private boolean skipInitialVersionCreation_;
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
  @java.lang.Override
  public boolean getSkipInitialVersionCreation() {
    return skipInitialVersionCreation_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getCryptoKeyIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cryptoKeyId_);
    }
    if (cryptoKey_ != null) {
      output.writeMessage(3, getCryptoKey());
    }
    if (skipInitialVersionCreation_ != false) {
      output.writeBool(5, skipInitialVersionCreation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!getCryptoKeyIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cryptoKeyId_);
    }
    if (cryptoKey_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCryptoKey());
    }
    if (skipInitialVersionCreation_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, skipInitialVersionCreation_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.kms.v1.CreateCryptoKeyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.CreateCryptoKeyRequest other =
        (com.google.cloud.kms.v1.CreateCryptoKeyRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getCryptoKeyId().equals(other.getCryptoKeyId())) return false;
    if (hasCryptoKey() != other.hasCryptoKey()) return false;
    if (hasCryptoKey()) {
      if (!getCryptoKey().equals(other.getCryptoKey())) return false;
    }
    if (getSkipInitialVersionCreation() != other.getSkipInitialVersionCreation()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + CRYPTO_KEY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCryptoKeyId().hashCode();
    if (hasCryptoKey()) {
      hash = (37 * hash) + CRYPTO_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getCryptoKey().hashCode();
    }
    hash = (37 * hash) + SKIP_INITIAL_VERSION_CREATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSkipInitialVersionCreation());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.kms.v1.CreateCryptoKeyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for [KeyManagementService.CreateCryptoKey][google.cloud.kms.v1.KeyManagementService.CreateCryptoKey].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.CreateCryptoKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.CreateCryptoKeyRequest)
      com.google.cloud.kms.v1.CreateCryptoKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_CreateCryptoKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_CreateCryptoKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.CreateCryptoKeyRequest.class,
              com.google.cloud.kms.v1.CreateCryptoKeyRequest.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.CreateCryptoKeyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      cryptoKeyId_ = "";

      if (cryptoKeyBuilder_ == null) {
        cryptoKey_ = null;
      } else {
        cryptoKey_ = null;
        cryptoKeyBuilder_ = null;
      }
      skipInitialVersionCreation_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_CreateCryptoKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CreateCryptoKeyRequest getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.CreateCryptoKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CreateCryptoKeyRequest build() {
      com.google.cloud.kms.v1.CreateCryptoKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CreateCryptoKeyRequest buildPartial() {
      com.google.cloud.kms.v1.CreateCryptoKeyRequest result =
          new com.google.cloud.kms.v1.CreateCryptoKeyRequest(this);
      result.parent_ = parent_;
      result.cryptoKeyId_ = cryptoKeyId_;
      if (cryptoKeyBuilder_ == null) {
        result.cryptoKey_ = cryptoKey_;
      } else {
        result.cryptoKey_ = cryptoKeyBuilder_.build();
      }
      result.skipInitialVersionCreation_ = skipInitialVersionCreation_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.kms.v1.CreateCryptoKeyRequest) {
        return mergeFrom((com.google.cloud.kms.v1.CreateCryptoKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.CreateCryptoKeyRequest other) {
      if (other == com.google.cloud.kms.v1.CreateCryptoKeyRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getCryptoKeyId().isEmpty()) {
        cryptoKeyId_ = other.cryptoKeyId_;
        onChanged();
      }
      if (other.hasCryptoKey()) {
        mergeCryptoKey(other.getCryptoKey());
      }
      if (other.getSkipInitialVersionCreation() != false) {
        setSkipInitialVersionCreation(other.getSkipInitialVersionCreation());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.kms.v1.CreateCryptoKeyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.CreateCryptoKeyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the KeyRing associated with the
     * [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the KeyRing associated with the
     * [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the KeyRing associated with the
     * [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the KeyRing associated with the
     * [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the KeyRing associated with the
     * [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cryptoKeyId_ = "";
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a KeyRing and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string crypto_key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The cryptoKeyId.
     */
    public java.lang.String getCryptoKeyId() {
      java.lang.Object ref = cryptoKeyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cryptoKeyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a KeyRing and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string crypto_key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for cryptoKeyId.
     */
    public com.google.protobuf.ByteString getCryptoKeyIdBytes() {
      java.lang.Object ref = cryptoKeyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cryptoKeyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a KeyRing and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string crypto_key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The cryptoKeyId to set.
     * @return This builder for chaining.
     */
    public Builder setCryptoKeyId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      cryptoKeyId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a KeyRing and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string crypto_key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCryptoKeyId() {

      cryptoKeyId_ = getDefaultInstance().getCryptoKeyId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a KeyRing and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string crypto_key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for cryptoKeyId to set.
     * @return This builder for chaining.
     */
    public Builder setCryptoKeyIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      cryptoKeyId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.kms.v1.CryptoKey cryptoKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.CryptoKey,
            com.google.cloud.kms.v1.CryptoKey.Builder,
            com.google.cloud.kms.v1.CryptoKeyOrBuilder>
        cryptoKeyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the cryptoKey field is set.
     */
    public boolean hasCryptoKey() {
      return cryptoKeyBuilder_ != null || cryptoKey_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The cryptoKey.
     */
    public com.google.cloud.kms.v1.CryptoKey getCryptoKey() {
      if (cryptoKeyBuilder_ == null) {
        return cryptoKey_ == null
            ? com.google.cloud.kms.v1.CryptoKey.getDefaultInstance()
            : cryptoKey_;
      } else {
        return cryptoKeyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCryptoKey(com.google.cloud.kms.v1.CryptoKey value) {
      if (cryptoKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cryptoKey_ = value;
        onChanged();
      } else {
        cryptoKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCryptoKey(com.google.cloud.kms.v1.CryptoKey.Builder builderForValue) {
      if (cryptoKeyBuilder_ == null) {
        cryptoKey_ = builderForValue.build();
        onChanged();
      } else {
        cryptoKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCryptoKey(com.google.cloud.kms.v1.CryptoKey value) {
      if (cryptoKeyBuilder_ == null) {
        if (cryptoKey_ != null) {
          cryptoKey_ =
              com.google.cloud.kms.v1.CryptoKey.newBuilder(cryptoKey_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          cryptoKey_ = value;
        }
        onChanged();
      } else {
        cryptoKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCryptoKey() {
      if (cryptoKeyBuilder_ == null) {
        cryptoKey_ = null;
        onChanged();
      } else {
        cryptoKey_ = null;
        cryptoKeyBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.kms.v1.CryptoKey.Builder getCryptoKeyBuilder() {

      onChanged();
      return getCryptoKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.kms.v1.CryptoKeyOrBuilder getCryptoKeyOrBuilder() {
      if (cryptoKeyBuilder_ != null) {
        return cryptoKeyBuilder_.getMessageOrBuilder();
      } else {
        return cryptoKey_ == null
            ? com.google.cloud.kms.v1.CryptoKey.getDefaultInstance()
            : cryptoKey_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.CryptoKey,
            com.google.cloud.kms.v1.CryptoKey.Builder,
            com.google.cloud.kms.v1.CryptoKeyOrBuilder>
        getCryptoKeyFieldBuilder() {
      if (cryptoKeyBuilder_ == null) {
        cryptoKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.kms.v1.CryptoKey,
                com.google.cloud.kms.v1.CryptoKey.Builder,
                com.google.cloud.kms.v1.CryptoKeyOrBuilder>(
                getCryptoKey(), getParentForChildren(), isClean());
        cryptoKey_ = null;
      }
      return cryptoKeyBuilder_;
    }

    private boolean skipInitialVersionCreation_;
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
    @java.lang.Override
    public boolean getSkipInitialVersionCreation() {
      return skipInitialVersionCreation_;
    }
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
     * @param value The skipInitialVersionCreation to set.
     * @return This builder for chaining.
     */
    public Builder setSkipInitialVersionCreation(boolean value) {

      skipInitialVersionCreation_ = value;
      onChanged();
      return this;
    }
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
     * @return This builder for chaining.
     */
    public Builder clearSkipInitialVersionCreation() {

      skipInitialVersionCreation_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.CreateCryptoKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.CreateCryptoKeyRequest)
  private static final com.google.cloud.kms.v1.CreateCryptoKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.CreateCryptoKeyRequest();
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCryptoKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateCryptoKeyRequest>() {
        @java.lang.Override
        public CreateCryptoKeyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateCryptoKeyRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateCryptoKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCryptoKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.CreateCryptoKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
