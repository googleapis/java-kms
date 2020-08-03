/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kms;

// [START kms_create_key_asymmetric_sign]
import com.google.cloud.kms.v1.CryptoKey;
import com.google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose;
import com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm;
import com.google.cloud.kms.v1.CryptoKeyVersionTemplate;
import com.google.cloud.kms.v1.KeyManagementServiceClient;
import com.google.cloud.kms.v1.KeyRingName;
import java.io.IOException;

public class CreateKeyAsymmetricSign {

  public void createKeyAsymmetricSign() throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "your-project-id";
    String locationId = "us-east1";
    String keyRingId = "my-key-ring";
    String id = "my-asymmetric-signing-key";
    createKeyAsymmetricSign(projectId, locationId, keyRingId, id);
  }

  // Create a new asymmetric key for the purpose of signing and verifying data.
  public void createKeyAsymmetricSign(
      String projectId, String locationId, String keyRingId, String id) throws IOException {
    // Initialize client that will be used to send requests. This client only
    // needs to be created once, and can be reused for multiple requests. After
    // completing all of your requests, call the "close" method on the client to
    // safely clean up any remaining background resources.
    try (KeyManagementServiceClient client = KeyManagementServiceClient.create()) {
      // Build the parent name from the project, location, and key ring.
      KeyRingName keyRingName = KeyRingName.of(projectId, locationId, keyRingId);

      // Build the asymmetric key to create.
      CryptoKey key =
          CryptoKey.newBuilder()
              .setPurpose(CryptoKeyPurpose.ASYMMETRIC_SIGN)
              .setVersionTemplate(
                  CryptoKeyVersionTemplate.newBuilder()
                      .setAlgorithm(CryptoKeyVersionAlgorithm.RSA_SIGN_PKCS1_2048_SHA256))
              .build();

      // Create the key.
      CryptoKey createdKey = client.createCryptoKey(keyRingName, id, key);
      System.out.printf("Created asymmetric key %s%n", createdKey.getName());
    }
  }
}
// [END kms_create_key_asymmetric_sign]
