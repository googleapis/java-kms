/*
 * Copyright 2021 Google LLC
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

package com.google.cloud.kms.v1.stub;

import static com.google.cloud.kms.v1.EkmServiceClient.ListEkmConnectionsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.kms.v1.CreateEkmConnectionRequest;
import com.google.cloud.kms.v1.EkmConnection;
import com.google.cloud.kms.v1.GetEkmConnectionRequest;
import com.google.cloud.kms.v1.ListEkmConnectionsRequest;
import com.google.cloud.kms.v1.ListEkmConnectionsResponse;
import com.google.cloud.kms.v1.UpdateEkmConnectionRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link EkmServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (cloudkms.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getEkmConnection to 30 seconds:
 *
 * <pre>{@code
 * EkmServiceStubSettings.Builder ekmServiceSettingsBuilder = EkmServiceStubSettings.newBuilder();
 * ekmServiceSettingsBuilder
 *     .getEkmConnectionSettings()
 *     .setRetrySettings(
 *         ekmServiceSettingsBuilder
 *             .getEkmConnectionSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * EkmServiceStubSettings ekmServiceSettings = ekmServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class EkmServiceStubSettings extends StubSettings<EkmServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/cloudkms")
          .build();

  private final PagedCallSettings<
          ListEkmConnectionsRequest, ListEkmConnectionsResponse, ListEkmConnectionsPagedResponse>
      listEkmConnectionsSettings;
  private final UnaryCallSettings<GetEkmConnectionRequest, EkmConnection> getEkmConnectionSettings;
  private final UnaryCallSettings<CreateEkmConnectionRequest, EkmConnection>
      createEkmConnectionSettings;
  private final UnaryCallSettings<UpdateEkmConnectionRequest, EkmConnection>
      updateEkmConnectionSettings;
  private final UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings;
  private final UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings;
  private final UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings;

  private static final PagedListDescriptor<
          ListEkmConnectionsRequest, ListEkmConnectionsResponse, EkmConnection>
      LIST_EKM_CONNECTIONS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListEkmConnectionsRequest, ListEkmConnectionsResponse, EkmConnection>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListEkmConnectionsRequest injectToken(
                ListEkmConnectionsRequest payload, String token) {
              return ListEkmConnectionsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListEkmConnectionsRequest injectPageSize(
                ListEkmConnectionsRequest payload, int pageSize) {
              return ListEkmConnectionsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListEkmConnectionsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListEkmConnectionsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<EkmConnection> extractResources(ListEkmConnectionsResponse payload) {
              return payload.getEkmConnectionsList() == null
                  ? ImmutableList.<EkmConnection>of()
                  : payload.getEkmConnectionsList();
            }
          };

  private static final PagedListResponseFactory<
          ListEkmConnectionsRequest, ListEkmConnectionsResponse, ListEkmConnectionsPagedResponse>
      LIST_EKM_CONNECTIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListEkmConnectionsRequest, ListEkmConnectionsResponse,
              ListEkmConnectionsPagedResponse>() {
            @Override
            public ApiFuture<ListEkmConnectionsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListEkmConnectionsRequest, ListEkmConnectionsResponse> callable,
                ListEkmConnectionsRequest request,
                ApiCallContext context,
                ApiFuture<ListEkmConnectionsResponse> futureResponse) {
              PageContext<ListEkmConnectionsRequest, ListEkmConnectionsResponse, EkmConnection>
                  pageContext =
                      PageContext.create(
                          callable, LIST_EKM_CONNECTIONS_PAGE_STR_DESC, request, context);
              return ListEkmConnectionsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listEkmConnections. */
  public PagedCallSettings<
          ListEkmConnectionsRequest, ListEkmConnectionsResponse, ListEkmConnectionsPagedResponse>
      listEkmConnectionsSettings() {
    return listEkmConnectionsSettings;
  }

  /** Returns the object with the settings used for calls to getEkmConnection. */
  public UnaryCallSettings<GetEkmConnectionRequest, EkmConnection> getEkmConnectionSettings() {
    return getEkmConnectionSettings;
  }

  /** Returns the object with the settings used for calls to createEkmConnection. */
  public UnaryCallSettings<CreateEkmConnectionRequest, EkmConnection>
      createEkmConnectionSettings() {
    return createEkmConnectionSettings;
  }

  /** Returns the object with the settings used for calls to updateEkmConnection. */
  public UnaryCallSettings<UpdateEkmConnectionRequest, EkmConnection>
      updateEkmConnectionSettings() {
    return updateEkmConnectionSettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public EkmServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcEkmServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "cloudkms.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "cloudkms.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(EkmServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected EkmServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listEkmConnectionsSettings = settingsBuilder.listEkmConnectionsSettings().build();
    getEkmConnectionSettings = settingsBuilder.getEkmConnectionSettings().build();
    createEkmConnectionSettings = settingsBuilder.createEkmConnectionSettings().build();
    updateEkmConnectionSettings = settingsBuilder.updateEkmConnectionSettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
  }

  /** Builder for EkmServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<EkmServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListEkmConnectionsRequest, ListEkmConnectionsResponse, ListEkmConnectionsPagedResponse>
        listEkmConnectionsSettings;
    private final UnaryCallSettings.Builder<GetEkmConnectionRequest, EkmConnection>
        getEkmConnectionSettings;
    private final UnaryCallSettings.Builder<CreateEkmConnectionRequest, EkmConnection>
        createEkmConnectionSettings;
    private final UnaryCallSettings.Builder<UpdateEkmConnectionRequest, EkmConnection>
        updateEkmConnectionSettings;
    private final UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings;
    private final UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings;
    private final UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_1_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.DEADLINE_EXCEEDED)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_1_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listEkmConnectionsSettings = PagedCallSettings.newBuilder(LIST_EKM_CONNECTIONS_PAGE_STR_FACT);
      getEkmConnectionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createEkmConnectionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateEkmConnectionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      testIamPermissionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listEkmConnectionsSettings,
              getEkmConnectionSettings,
              createEkmConnectionSettings,
              updateEkmConnectionSettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
      initDefaults(this);
    }

    protected Builder(EkmServiceStubSettings settings) {
      super(settings);

      listEkmConnectionsSettings = settings.listEkmConnectionsSettings.toBuilder();
      getEkmConnectionSettings = settings.getEkmConnectionSettings.toBuilder();
      createEkmConnectionSettings = settings.createEkmConnectionSettings.toBuilder();
      updateEkmConnectionSettings = settings.updateEkmConnectionSettings.toBuilder();
      setIamPolicySettings = settings.setIamPolicySettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      testIamPermissionsSettings = settings.testIamPermissionsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listEkmConnectionsSettings,
              getEkmConnectionSettings,
              createEkmConnectionSettings,
              updateEkmConnectionSettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .listEkmConnectionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .getEkmConnectionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .createEkmConnectionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .updateEkmConnectionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .setIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .getIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .testIamPermissionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to listEkmConnections. */
    public PagedCallSettings.Builder<
            ListEkmConnectionsRequest, ListEkmConnectionsResponse, ListEkmConnectionsPagedResponse>
        listEkmConnectionsSettings() {
      return listEkmConnectionsSettings;
    }

    /** Returns the builder for the settings used for calls to getEkmConnection. */
    public UnaryCallSettings.Builder<GetEkmConnectionRequest, EkmConnection>
        getEkmConnectionSettings() {
      return getEkmConnectionSettings;
    }

    /** Returns the builder for the settings used for calls to createEkmConnection. */
    public UnaryCallSettings.Builder<CreateEkmConnectionRequest, EkmConnection>
        createEkmConnectionSettings() {
      return createEkmConnectionSettings;
    }

    /** Returns the builder for the settings used for calls to updateEkmConnection. */
    public UnaryCallSettings.Builder<UpdateEkmConnectionRequest, EkmConnection>
        updateEkmConnectionSettings() {
      return updateEkmConnectionSettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    @Override
    public EkmServiceStubSettings build() throws IOException {
      return new EkmServiceStubSettings(this);
    }
  }
}
