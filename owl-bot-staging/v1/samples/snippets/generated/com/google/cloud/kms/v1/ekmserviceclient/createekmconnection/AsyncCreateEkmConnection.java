/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.kms.v1.samples;

// [START kms_v1_generated_ekmserviceclient_createekmconnection_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.kms.v1.CreateEkmConnectionRequest;
import com.google.cloud.kms.v1.EkmConnection;
import com.google.cloud.kms.v1.EkmServiceClient;
import com.google.cloud.kms.v1.LocationName;

public class AsyncCreateEkmConnection {

  public static void main(String[] args) throws Exception {
    asyncCreateEkmConnection();
  }

  public static void asyncCreateEkmConnection() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (EkmServiceClient ekmServiceClient = EkmServiceClient.create()) {
      CreateEkmConnectionRequest request =
          CreateEkmConnectionRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setEkmConnectionId("ekmConnectionId-445017408")
              .setEkmConnection(EkmConnection.newBuilder().build())
              .build();
      ApiFuture<EkmConnection> future =
          ekmServiceClient.createEkmConnectionCallable().futureCall(request);
      // Do something.
      EkmConnection response = future.get();
    }
  }
}
// [END kms_v1_generated_ekmserviceclient_createekmconnection_async]
