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

public final class KmsResourcesProto {
  private KmsResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_KeyRing_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyRing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKeyVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_PublicKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_PublicKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_ImportJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ImportJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/kms/v1/resources.proto\022\023g"
          + "oogle.cloud.kms.v1\032\034google/api/annotatio"
          + "ns.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032\036google/pro"
          + "tobuf/duration.proto\032\037google/protobuf/ti"
          + "mestamp.proto\"\265\001\n\007KeyRing\022\021\n\004name\030\001 \001(\tB"
          + "\003\340A\003\0224\n\013create_time\030\002 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003:a\352A^\n\037cloudkms.google"
          + "apis.com/KeyRing\022;projects/{project}/loc"
          + "ations/{location}/keyRings/{key_ring}\"\206\006"
          + "\n\tCryptoKey\022\021\n\004name\030\001 \001(\tB\003\340A\003\022;\n\007primar"
          + "y\030\002 \001(\0132%.google.cloud.kms.v1.CryptoKeyV"
          + "ersionB\003\340A\003\022E\n\007purpose\030\003 \001(\0162/.google.cl"
          + "oud.kms.v1.CryptoKey.CryptoKeyPurposeB\003\340"
          + "A\005\0224\n\013create_time\030\005 \001(\0132\032.google.protobu"
          + "f.TimestampB\003\340A\003\0226\n\022next_rotation_time\030\007"
          + " \001(\0132\032.google.protobuf.Timestamp\0224\n\017rota"
          + "tion_period\030\010 \001(\0132\031.google.protobuf.Dura"
          + "tionH\000\022G\n\020version_template\030\013 \001(\0132-.googl"
          + "e.cloud.kms.v1.CryptoKeyVersionTemplate\022"
          + ":\n\006labels\030\n \003(\0132*.google.cloud.kms.v1.Cr"
          + "yptoKey.LabelsEntry\032-\n\013LabelsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"x\n\020CryptoKeyP"
          + "urpose\022\"\n\036CRYPTO_KEY_PURPOSE_UNSPECIFIED"
          + "\020\000\022\023\n\017ENCRYPT_DECRYPT\020\001\022\023\n\017ASYMMETRIC_SI"
          + "GN\020\005\022\026\n\022ASYMMETRIC_DECRYPT\020\006:{\352Ax\n!cloud"
          + "kms.googleapis.com/CryptoKey\022Sprojects/{"
          + "project}/locations/{location}/keyRings/{"
          + "key_ring}/cryptoKeys/{crypto_key}B\023\n\021rot"
          + "ation_schedule\"\263\001\n\030CryptoKeyVersionTempl"
          + "ate\022>\n\020protection_level\030\001 \001(\0162$.google.c"
          + "loud.kms.v1.ProtectionLevel\022W\n\talgorithm"
          + "\030\003 \001(\0162?.google.cloud.kms.v1.CryptoKeyVe"
          + "rsion.CryptoKeyVersionAlgorithmB\003\340A\002\"\361\001\n"
          + "\027KeyOperationAttestation\022S\n\006format\030\004 \001(\016"
          + "2>.google.cloud.kms.v1.KeyOperationAttes"
          + "tation.AttestationFormatB\003\340A\003\022\024\n\007content"
          + "\030\005 \001(\014B\003\340A\003\"k\n\021AttestationFormat\022\"\n\036ATTE"
          + "STATION_FORMAT_UNSPECIFIED\020\000\022\030\n\024CAVIUM_V"
          + "1_COMPRESSED\020\003\022\030\n\024CAVIUM_V2_COMPRESSED\020\004"
          + "\"\207\r\n\020CryptoKeyVersion\022\021\n\004name\030\001 \001(\tB\003\340A\003"
          + "\022J\n\005state\030\003 \001(\0162;.google.cloud.kms.v1.Cr"
          + "yptoKeyVersion.CryptoKeyVersionState\022C\n\020"
          + "protection_level\030\007 \001(\0162$.google.cloud.km"
          + "s.v1.ProtectionLevelB\003\340A\003\022W\n\talgorithm\030\n"
          + " \001(\0162?.google.cloud.kms.v1.CryptoKeyVers"
          + "ion.CryptoKeyVersionAlgorithmB\003\340A\003\022F\n\013at"
          + "testation\030\010 \001(\0132,.google.cloud.kms.v1.Ke"
          + "yOperationAttestationB\003\340A\003\0224\n\013create_tim"
          + "e\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003"
          + "\0226\n\rgenerate_time\030\013 \001(\0132\032.google.protobu"
          + "f.TimestampB\003\340A\003\0225\n\014destroy_time\030\005 \001(\0132\032"
          + ".google.protobuf.TimestampB\003\340A\003\022;\n\022destr"
          + "oy_event_time\030\006 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\003\340A\003\022\027\n\nimport_job\030\016 \001(\tB\003\340A\003\0224\n"
          + "\013import_time\030\017 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\022\"\n\025import_failure_reason\030\020 \001"
          + "(\tB\003\340A\003\"\234\004\n\031CryptoKeyVersionAlgorithm\022,\n"
          + "(CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIE"
          + "D\020\000\022\037\n\033GOOGLE_SYMMETRIC_ENCRYPTION\020\001\022\034\n\030"
          + "RSA_SIGN_PSS_2048_SHA256\020\002\022\034\n\030RSA_SIGN_P"
          + "SS_3072_SHA256\020\003\022\034\n\030RSA_SIGN_PSS_4096_SH"
          + "A256\020\004\022\034\n\030RSA_SIGN_PSS_4096_SHA512\020\017\022\036\n\032"
          + "RSA_SIGN_PKCS1_2048_SHA256\020\005\022\036\n\032RSA_SIGN"
          + "_PKCS1_3072_SHA256\020\006\022\036\n\032RSA_SIGN_PKCS1_4"
          + "096_SHA256\020\007\022\036\n\032RSA_SIGN_PKCS1_4096_SHA5"
          + "12\020\020\022 \n\034RSA_DECRYPT_OAEP_2048_SHA256\020\010\022 "
          + "\n\034RSA_DECRYPT_OAEP_3072_SHA256\020\t\022 \n\034RSA_"
          + "DECRYPT_OAEP_4096_SHA256\020\n\022 \n\034RSA_DECRYP"
          + "T_OAEP_4096_SHA512\020\021\022\027\n\023EC_SIGN_P256_SHA"
          + "256\020\014\022\027\n\023EC_SIGN_P384_SHA384\020\r\"\301\001\n\025Crypt"
          + "oKeyVersionState\022(\n$CRYPTO_KEY_VERSION_S"
          + "TATE_UNSPECIFIED\020\000\022\026\n\022PENDING_GENERATION"
          + "\020\005\022\013\n\007ENABLED\020\001\022\014\n\010DISABLED\020\002\022\r\n\tDESTROY"
          + "ED\020\003\022\025\n\021DESTROY_SCHEDULED\020\004\022\022\n\016PENDING_I"
          + "MPORT\020\006\022\021\n\rIMPORT_FAILED\020\007\"I\n\024CryptoKeyV"
          + "ersionView\022\'\n#CRYPTO_KEY_VERSION_VIEW_UN"
          + "SPECIFIED\020\000\022\010\n\004FULL\020\001:\252\001\352A\246\001\n(cloudkms.g"
          + "oogleapis.com/CryptoKeyVersion\022zprojects"
          + "/{project}/locations/{location}/keyRings"
          + "/{key_ring}/cryptoKeys/{crypto_key}/cryp"
          + "toKeyVersions/{crypto_key_version}\"l\n\tPu"
          + "blicKey\022\013\n\003pem\030\001 \001(\t\022R\n\talgorithm\030\002 \001(\0162"
          + "?.google.cloud.kms.v1.CryptoKeyVersion.C"
          + "ryptoKeyVersionAlgorithm\"\333\007\n\tImportJob\022\021"
          + "\n\004name\030\001 \001(\tB\003\340A\003\022J\n\rimport_method\030\002 \001(\016"
          + "2+.google.cloud.kms.v1.ImportJob.ImportM"
          + "ethodB\006\340A\002\340A\005\022F\n\020protection_level\030\t \001(\0162"
          + "$.google.cloud.kms.v1.ProtectionLevelB\006\340"
          + "A\002\340A\005\0224\n\013create_time\030\003 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\0226\n\rgenerate_time\030\004 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013e"
          + "xpire_time\030\005 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022:\n\021expire_event_time\030\n \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003\022A\n\005state\030\006"
          + " \001(\0162-.google.cloud.kms.v1.ImportJob.Imp"
          + "ortJobStateB\003\340A\003\022I\n\npublic_key\030\007 \001(\01320.g"
          + "oogle.cloud.kms.v1.ImportJob.WrappingPub"
          + "licKeyB\003\340A\003\022F\n\013attestation\030\010 \001(\0132,.googl"
          + "e.cloud.kms.v1.KeyOperationAttestationB\003"
          + "\340A\003\032 \n\021WrappingPublicKey\022\013\n\003pem\030\001 \001(\t\"m\n"
          + "\014ImportMethod\022\035\n\031IMPORT_METHOD_UNSPECIFI"
          + "ED\020\000\022\036\n\032RSA_OAEP_3072_SHA1_AES_256\020\001\022\036\n\032"
          + "RSA_OAEP_4096_SHA1_AES_256\020\002\"c\n\016ImportJo"
          + "bState\022 \n\034IMPORT_JOB_STATE_UNSPECIFIED\020\000"
          + "\022\026\n\022PENDING_GENERATION\020\001\022\n\n\006ACTIVE\020\002\022\013\n\007"
          + "EXPIRED\020\003:{\352Ax\n!cloudkms.googleapis.com/"
          + "ImportJob\022Sprojects/{project}/locations/"
          + "{location}/keyRings/{key_ring}/importJob"
          + "s/{import_job}*X\n\017ProtectionLevel\022 \n\034PRO"
          + "TECTION_LEVEL_UNSPECIFIED\020\000\022\014\n\010SOFTWARE\020"
          + "\001\022\007\n\003HSM\020\002\022\014\n\010EXTERNAL\020\003B\231\002\n\027com.google."
          + "cloud.kms.v1B\021KmsResourcesProtoP\001Z6googl"
          + "e.golang.org/genproto/googleapis/cloud/k"
          + "ms/v1;kms\370\001\001\252\002\023Google.Cloud.Kms.V1\312\002\023Goo"
          + "gle\\Cloud\\Kms\\V1\352A\200\001\n!cloudkms.googleapi"
          + "s.com/CryptoKey\022[projects/{project}/loca"
          + "tions/{location}/keyRings/{key_ring}/cry"
          + "ptoKeys/{crypto_key_path=**}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_kms_v1_KeyRing_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_kms_v1_KeyRing_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_KeyRing_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime",
            });
    internal_static_google_cloud_kms_v1_CryptoKey_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_kms_v1_CryptoKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKey_descriptor,
            new java.lang.String[] {
              "Name",
              "Primary",
              "Purpose",
              "CreateTime",
              "NextRotationTime",
              "RotationPeriod",
              "VersionTemplate",
              "Labels",
              "RotationSchedule",
            });
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor =
        internal_static_google_cloud_kms_v1_CryptoKey_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor,
            new java.lang.String[] {
              "ProtectionLevel", "Algorithm",
            });
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor,
            new java.lang.String[] {
              "Format", "Content",
            });
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor,
            new java.lang.String[] {
              "Name",
              "State",
              "ProtectionLevel",
              "Algorithm",
              "Attestation",
              "CreateTime",
              "GenerateTime",
              "DestroyTime",
              "DestroyEventTime",
              "ImportJob",
              "ImportTime",
              "ImportFailureReason",
            });
    internal_static_google_cloud_kms_v1_PublicKey_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_kms_v1_PublicKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_PublicKey_descriptor,
            new java.lang.String[] {
              "Pem", "Algorithm",
            });
    internal_static_google_cloud_kms_v1_ImportJob_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_kms_v1_ImportJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_ImportJob_descriptor,
            new java.lang.String[] {
              "Name",
              "ImportMethod",
              "ProtectionLevel",
              "CreateTime",
              "GenerateTime",
              "ExpireTime",
              "ExpireEventTime",
              "State",
              "PublicKey",
              "Attestation",
            });
    internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor =
        internal_static_google_cloud_kms_v1_ImportJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor,
            new java.lang.String[] {
              "Pem",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
