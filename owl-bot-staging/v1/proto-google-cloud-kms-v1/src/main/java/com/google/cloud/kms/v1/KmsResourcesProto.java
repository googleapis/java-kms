// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

public final class KmsResourcesProto {
  private KmsResourcesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_KeyRing_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyRing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_CryptoKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKeyVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_PublicKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_PublicKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_ImportJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ImportJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/kms/v1/resources.proto\022\023g" +
      "oogle.cloud.kms.v1\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\032\036" +
      "google/protobuf/duration.proto\032\037google/p" +
      "rotobuf/timestamp.proto\032\036google/protobuf" +
      "/wrappers.proto\"\265\001\n\007KeyRing\022\021\n\004name\030\001 \001(" +
      "\tB\003\340A\003\0224\n\013create_time\030\002 \001(\0132\032.google.pro" +
      "tobuf.TimestampB\003\340A\003:a\352A^\n\037cloudkms.goog" +
      "leapis.com/KeyRing\022;projects/{project}/l" +
      "ocations/{location}/keyRings/{key_ring}\"" +
      "\225\007\n\tCryptoKey\022\021\n\004name\030\001 \001(\tB\003\340A\003\022;\n\007prim" +
      "ary\030\002 \001(\0132%.google.cloud.kms.v1.CryptoKe" +
      "yVersionB\003\340A\003\022E\n\007purpose\030\003 \001(\0162/.google." +
      "cloud.kms.v1.CryptoKey.CryptoKeyPurposeB" +
      "\003\340A\005\0224\n\013create_time\030\005 \001(\0132\032.google.proto" +
      "buf.TimestampB\003\340A\003\0226\n\022next_rotation_time" +
      "\030\007 \001(\0132\032.google.protobuf.Timestamp\0224\n\017ro" +
      "tation_period\030\010 \001(\0132\031.google.protobuf.Du" +
      "rationH\000\022G\n\020version_template\030\013 \001(\0132-.goo" +
      "gle.cloud.kms.v1.CryptoKeyVersionTemplat" +
      "e\022:\n\006labels\030\n \003(\0132*.google.cloud.kms.v1." +
      "CryptoKey.LabelsEntry\022\030\n\013import_only\030\r \001" +
      "(\010B\003\340A\005\022B\n\032destroy_scheduled_duration\030\016 " +
      "\001(\0132\031.google.protobuf.DurationB\003\340A\005\022%\n\022c" +
      "rypto_key_backend\030\017 \001(\tB\t\340A\005\372A\003\n\001*\032-\n\013La" +
      "belsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001\"\201\001\n\020CryptoKeyPurpose\022\"\n\036CRYPTO_KEY_PUR" +
      "POSE_UNSPECIFIED\020\000\022\023\n\017ENCRYPT_DECRYPT\020\001\022" +
      "\023\n\017ASYMMETRIC_SIGN\020\005\022\026\n\022ASYMMETRIC_DECRY" +
      "PT\020\006\022\007\n\003MAC\020\t:{\352Ax\n!cloudkms.googleapis." +
      "com/CryptoKey\022Sprojects/{project}/locati" +
      "ons/{location}/keyRings/{key_ring}/crypt" +
      "oKeys/{crypto_key}B\023\n\021rotation_schedule\"" +
      "\263\001\n\030CryptoKeyVersionTemplate\022>\n\020protecti" +
      "on_level\030\001 \001(\0162$.google.cloud.kms.v1.Pro" +
      "tectionLevel\022W\n\talgorithm\030\003 \001(\0162?.google" +
      ".cloud.kms.v1.CryptoKeyVersion.CryptoKey" +
      "VersionAlgorithmB\003\340A\002\"\261\003\n\027KeyOperationAt" +
      "testation\022S\n\006format\030\004 \001(\0162>.google.cloud" +
      ".kms.v1.KeyOperationAttestation.Attestat" +
      "ionFormatB\003\340A\003\022\024\n\007content\030\005 \001(\014B\003\340A\003\022X\n\013" +
      "cert_chains\030\006 \001(\0132>.google.cloud.kms.v1." +
      "KeyOperationAttestation.CertificateChain" +
      "sB\003\340A\003\032d\n\021CertificateChains\022\024\n\014cavium_ce" +
      "rts\030\001 \003(\t\022\031\n\021google_card_certs\030\002 \003(\t\022\036\n\026" +
      "google_partition_certs\030\003 \003(\t\"k\n\021Attestat" +
      "ionFormat\022\"\n\036ATTESTATION_FORMAT_UNSPECIF" +
      "IED\020\000\022\030\n\024CAVIUM_V1_COMPRESSED\020\003\022\030\n\024CAVIU" +
      "M_V2_COMPRESSED\020\004\"\322\020\n\020CryptoKeyVersion\022\021" +
      "\n\004name\030\001 \001(\tB\003\340A\003\022J\n\005state\030\003 \001(\0162;.googl" +
      "e.cloud.kms.v1.CryptoKeyVersion.CryptoKe" +
      "yVersionState\022C\n\020protection_level\030\007 \001(\0162" +
      "$.google.cloud.kms.v1.ProtectionLevelB\003\340" +
      "A\003\022W\n\talgorithm\030\n \001(\0162?.google.cloud.kms" +
      ".v1.CryptoKeyVersion.CryptoKeyVersionAlg" +
      "orithmB\003\340A\003\022F\n\013attestation\030\010 \001(\0132,.googl" +
      "e.cloud.kms.v1.KeyOperationAttestationB\003" +
      "\340A\003\0224\n\013create_time\030\004 \001(\0132\032.google.protob" +
      "uf.TimestampB\003\340A\003\0226\n\rgenerate_time\030\013 \001(\013" +
      "2\032.google.protobuf.TimestampB\003\340A\003\0225\n\014des" +
      "troy_time\030\005 \001(\0132\032.google.protobuf.Timest" +
      "ampB\003\340A\003\022;\n\022destroy_event_time\030\006 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\003\340A\003\022\027\n\nimport_" +
      "job\030\016 \001(\tB\003\340A\003\0224\n\013import_time\030\017 \001(\0132\032.go" +
      "ogle.protobuf.TimestampB\003\340A\003\022\"\n\025import_f" +
      "ailure_reason\030\020 \001(\tB\003\340A\003\022^\n!external_pro" +
      "tection_level_options\030\021 \001(\01323.google.clo" +
      "ud.kms.v1.ExternalProtectionLevelOptions" +
      "\022\036\n\021reimport_eligible\030\022 \001(\010B\003\340A\003\"\347\006\n\031Cry" +
      "ptoKeyVersionAlgorithm\022,\n(CRYPTO_KEY_VER" +
      "SION_ALGORITHM_UNSPECIFIED\020\000\022\037\n\033GOOGLE_S" +
      "YMMETRIC_ENCRYPTION\020\001\022\034\n\030RSA_SIGN_PSS_20" +
      "48_SHA256\020\002\022\034\n\030RSA_SIGN_PSS_3072_SHA256\020" +
      "\003\022\034\n\030RSA_SIGN_PSS_4096_SHA256\020\004\022\034\n\030RSA_S" +
      "IGN_PSS_4096_SHA512\020\017\022\036\n\032RSA_SIGN_PKCS1_" +
      "2048_SHA256\020\005\022\036\n\032RSA_SIGN_PKCS1_3072_SHA" +
      "256\020\006\022\036\n\032RSA_SIGN_PKCS1_4096_SHA256\020\007\022\036\n" +
      "\032RSA_SIGN_PKCS1_4096_SHA512\020\020\022\033\n\027RSA_SIG" +
      "N_RAW_PKCS1_2048\020\034\022\033\n\027RSA_SIGN_RAW_PKCS1" +
      "_3072\020\035\022\033\n\027RSA_SIGN_RAW_PKCS1_4096\020\036\022 \n\034" +
      "RSA_DECRYPT_OAEP_2048_SHA256\020\010\022 \n\034RSA_DE" +
      "CRYPT_OAEP_3072_SHA256\020\t\022 \n\034RSA_DECRYPT_" +
      "OAEP_4096_SHA256\020\n\022 \n\034RSA_DECRYPT_OAEP_4" +
      "096_SHA512\020\021\022\036\n\032RSA_DECRYPT_OAEP_2048_SH" +
      "A1\020%\022\036\n\032RSA_DECRYPT_OAEP_3072_SHA1\020&\022\036\n\032" +
      "RSA_DECRYPT_OAEP_4096_SHA1\020\'\022\027\n\023EC_SIGN_" +
      "P256_SHA256\020\014\022\027\n\023EC_SIGN_P384_SHA384\020\r\022\034" +
      "\n\030EC_SIGN_SECP256K1_SHA256\020\037\022\017\n\013HMAC_SHA" +
      "256\020 \022\r\n\tHMAC_SHA1\020!\022\017\n\013HMAC_SHA384\020\"\022\017\n" +
      "\013HMAC_SHA512\020#\022\017\n\013HMAC_SHA224\020$\022!\n\035EXTER" +
      "NAL_SYMMETRIC_ENCRYPTION\020\022\"\301\001\n\025CryptoKey" +
      "VersionState\022(\n$CRYPTO_KEY_VERSION_STATE" +
      "_UNSPECIFIED\020\000\022\026\n\022PENDING_GENERATION\020\005\022\013" +
      "\n\007ENABLED\020\001\022\014\n\010DISABLED\020\002\022\r\n\tDESTROYED\020\003" +
      "\022\025\n\021DESTROY_SCHEDULED\020\004\022\022\n\016PENDING_IMPOR" +
      "T\020\006\022\021\n\rIMPORT_FAILED\020\007\"I\n\024CryptoKeyVersi" +
      "onView\022\'\n#CRYPTO_KEY_VERSION_VIEW_UNSPEC" +
      "IFIED\020\000\022\010\n\004FULL\020\001:\252\001\352A\246\001\n(cloudkms.googl" +
      "eapis.com/CryptoKeyVersion\022zprojects/{pr" +
      "oject}/locations/{location}/keyRings/{ke" +
      "y_ring}/cryptoKeys/{crypto_key}/cryptoKe" +
      "yVersions/{crypto_key_version}\"\234\003\n\tPubli" +
      "cKey\022\013\n\003pem\030\001 \001(\t\022R\n\talgorithm\030\002 \001(\0162?.g" +
      "oogle.cloud.kms.v1.CryptoKeyVersion.Cryp" +
      "toKeyVersionAlgorithm\022/\n\npem_crc32c\030\003 \001(" +
      "\0132\033.google.protobuf.Int64Value\022\014\n\004name\030\004" +
      " \001(\t\022>\n\020protection_level\030\005 \001(\0162$.google." +
      "cloud.kms.v1.ProtectionLevel:\256\001\352A\252\001\n!clo" +
      "udkms.googleapis.com/PublicKey\022\204\001project" +
      "s/{project}/locations/{location}/keyRing" +
      "s/{key_ring}/cryptoKeys/{crypto_key}/cry" +
      "ptoKeyVersions/{crypto_key_version}/publ" +
      "icKey\"\333\007\n\tImportJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022J" +
      "\n\rimport_method\030\002 \001(\0162+.google.cloud.kms" +
      ".v1.ImportJob.ImportMethodB\006\340A\002\340A\005\022F\n\020pr" +
      "otection_level\030\t \001(\0162$.google.cloud.kms." +
      "v1.ProtectionLevelB\006\340A\002\340A\005\0224\n\013create_tim" +
      "e\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003" +
      "\0226\n\rgenerate_time\030\004 \001(\0132\032.google.protobu" +
      "f.TimestampB\003\340A\003\0224\n\013expire_time\030\005 \001(\0132\032." +
      "google.protobuf.TimestampB\003\340A\003\022:\n\021expire" +
      "_event_time\030\n \001(\0132\032.google.protobuf.Time" +
      "stampB\003\340A\003\022A\n\005state\030\006 \001(\0162-.google.cloud" +
      ".kms.v1.ImportJob.ImportJobStateB\003\340A\003\022I\n" +
      "\npublic_key\030\007 \001(\01320.google.cloud.kms.v1." +
      "ImportJob.WrappingPublicKeyB\003\340A\003\022F\n\013atte" +
      "station\030\010 \001(\0132,.google.cloud.kms.v1.KeyO" +
      "perationAttestationB\003\340A\003\032 \n\021WrappingPubl" +
      "icKey\022\013\n\003pem\030\001 \001(\t\"m\n\014ImportMethod\022\035\n\031IM" +
      "PORT_METHOD_UNSPECIFIED\020\000\022\036\n\032RSA_OAEP_30" +
      "72_SHA1_AES_256\020\001\022\036\n\032RSA_OAEP_4096_SHA1_" +
      "AES_256\020\002\"c\n\016ImportJobState\022 \n\034IMPORT_JO" +
      "B_STATE_UNSPECIFIED\020\000\022\026\n\022PENDING_GENERAT" +
      "ION\020\001\022\n\n\006ACTIVE\020\002\022\013\n\007EXPIRED\020\003:{\352Ax\n!clo" +
      "udkms.googleapis.com/ImportJob\022Sprojects" +
      "/{project}/locations/{location}/keyRings" +
      "/{key_ring}/importJobs/{import_job}\"[\n\036E" +
      "xternalProtectionLevelOptions\022\030\n\020externa" +
      "l_key_uri\030\001 \001(\t\022\037\n\027ekm_connection_key_pa" +
      "th\030\002 \001(\t*j\n\017ProtectionLevel\022 \n\034PROTECTIO" +
      "N_LEVEL_UNSPECIFIED\020\000\022\014\n\010SOFTWARE\020\001\022\007\n\003H" +
      "SM\020\002\022\014\n\010EXTERNAL\020\003\022\020\n\014EXTERNAL_VPC\020\004B\225\001\n" +
      "\027com.google.cloud.kms.v1B\021KmsResourcesPr" +
      "otoP\001Z6google.golang.org/genproto/google" +
      "apis/cloud/kms/v1;kms\370\001\001\252\002\023Google.Cloud." +
      "Kms.V1\312\002\023Google\\Cloud\\Kms\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_google_cloud_kms_v1_KeyRing_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_kms_v1_KeyRing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_KeyRing_descriptor,
        new java.lang.String[] { "Name", "CreateTime", });
    internal_static_google_cloud_kms_v1_CryptoKey_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_kms_v1_CryptoKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_CryptoKey_descriptor,
        new java.lang.String[] { "Name", "Primary", "Purpose", "CreateTime", "NextRotationTime", "RotationPeriod", "VersionTemplate", "Labels", "ImportOnly", "DestroyScheduledDuration", "CryptoKeyBackend", "RotationSchedule", });
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor =
      internal_static_google_cloud_kms_v1_CryptoKey_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor,
        new java.lang.String[] { "ProtectionLevel", "Algorithm", });
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor,
        new java.lang.String[] { "Format", "Content", "CertChains", });
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_descriptor =
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_descriptor,
        new java.lang.String[] { "CaviumCerts", "GoogleCardCerts", "GooglePartitionCerts", });
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor,
        new java.lang.String[] { "Name", "State", "ProtectionLevel", "Algorithm", "Attestation", "CreateTime", "GenerateTime", "DestroyTime", "DestroyEventTime", "ImportJob", "ImportTime", "ImportFailureReason", "ExternalProtectionLevelOptions", "ReimportEligible", });
    internal_static_google_cloud_kms_v1_PublicKey_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_kms_v1_PublicKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_PublicKey_descriptor,
        new java.lang.String[] { "Pem", "Algorithm", "PemCrc32C", "Name", "ProtectionLevel", });
    internal_static_google_cloud_kms_v1_ImportJob_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_kms_v1_ImportJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_ImportJob_descriptor,
        new java.lang.String[] { "Name", "ImportMethod", "ProtectionLevel", "CreateTime", "GenerateTime", "ExpireTime", "ExpireEventTime", "State", "PublicKey", "Attestation", });
    internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor =
      internal_static_google_cloud_kms_v1_ImportJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor,
        new java.lang.String[] { "Pem", });
    internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_descriptor,
        new java.lang.String[] { "ExternalKeyUri", "EkmConnectionKeyPath", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
