// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/ekm_service.proto

package com.google.cloud.kms.v1;

/**
 * <pre>
 * Response message for [KeyManagementService.ListEkmConnections][].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.ListEkmConnectionsResponse}
 */
public final class ListEkmConnectionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.ListEkmConnectionsResponse)
    ListEkmConnectionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListEkmConnectionsResponse.newBuilder() to construct.
  private ListEkmConnectionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListEkmConnectionsResponse() {
    ekmConnections_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListEkmConnectionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListEkmConnectionsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ekmConnections_ = new java.util.ArrayList<com.google.cloud.kms.v1.EkmConnection>();
              mutable_bitField0_ |= 0x00000001;
            }
            ekmConnections_.add(
                input.readMessage(com.google.cloud.kms.v1.EkmConnection.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
          case 24: {

            totalSize_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        ekmConnections_ = java.util.Collections.unmodifiableList(ekmConnections_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.kms.v1.EkmServiceProto.internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.EkmServiceProto.internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.ListEkmConnectionsResponse.class, com.google.cloud.kms.v1.ListEkmConnectionsResponse.Builder.class);
  }

  public static final int EKM_CONNECTIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.kms.v1.EkmConnection> ekmConnections_;
  /**
   * <pre>
   * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.kms.v1.EkmConnection> getEkmConnectionsList() {
    return ekmConnections_;
  }
  /**
   * <pre>
   * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.kms.v1.EkmConnectionOrBuilder> 
      getEkmConnectionsOrBuilderList() {
    return ekmConnections_;
  }
  /**
   * <pre>
   * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
   */
  @java.lang.Override
  public int getEkmConnectionsCount() {
    return ekmConnections_.size();
  }
  /**
   * <pre>
   * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.EkmConnection getEkmConnections(int index) {
    return ekmConnections_.get(index);
  }
  /**
   * <pre>
   * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.EkmConnectionOrBuilder getEkmConnectionsOrBuilder(
      int index) {
    return ekmConnections_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListEkmConnectionsRequest.page_token][google.cloud.kms.v1.ListEkmConnectionsRequest.page_token]
   * to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListEkmConnectionsRequest.page_token][google.cloud.kms.v1.ListEkmConnectionsRequest.page_token]
   * to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_SIZE_FIELD_NUMBER = 3;
  private int totalSize_;
  /**
   * <pre>
   * The total number of [EkmConnections][google.cloud.kms.v1.EkmConnection]
   * that matched the query.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   * @return The totalSize.
   */
  @java.lang.Override
  public int getTotalSize() {
    return totalSize_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < ekmConnections_.size(); i++) {
      output.writeMessage(1, ekmConnections_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      output.writeInt32(3, totalSize_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ekmConnections_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ekmConnections_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, totalSize_);
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
    if (!(obj instanceof com.google.cloud.kms.v1.ListEkmConnectionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.ListEkmConnectionsResponse other = (com.google.cloud.kms.v1.ListEkmConnectionsResponse) obj;

    if (!getEkmConnectionsList()
        .equals(other.getEkmConnectionsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (getTotalSize()
        != other.getTotalSize()) return false;
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
    if (getEkmConnectionsCount() > 0) {
      hash = (37 * hash) + EKM_CONNECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getEkmConnectionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (37 * hash) + TOTAL_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getTotalSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.kms.v1.ListEkmConnectionsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response message for [KeyManagementService.ListEkmConnections][].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.ListEkmConnectionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.ListEkmConnectionsResponse)
      com.google.cloud.kms.v1.ListEkmConnectionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.kms.v1.EkmServiceProto.internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.EkmServiceProto.internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.ListEkmConnectionsResponse.class, com.google.cloud.kms.v1.ListEkmConnectionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.ListEkmConnectionsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getEkmConnectionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ekmConnectionsBuilder_ == null) {
        ekmConnections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ekmConnectionsBuilder_.clear();
      }
      nextPageToken_ = "";

      totalSize_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.kms.v1.EkmServiceProto.internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.ListEkmConnectionsResponse getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.ListEkmConnectionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.ListEkmConnectionsResponse build() {
      com.google.cloud.kms.v1.ListEkmConnectionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.ListEkmConnectionsResponse buildPartial() {
      com.google.cloud.kms.v1.ListEkmConnectionsResponse result = new com.google.cloud.kms.v1.ListEkmConnectionsResponse(this);
      int from_bitField0_ = bitField0_;
      if (ekmConnectionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ekmConnections_ = java.util.Collections.unmodifiableList(ekmConnections_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ekmConnections_ = ekmConnections_;
      } else {
        result.ekmConnections_ = ekmConnectionsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.totalSize_ = totalSize_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.kms.v1.ListEkmConnectionsResponse) {
        return mergeFrom((com.google.cloud.kms.v1.ListEkmConnectionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.ListEkmConnectionsResponse other) {
      if (other == com.google.cloud.kms.v1.ListEkmConnectionsResponse.getDefaultInstance()) return this;
      if (ekmConnectionsBuilder_ == null) {
        if (!other.ekmConnections_.isEmpty()) {
          if (ekmConnections_.isEmpty()) {
            ekmConnections_ = other.ekmConnections_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEkmConnectionsIsMutable();
            ekmConnections_.addAll(other.ekmConnections_);
          }
          onChanged();
        }
      } else {
        if (!other.ekmConnections_.isEmpty()) {
          if (ekmConnectionsBuilder_.isEmpty()) {
            ekmConnectionsBuilder_.dispose();
            ekmConnectionsBuilder_ = null;
            ekmConnections_ = other.ekmConnections_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ekmConnectionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEkmConnectionsFieldBuilder() : null;
          } else {
            ekmConnectionsBuilder_.addAllMessages(other.ekmConnections_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      if (other.getTotalSize() != 0) {
        setTotalSize(other.getTotalSize());
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
      com.google.cloud.kms.v1.ListEkmConnectionsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.ListEkmConnectionsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.kms.v1.EkmConnection> ekmConnections_ =
      java.util.Collections.emptyList();
    private void ensureEkmConnectionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ekmConnections_ = new java.util.ArrayList<com.google.cloud.kms.v1.EkmConnection>(ekmConnections_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.kms.v1.EkmConnection, com.google.cloud.kms.v1.EkmConnection.Builder, com.google.cloud.kms.v1.EkmConnectionOrBuilder> ekmConnectionsBuilder_;

    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public java.util.List<com.google.cloud.kms.v1.EkmConnection> getEkmConnectionsList() {
      if (ekmConnectionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ekmConnections_);
      } else {
        return ekmConnectionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public int getEkmConnectionsCount() {
      if (ekmConnectionsBuilder_ == null) {
        return ekmConnections_.size();
      } else {
        return ekmConnectionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public com.google.cloud.kms.v1.EkmConnection getEkmConnections(int index) {
      if (ekmConnectionsBuilder_ == null) {
        return ekmConnections_.get(index);
      } else {
        return ekmConnectionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public Builder setEkmConnections(
        int index, com.google.cloud.kms.v1.EkmConnection value) {
      if (ekmConnectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEkmConnectionsIsMutable();
        ekmConnections_.set(index, value);
        onChanged();
      } else {
        ekmConnectionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public Builder setEkmConnections(
        int index, com.google.cloud.kms.v1.EkmConnection.Builder builderForValue) {
      if (ekmConnectionsBuilder_ == null) {
        ensureEkmConnectionsIsMutable();
        ekmConnections_.set(index, builderForValue.build());
        onChanged();
      } else {
        ekmConnectionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public Builder addEkmConnections(com.google.cloud.kms.v1.EkmConnection value) {
      if (ekmConnectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEkmConnectionsIsMutable();
        ekmConnections_.add(value);
        onChanged();
      } else {
        ekmConnectionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public Builder addEkmConnections(
        int index, com.google.cloud.kms.v1.EkmConnection value) {
      if (ekmConnectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEkmConnectionsIsMutable();
        ekmConnections_.add(index, value);
        onChanged();
      } else {
        ekmConnectionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public Builder addEkmConnections(
        com.google.cloud.kms.v1.EkmConnection.Builder builderForValue) {
      if (ekmConnectionsBuilder_ == null) {
        ensureEkmConnectionsIsMutable();
        ekmConnections_.add(builderForValue.build());
        onChanged();
      } else {
        ekmConnectionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public Builder addEkmConnections(
        int index, com.google.cloud.kms.v1.EkmConnection.Builder builderForValue) {
      if (ekmConnectionsBuilder_ == null) {
        ensureEkmConnectionsIsMutable();
        ekmConnections_.add(index, builderForValue.build());
        onChanged();
      } else {
        ekmConnectionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public Builder addAllEkmConnections(
        java.lang.Iterable<? extends com.google.cloud.kms.v1.EkmConnection> values) {
      if (ekmConnectionsBuilder_ == null) {
        ensureEkmConnectionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ekmConnections_);
        onChanged();
      } else {
        ekmConnectionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public Builder clearEkmConnections() {
      if (ekmConnectionsBuilder_ == null) {
        ekmConnections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ekmConnectionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public Builder removeEkmConnections(int index) {
      if (ekmConnectionsBuilder_ == null) {
        ensureEkmConnectionsIsMutable();
        ekmConnections_.remove(index);
        onChanged();
      } else {
        ekmConnectionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public com.google.cloud.kms.v1.EkmConnection.Builder getEkmConnectionsBuilder(
        int index) {
      return getEkmConnectionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public com.google.cloud.kms.v1.EkmConnectionOrBuilder getEkmConnectionsOrBuilder(
        int index) {
      if (ekmConnectionsBuilder_ == null) {
        return ekmConnections_.get(index);  } else {
        return ekmConnectionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.kms.v1.EkmConnectionOrBuilder> 
         getEkmConnectionsOrBuilderList() {
      if (ekmConnectionsBuilder_ != null) {
        return ekmConnectionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ekmConnections_);
      }
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public com.google.cloud.kms.v1.EkmConnection.Builder addEkmConnectionsBuilder() {
      return getEkmConnectionsFieldBuilder().addBuilder(
          com.google.cloud.kms.v1.EkmConnection.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public com.google.cloud.kms.v1.EkmConnection.Builder addEkmConnectionsBuilder(
        int index) {
      return getEkmConnectionsFieldBuilder().addBuilder(
          index, com.google.cloud.kms.v1.EkmConnection.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
     */
    public java.util.List<com.google.cloud.kms.v1.EkmConnection.Builder> 
         getEkmConnectionsBuilderList() {
      return getEkmConnectionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.kms.v1.EkmConnection, com.google.cloud.kms.v1.EkmConnection.Builder, com.google.cloud.kms.v1.EkmConnectionOrBuilder> 
        getEkmConnectionsFieldBuilder() {
      if (ekmConnectionsBuilder_ == null) {
        ekmConnectionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.kms.v1.EkmConnection, com.google.cloud.kms.v1.EkmConnection.Builder, com.google.cloud.kms.v1.EkmConnectionOrBuilder>(
                ekmConnections_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ekmConnections_ = null;
      }
      return ekmConnectionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in
     * [ListEkmConnectionsRequest.page_token][google.cloud.kms.v1.ListEkmConnectionsRequest.page_token]
     * to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in
     * [ListEkmConnectionsRequest.page_token][google.cloud.kms.v1.ListEkmConnectionsRequest.page_token]
     * to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in
     * [ListEkmConnectionsRequest.page_token][google.cloud.kms.v1.ListEkmConnectionsRequest.page_token]
     * to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in
     * [ListEkmConnectionsRequest.page_token][google.cloud.kms.v1.ListEkmConnectionsRequest.page_token]
     * to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in
     * [ListEkmConnectionsRequest.page_token][google.cloud.kms.v1.ListEkmConnectionsRequest.page_token]
     * to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }

    private int totalSize_ ;
    /**
     * <pre>
     * The total number of [EkmConnections][google.cloud.kms.v1.EkmConnection]
     * that matched the query.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     * @return The totalSize.
     */
    @java.lang.Override
    public int getTotalSize() {
      return totalSize_;
    }
    /**
     * <pre>
     * The total number of [EkmConnections][google.cloud.kms.v1.EkmConnection]
     * that matched the query.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     * @param value The totalSize to set.
     * @return This builder for chaining.
     */
    public Builder setTotalSize(int value) {
      
      totalSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total number of [EkmConnections][google.cloud.kms.v1.EkmConnection]
     * that matched the query.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalSize() {
      
      totalSize_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.ListEkmConnectionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.ListEkmConnectionsResponse)
  private static final com.google.cloud.kms.v1.ListEkmConnectionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.ListEkmConnectionsResponse();
  }

  public static com.google.cloud.kms.v1.ListEkmConnectionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEkmConnectionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListEkmConnectionsResponse>() {
    @java.lang.Override
    public ListEkmConnectionsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListEkmConnectionsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListEkmConnectionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEkmConnectionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.ListEkmConnectionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

