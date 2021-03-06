/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.services.glue.AWSGlueClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.services.glue.model.transform.*;

/**
 * Client for accessing AWS Glue. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS Glue</fullname>
 * <p>
 * Defines the public endpoint for the AWS Glue service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGlueClient extends AmazonWebServiceClient implements AWSGlue {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSGlue.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "glue";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.glue.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SchedulerRunningException").withModeledClass(
                                    com.amazonaws.services.glue.model.SchedulerRunningException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SchedulerTransitioningException").withModeledClass(
                                    com.amazonaws.services.glue.model.SchedulerTransitioningException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("VersionMismatchException").withModeledClass(
                                    com.amazonaws.services.glue.model.VersionMismatchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoScheduleException").withModeledClass(
                                    com.amazonaws.services.glue.model.NoScheduleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.glue.model.AlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CrawlerRunningException").withModeledClass(
                                    com.amazonaws.services.glue.model.CrawlerRunningException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotentParameterMismatchException").withModeledClass(
                                    com.amazonaws.services.glue.model.IdempotentParameterMismatchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withModeledClass(
                                    com.amazonaws.services.glue.model.ValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withModeledClass(
                                    com.amazonaws.services.glue.model.InternalServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentRunsExceededException").withModeledClass(
                                    com.amazonaws.services.glue.model.ConcurrentRunsExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNumberLimitExceededException").withModeledClass(
                                    com.amazonaws.services.glue.model.ResourceNumberLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SchedulerNotRunningException").withModeledClass(
                                    com.amazonaws.services.glue.model.SchedulerNotRunningException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CrawlerStoppingException").withModeledClass(
                                    com.amazonaws.services.glue.model.CrawlerStoppingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.glue.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withModeledClass(
                                    com.amazonaws.services.glue.model.InvalidInputException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CrawlerNotRunningException").withModeledClass(
                                    com.amazonaws.services.glue.model.CrawlerNotRunningException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EntityNotFoundException").withModeledClass(
                                    com.amazonaws.services.glue.model.EntityNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationTimeoutException").withModeledClass(
                                    com.amazonaws.services.glue.model.OperationTimeoutException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.glue.model.AWSGlueException.class));

    public static AWSGlueClientBuilder builder() {
        return AWSGlueClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Glue using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSGlueClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("glue.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/glue/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/glue/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchCreatePartitionRequest
     * @return Result of the BatchCreatePartition operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.BatchCreatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchCreatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchCreatePartitionResult batchCreatePartition(BatchCreatePartitionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchCreatePartition(request);
    }

    @SdkInternalApi
    final BatchCreatePartitionResult executeBatchCreatePartition(BatchCreatePartitionRequest batchCreatePartitionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchCreatePartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreatePartitionRequest> request = null;
        Response<BatchCreatePartitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreatePartitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchCreatePartitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchCreatePartitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchCreatePartitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a list of connection definitions from the Data Catalog.
     * </p>
     * 
     * @param batchDeleteConnectionRequest
     * @return Result of the BatchDeleteConnection operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.BatchDeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchDeleteConnectionResult batchDeleteConnection(BatchDeleteConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteConnection(request);
    }

    @SdkInternalApi
    final BatchDeleteConnectionResult executeBatchDeleteConnection(BatchDeleteConnectionRequest batchDeleteConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteConnectionRequest> request = null;
        Response<BatchDeleteConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeleteConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteConnectionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchDeleteConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchDeletePartitionRequest
     * @return Result of the BatchDeletePartition operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.BatchDeletePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeletePartition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchDeletePartitionResult batchDeletePartition(BatchDeletePartitionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeletePartition(request);
    }

    @SdkInternalApi
    final BatchDeletePartitionResult executeBatchDeletePartition(BatchDeletePartitionRequest batchDeletePartitionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeletePartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeletePartitionRequest> request = null;
        Response<BatchDeletePartitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeletePartitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeletePartitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeletePartitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDeletePartitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes multiple tables at once.
     * </p>
     * 
     * @param batchDeleteTableRequest
     * @return Result of the BatchDeleteTable operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.BatchDeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchDeleteTableResult batchDeleteTable(BatchDeleteTableRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteTable(request);
    }

    @SdkInternalApi
    final BatchDeleteTableResult executeBatchDeleteTable(BatchDeleteTableRequest batchDeleteTableRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteTableRequest> request = null;
        Response<BatchDeleteTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeleteTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDeleteTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves partitions in a batch request.
     * </p>
     * 
     * @param batchGetPartitionRequest
     * @return Result of the BatchGetPartition operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.BatchGetPartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetPartition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetPartitionResult batchGetPartition(BatchGetPartitionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetPartition(request);
    }

    @SdkInternalApi
    final BatchGetPartitionResult executeBatchGetPartition(BatchGetPartitionRequest batchGetPartitionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetPartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetPartitionRequest> request = null;
        Response<BatchGetPartitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetPartitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetPartitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetPartitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetPartitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a batch of job runs for a given job.
     * </p>
     * 
     * @param batchStopJobRunRequest
     * @return Result of the BatchStopJobRun operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.BatchStopJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchStopJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchStopJobRunResult batchStopJobRun(BatchStopJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeBatchStopJobRun(request);
    }

    @SdkInternalApi
    final BatchStopJobRunResult executeBatchStopJobRun(BatchStopJobRunRequest batchStopJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(batchStopJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchStopJobRunRequest> request = null;
        Response<BatchStopJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchStopJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchStopJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchStopJobRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchStopJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a classifier in the user's account. This may be either a <code>GrokClassifier</code> or an
     * <code>XMLClassifier</code>.
     * </p>
     * 
     * @param createClassifierRequest
     * @return Result of the CreateClassifier operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.CreateClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateClassifierResult createClassifier(CreateClassifierRequest request) {
        request = beforeClientExecution(request);
        return executeCreateClassifier(request);
    }

    @SdkInternalApi
    final CreateClassifierResult executeCreateClassifier(CreateClassifierRequest createClassifierRequest) {

        ExecutionContext executionContext = createExecutionContext(createClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClassifierRequest> request = null;
        Response<CreateClassifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClassifierRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createClassifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateClassifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateClassifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a connection definition in the Data Catalog.
     * </p>
     * 
     * @param createConnectionRequest
     * @return Result of the CreateConnection operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateConnection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateConnectionResult createConnection(CreateConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConnection(request);
    }

    @SdkInternalApi
    final CreateConnectionResult executeCreateConnection(CreateConnectionRequest createConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectionRequest> request = null;
        Response<CreateConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl
     * target must be specified, in either the <i>s3Targets</i> or the <i>jdbcTargets</i> field.
     * </p>
     * 
     * @param createCrawlerRequest
     * @return Result of the CreateCrawler operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @sample AWSGlue.CreateCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateCrawlerResult createCrawler(CreateCrawlerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCrawler(request);
    }

    @SdkInternalApi
    final CreateCrawlerResult executeCreateCrawler(CreateCrawlerRequest createCrawlerRequest) {

        ExecutionContext executionContext = createExecutionContext(createCrawlerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCrawlerRequest> request = null;
        Response<CreateCrawlerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCrawlerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCrawlerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCrawlerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCrawlerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new database in a Data Catalog.
     * </p>
     * 
     * @param createDatabaseRequest
     * @return Result of the CreateDatabase operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.CreateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDatabaseResult createDatabase(CreateDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDatabase(request);
    }

    @SdkInternalApi
    final CreateDatabaseResult executeCreateDatabase(CreateDatabaseRequest createDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatabaseRequest> request = null;
        Response<CreateDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DevEndpoint.
     * </p>
     * 
     * @param createDevEndpointRequest
     * @return Result of the CreateDevEndpoint operation returned by the service.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws IdempotentParameterMismatchException
     *         The same unique identifier was associated with two different records.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws ValidationException
     *         A value could not be validated.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @sample AWSGlue.CreateDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDevEndpointResult createDevEndpoint(CreateDevEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDevEndpoint(request);
    }

    @SdkInternalApi
    final CreateDevEndpointResult executeCreateDevEndpoint(CreateDevEndpointRequest createDevEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createDevEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDevEndpointRequest> request = null;
        Response<CreateDevEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDevEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDevEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDevEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDevEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new job.
     * </p>
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws IdempotentParameterMismatchException
     *         The same unique identifier was associated with two different records.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @sample AWSGlue.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateJobResult createJob(CreateJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateJob(request);
    }

    @SdkInternalApi
    final CreateJobResult executeCreateJob(CreateJobRequest createJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new partition.
     * </p>
     * 
     * @param createPartitionRequest
     * @return Result of the CreatePartition operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.CreatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePartitionResult createPartition(CreatePartitionRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePartition(request);
    }

    @SdkInternalApi
    final CreatePartitionResult executeCreatePartition(CreatePartitionRequest createPartitionRequest) {

        ExecutionContext executionContext = createExecutionContext(createPartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePartitionRequest> request = null;
        Response<CreatePartitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePartitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPartitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePartitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePartitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Transforms a directed acyclic graph (DAG) into a Python script.
     * </p>
     * 
     * @param createScriptRequest
     * @return Result of the CreateScript operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.CreateScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateScript" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateScriptResult createScript(CreateScriptRequest request) {
        request = beforeClientExecution(request);
        return executeCreateScript(request);
    }

    @SdkInternalApi
    final CreateScriptResult executeCreateScript(CreateScriptRequest createScriptRequest) {

        ExecutionContext executionContext = createExecutionContext(createScriptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateScriptRequest> request = null;
        Response<CreateScriptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateScriptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createScriptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateScriptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateScriptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new table definition in the Data Catalog.
     * </p>
     * 
     * @param createTableRequest
     * @return Result of the CreateTable operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTableResult createTable(CreateTableRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTable(request);
    }

    @SdkInternalApi
    final CreateTableResult executeCreateTable(CreateTableRequest createTableRequest) {

        ExecutionContext executionContext = createExecutionContext(createTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTableRequest> request = null;
        Response<CreateTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new trigger.
     * </p>
     * 
     * @param createTriggerRequest
     * @return Result of the CreateTrigger operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @sample AWSGlue.CreateTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTriggerResult createTrigger(CreateTriggerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTrigger(request);
    }

    @SdkInternalApi
    final CreateTriggerResult executeCreateTrigger(CreateTriggerRequest createTriggerRequest) {

        ExecutionContext executionContext = createExecutionContext(createTriggerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTriggerRequest> request = null;
        Response<CreateTriggerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTriggerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTriggerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTriggerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTriggerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new function definition in the Data Catalog.
     * </p>
     * 
     * @param createUserDefinedFunctionRequest
     * @return Result of the CreateUserDefinedFunction operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.CreateUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateUserDefinedFunctionResult createUserDefinedFunction(CreateUserDefinedFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserDefinedFunction(request);
    }

    @SdkInternalApi
    final CreateUserDefinedFunctionResult executeCreateUserDefinedFunction(CreateUserDefinedFunctionRequest createUserDefinedFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserDefinedFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserDefinedFunctionRequest> request = null;
        Response<CreateUserDefinedFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserDefinedFunctionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createUserDefinedFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserDefinedFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateUserDefinedFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a classifier from the Data Catalog.
     * </p>
     * 
     * @param deleteClassifierRequest
     * @return Result of the DeleteClassifier operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteClassifierResult deleteClassifier(DeleteClassifierRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteClassifier(request);
    }

    @SdkInternalApi
    final DeleteClassifierResult executeDeleteClassifier(DeleteClassifierRequest deleteClassifierRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClassifierRequest> request = null;
        Response<DeleteClassifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClassifierRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteClassifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteClassifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteClassifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a connection from the Data Catalog.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteConnectionResult deleteConnection(DeleteConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConnection(request);
    }

    @SdkInternalApi
    final DeleteConnectionResult executeDeleteConnection(DeleteConnectionRequest deleteConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectionRequest> request = null;
        Response<DeleteConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a specified crawler from the Data Catalog, unless the crawler state is <code>RUNNING</code>.
     * </p>
     * 
     * @param deleteCrawlerRequest
     * @return Result of the DeleteCrawler operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws CrawlerRunningException
     *         The operation cannot be performed because the crawler is already running.
     * @throws SchedulerTransitioningException
     *         The specified scheduler is transitioning.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteCrawlerResult deleteCrawler(DeleteCrawlerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCrawler(request);
    }

    @SdkInternalApi
    final DeleteCrawlerResult executeDeleteCrawler(DeleteCrawlerRequest deleteCrawlerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCrawlerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCrawlerRequest> request = null;
        Response<DeleteCrawlerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCrawlerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCrawlerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCrawlerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCrawlerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a specified Database from a Data Catalog.
     * </p>
     * 
     * @param deleteDatabaseRequest
     * @return Result of the DeleteDatabase operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDatabaseResult deleteDatabase(DeleteDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDatabase(request);
    }

    @SdkInternalApi
    final DeleteDatabaseResult executeDeleteDatabase(DeleteDatabaseRequest deleteDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatabaseRequest> request = null;
        Response<DeleteDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified DevEndpoint.
     * </p>
     * 
     * @param deleteDevEndpointRequest
     * @return Result of the DeleteDevEndpoint operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSGlue.DeleteDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDevEndpointResult deleteDevEndpoint(DeleteDevEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDevEndpoint(request);
    }

    @SdkInternalApi
    final DeleteDevEndpointResult executeDeleteDevEndpoint(DeleteDevEndpointRequest deleteDevEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDevEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDevEndpointRequest> request = null;
        Response<DeleteDevEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDevEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDevEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDevEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDevEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified job.
     * </p>
     * 
     * @param deleteJobRequest
     * @return Result of the DeleteJob operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteJobResult deleteJob(DeleteJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteJob(request);
    }

    @SdkInternalApi
    final DeleteJobResult executeDeleteJob(DeleteJobRequest deleteJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobRequest> request = null;
        Response<DeleteJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified partition.
     * </p>
     * 
     * @param deletePartitionRequest
     * @return Result of the DeletePartition operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeletePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeletePartition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePartitionResult deletePartition(DeletePartitionRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePartition(request);
    }

    @SdkInternalApi
    final DeletePartitionResult executeDeletePartition(DeletePartitionRequest deletePartitionRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePartitionRequest> request = null;
        Response<DeletePartitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePartitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePartitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePartitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePartitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a table definition from the Data Catalog.
     * </p>
     * 
     * @param deleteTableRequest
     * @return Result of the DeleteTable operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTableResult deleteTable(DeleteTableRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTable(request);
    }

    @SdkInternalApi
    final DeleteTableResult executeDeleteTable(DeleteTableRequest deleteTableRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTableRequest> request = null;
        Response<DeleteTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified trigger.
     * </p>
     * 
     * @param deleteTriggerRequest
     * @return Result of the DeleteTrigger operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTriggerResult deleteTrigger(DeleteTriggerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTrigger(request);
    }

    @SdkInternalApi
    final DeleteTriggerResult executeDeleteTrigger(DeleteTriggerRequest deleteTriggerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTriggerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTriggerRequest> request = null;
        Response<DeleteTriggerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTriggerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTriggerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTriggerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTriggerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing function definition from the Data Catalog.
     * </p>
     * 
     * @param deleteUserDefinedFunctionRequest
     * @return Result of the DeleteUserDefinedFunction operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteUserDefinedFunctionResult deleteUserDefinedFunction(DeleteUserDefinedFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserDefinedFunction(request);
    }

    @SdkInternalApi
    final DeleteUserDefinedFunctionResult executeDeleteUserDefinedFunction(DeleteUserDefinedFunctionRequest deleteUserDefinedFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserDefinedFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserDefinedFunctionRequest> request = null;
        Response<DeleteUserDefinedFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserDefinedFunctionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteUserDefinedFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserDefinedFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteUserDefinedFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the status of a migration operation.
     * </p>
     * 
     * @param getCatalogImportStatusRequest
     * @return Result of the GetCatalogImportStatus operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetCatalogImportStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCatalogImportStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCatalogImportStatusResult getCatalogImportStatus(GetCatalogImportStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetCatalogImportStatus(request);
    }

    @SdkInternalApi
    final GetCatalogImportStatusResult executeGetCatalogImportStatus(GetCatalogImportStatusRequest getCatalogImportStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getCatalogImportStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCatalogImportStatusRequest> request = null;
        Response<GetCatalogImportStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCatalogImportStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCatalogImportStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCatalogImportStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCatalogImportStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve a classifier by name.
     * </p>
     * 
     * @param getClassifierRequest
     * @return Result of the GetClassifier operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetClassifierResult getClassifier(GetClassifierRequest request) {
        request = beforeClientExecution(request);
        return executeGetClassifier(request);
    }

    @SdkInternalApi
    final GetClassifierResult executeGetClassifier(GetClassifierRequest getClassifierRequest) {

        ExecutionContext executionContext = createExecutionContext(getClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClassifierRequest> request = null;
        Response<GetClassifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClassifierRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getClassifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetClassifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetClassifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all classifier objects in the Data Catalog.
     * </p>
     * 
     * @param getClassifiersRequest
     * @return Result of the GetClassifiers operation returned by the service.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetClassifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetClassifiers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetClassifiersResult getClassifiers(GetClassifiersRequest request) {
        request = beforeClientExecution(request);
        return executeGetClassifiers(request);
    }

    @SdkInternalApi
    final GetClassifiersResult executeGetClassifiers(GetClassifiersRequest getClassifiersRequest) {

        ExecutionContext executionContext = createExecutionContext(getClassifiersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClassifiersRequest> request = null;
        Response<GetClassifiersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClassifiersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getClassifiersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetClassifiersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetClassifiersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a connection definition from the Data Catalog.
     * </p>
     * 
     * @param getConnectionRequest
     * @return Result of the GetConnection operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetConnection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetConnectionResult getConnection(GetConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetConnection(request);
    }

    @SdkInternalApi
    final GetConnectionResult executeGetConnection(GetConnectionRequest getConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectionRequest> request = null;
        Response<GetConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of connection definitions from the Data Catalog.
     * </p>
     * 
     * @param getConnectionsRequest
     * @return Result of the GetConnections operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetConnections" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetConnectionsResult getConnections(GetConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetConnections(request);
    }

    @SdkInternalApi
    final GetConnectionsResult executeGetConnections(GetConnectionsRequest getConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectionsRequest> request = null;
        Response<GetConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves metadata for a specified crawler.
     * </p>
     * 
     * @param getCrawlerRequest
     * @return Result of the GetCrawler operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCrawlerResult getCrawler(GetCrawlerRequest request) {
        request = beforeClientExecution(request);
        return executeGetCrawler(request);
    }

    @SdkInternalApi
    final GetCrawlerResult executeGetCrawler(GetCrawlerRequest getCrawlerRequest) {

        ExecutionContext executionContext = createExecutionContext(getCrawlerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCrawlerRequest> request = null;
        Response<GetCrawlerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCrawlerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCrawlerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCrawlerResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCrawlerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves metrics about specified crawlers.
     * </p>
     * 
     * @param getCrawlerMetricsRequest
     * @return Result of the GetCrawlerMetrics operation returned by the service.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetCrawlerMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawlerMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCrawlerMetricsResult getCrawlerMetrics(GetCrawlerMetricsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCrawlerMetrics(request);
    }

    @SdkInternalApi
    final GetCrawlerMetricsResult executeGetCrawlerMetrics(GetCrawlerMetricsRequest getCrawlerMetricsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCrawlerMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCrawlerMetricsRequest> request = null;
        Response<GetCrawlerMetricsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCrawlerMetricsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCrawlerMetricsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCrawlerMetricsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCrawlerMetricsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves metadata for all crawlers defined in the customer account.
     * </p>
     * 
     * @param getCrawlersRequest
     * @return Result of the GetCrawlers operation returned by the service.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetCrawlers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawlers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCrawlersResult getCrawlers(GetCrawlersRequest request) {
        request = beforeClientExecution(request);
        return executeGetCrawlers(request);
    }

    @SdkInternalApi
    final GetCrawlersResult executeGetCrawlers(GetCrawlersRequest getCrawlersRequest) {

        ExecutionContext executionContext = createExecutionContext(getCrawlersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCrawlersRequest> request = null;
        Response<GetCrawlersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCrawlersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCrawlersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCrawlersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCrawlersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the definition of a specified database.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return Result of the GetDatabase operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDatabaseResult getDatabase(GetDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeGetDatabase(request);
    }

    @SdkInternalApi
    final GetDatabaseResult executeGetDatabase(GetDatabaseRequest getDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatabaseRequest> request = null;
        Response<GetDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all Databases defined in a given Data Catalog.
     * </p>
     * 
     * @param getDatabasesRequest
     * @return Result of the GetDatabases operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDatabasesResult getDatabases(GetDatabasesRequest request) {
        request = beforeClientExecution(request);
        return executeGetDatabases(request);
    }

    @SdkInternalApi
    final GetDatabasesResult executeGetDatabases(GetDatabasesRequest getDatabasesRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatabasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatabasesRequest> request = null;
        Response<GetDatabasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatabasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDatabasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatabasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDatabasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Transforms a Python script into a directed acyclic graph (DAG).
     * </p>
     * 
     * @param getDataflowGraphRequest
     * @return Result of the GetDataflowGraph operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetDataflowGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataflowGraph" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDataflowGraphResult getDataflowGraph(GetDataflowGraphRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataflowGraph(request);
    }

    @SdkInternalApi
    final GetDataflowGraphResult executeGetDataflowGraph(GetDataflowGraphRequest getDataflowGraphRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataflowGraphRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataflowGraphRequest> request = null;
        Response<GetDataflowGraphResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataflowGraphRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataflowGraphRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataflowGraphResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataflowGraphResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a specified DevEndpoint.
     * </p>
     * 
     * @param getDevEndpointRequest
     * @return Result of the GetDevEndpoint operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSGlue.GetDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDevEndpointResult getDevEndpoint(GetDevEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevEndpoint(request);
    }

    @SdkInternalApi
    final GetDevEndpointResult executeGetDevEndpoint(GetDevEndpointRequest getDevEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(getDevEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevEndpointRequest> request = null;
        Response<GetDevEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDevEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDevEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDevEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all the DevEndpoints in this AWS account.
     * </p>
     * 
     * @param getDevEndpointsRequest
     * @return Result of the GetDevEndpoints operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSGlue.GetDevEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDevEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDevEndpointsResult getDevEndpoints(GetDevEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevEndpoints(request);
    }

    @SdkInternalApi
    final GetDevEndpointsResult executeGetDevEndpoints(GetDevEndpointsRequest getDevEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDevEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevEndpointsRequest> request = null;
        Response<GetDevEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDevEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDevEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDevEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an existing job definition.
     * </p>
     * 
     * @param getJobRequest
     * @return Result of the GetJob operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobResult getJob(GetJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetJob(request);
    }

    @SdkInternalApi
    final GetJobResult executeGetJob(GetJobRequest getJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRequest> request = null;
        Response<GetJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the metadata for a given job run.
     * </p>
     * 
     * @param getJobRunRequest
     * @return Result of the GetJobRun operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobRunResult getJobRun(GetJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobRun(request);
    }

    @SdkInternalApi
    final GetJobRunResult executeGetJobRun(GetJobRunRequest getJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRunRequest> request = null;
        Response<GetJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobRunResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves metadata for all runs of a given job.
     * </p>
     * 
     * @param getJobRunsRequest
     * @return Result of the GetJobRuns operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobRunsResult getJobRuns(GetJobRunsRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobRuns(request);
    }

    @SdkInternalApi
    final GetJobRunsResult executeGetJobRuns(GetJobRunsRequest getJobRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRunsRequest> request = null;
        Response<GetJobRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobRunsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all current jobs.
     * </p>
     * 
     * @param getJobsRequest
     * @return Result of the GetJobs operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobsResult getJobs(GetJobsRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobs(request);
    }

    @SdkInternalApi
    final GetJobsResult executeGetJobs(GetJobsRequest getJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobsRequest> request = null;
        Response<GetJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates mappings.
     * </p>
     * 
     * @param getMappingRequest
     * @return Result of the GetMapping operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSGlue.GetMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMapping" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMappingResult getMapping(GetMappingRequest request) {
        request = beforeClientExecution(request);
        return executeGetMapping(request);
    }

    @SdkInternalApi
    final GetMappingResult executeGetMapping(GetMappingRequest getMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(getMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMappingRequest> request = null;
        Response<GetMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMappingResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a specified partition.
     * </p>
     * 
     * @param getPartitionRequest
     * @return Result of the GetPartition operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetPartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPartitionResult getPartition(GetPartitionRequest request) {
        request = beforeClientExecution(request);
        return executeGetPartition(request);
    }

    @SdkInternalApi
    final GetPartitionResult executeGetPartition(GetPartitionRequest getPartitionRequest) {

        ExecutionContext executionContext = createExecutionContext(getPartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPartitionRequest> request = null;
        Response<GetPartitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPartitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPartitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPartitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPartitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the partitions in a table.
     * </p>
     * 
     * @param getPartitionsRequest
     * @return Result of the GetPartitions operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.GetPartitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartitions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPartitionsResult getPartitions(GetPartitionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetPartitions(request);
    }

    @SdkInternalApi
    final GetPartitionsResult executeGetPartitions(GetPartitionsRequest getPartitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getPartitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPartitionsRequest> request = null;
        Response<GetPartitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPartitionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPartitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPartitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPartitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a Python script to perform a specified mapping.
     * </p>
     * 
     * @param getPlanRequest
     * @return Result of the GetPlan operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPlan" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPlanResult getPlan(GetPlanRequest request) {
        request = beforeClientExecution(request);
        return executeGetPlan(request);
    }

    @SdkInternalApi
    final GetPlanResult executeGetPlan(GetPlanRequest getPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(getPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPlanRequest> request = null;
        Response<GetPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPlanResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the <code>Table</code> definition in a Data Catalog for a specified table.
     * </p>
     * 
     * @param getTableRequest
     * @return Result of the GetTable operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTableResult getTable(GetTableRequest request) {
        request = beforeClientExecution(request);
        return executeGetTable(request);
    }

    @SdkInternalApi
    final GetTableResult executeGetTable(GetTableRequest getTableRequest) {

        ExecutionContext executionContext = createExecutionContext(getTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTableRequest> request = null;
        Response<GetTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTableResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of strings that identify available versions of a specified table.
     * </p>
     * 
     * @param getTableVersionsRequest
     * @return Result of the GetTableVersions operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetTableVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTableVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTableVersionsResult getTableVersions(GetTableVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetTableVersions(request);
    }

    @SdkInternalApi
    final GetTableVersionsResult executeGetTableVersions(GetTableVersionsRequest getTableVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getTableVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTableVersionsRequest> request = null;
        Response<GetTableVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTableVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTableVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTableVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTableVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the definitions of some or all of the tables in a given <code>Database</code>.
     * </p>
     * 
     * @param getTablesRequest
     * @return Result of the GetTables operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.GetTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTables" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTablesResult getTables(GetTablesRequest request) {
        request = beforeClientExecution(request);
        return executeGetTables(request);
    }

    @SdkInternalApi
    final GetTablesResult executeGetTables(GetTablesRequest getTablesRequest) {

        ExecutionContext executionContext = createExecutionContext(getTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTablesRequest> request = null;
        Response<GetTablesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTablesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTablesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTablesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTablesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the definition of a trigger.
     * </p>
     * 
     * @param getTriggerRequest
     * @return Result of the GetTrigger operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTriggerResult getTrigger(GetTriggerRequest request) {
        request = beforeClientExecution(request);
        return executeGetTrigger(request);
    }

    @SdkInternalApi
    final GetTriggerResult executeGetTrigger(GetTriggerRequest getTriggerRequest) {

        ExecutionContext executionContext = createExecutionContext(getTriggerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTriggerRequest> request = null;
        Response<GetTriggerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTriggerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTriggerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTriggerResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTriggerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all the triggers associated with a job.
     * </p>
     * 
     * @param getTriggersRequest
     * @return Result of the GetTriggers operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTriggers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTriggersResult getTriggers(GetTriggersRequest request) {
        request = beforeClientExecution(request);
        return executeGetTriggers(request);
    }

    @SdkInternalApi
    final GetTriggersResult executeGetTriggers(GetTriggersRequest getTriggersRequest) {

        ExecutionContext executionContext = createExecutionContext(getTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTriggersRequest> request = null;
        Response<GetTriggersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTriggersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTriggersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTriggersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTriggersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a specified function definition from the Data Catalog.
     * </p>
     * 
     * @param getUserDefinedFunctionRequest
     * @return Result of the GetUserDefinedFunction operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetUserDefinedFunctionResult getUserDefinedFunction(GetUserDefinedFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeGetUserDefinedFunction(request);
    }

    @SdkInternalApi
    final GetUserDefinedFunctionResult executeGetUserDefinedFunction(GetUserDefinedFunctionRequest getUserDefinedFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserDefinedFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserDefinedFunctionRequest> request = null;
        Response<GetUserDefinedFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserDefinedFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUserDefinedFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserDefinedFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetUserDefinedFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a multiple function definitions from the Data Catalog.
     * </p>
     * 
     * @param getUserDefinedFunctionsRequest
     * @return Result of the GetUserDefinedFunctions operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.GetUserDefinedFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUserDefinedFunctions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetUserDefinedFunctionsResult getUserDefinedFunctions(GetUserDefinedFunctionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetUserDefinedFunctions(request);
    }

    @SdkInternalApi
    final GetUserDefinedFunctionsResult executeGetUserDefinedFunctions(GetUserDefinedFunctionsRequest getUserDefinedFunctionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserDefinedFunctionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserDefinedFunctionsRequest> request = null;
        Response<GetUserDefinedFunctionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserDefinedFunctionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getUserDefinedFunctionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserDefinedFunctionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetUserDefinedFunctionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports an existing Athena Data Catalog to AWS Glue
     * </p>
     * 
     * @param importCatalogToGlueRequest
     * @return Result of the ImportCatalogToGlue operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.ImportCatalogToGlue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ImportCatalogToGlue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportCatalogToGlueResult importCatalogToGlue(ImportCatalogToGlueRequest request) {
        request = beforeClientExecution(request);
        return executeImportCatalogToGlue(request);
    }

    @SdkInternalApi
    final ImportCatalogToGlueResult executeImportCatalogToGlue(ImportCatalogToGlueRequest importCatalogToGlueRequest) {

        ExecutionContext executionContext = createExecutionContext(importCatalogToGlueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportCatalogToGlueRequest> request = null;
        Response<ImportCatalogToGlueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportCatalogToGlueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importCatalogToGlueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportCatalogToGlueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportCatalogToGlueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resets a bookmark entry.
     * </p>
     * 
     * @param resetJobBookmarkRequest
     * @return Result of the ResetJobBookmark operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.ResetJobBookmark
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ResetJobBookmark" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResetJobBookmarkResult resetJobBookmark(ResetJobBookmarkRequest request) {
        request = beforeClientExecution(request);
        return executeResetJobBookmark(request);
    }

    @SdkInternalApi
    final ResetJobBookmarkResult executeResetJobBookmark(ResetJobBookmarkRequest resetJobBookmarkRequest) {

        ExecutionContext executionContext = createExecutionContext(resetJobBookmarkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetJobBookmarkRequest> request = null;
        Response<ResetJobBookmarkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetJobBookmarkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetJobBookmarkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetJobBookmarkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResetJobBookmarkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running,
     * does nothing.
     * </p>
     * 
     * @param startCrawlerRequest
     * @return Result of the StartCrawler operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws CrawlerRunningException
     *         The operation cannot be performed because the crawler is already running.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.StartCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartCrawlerResult startCrawler(StartCrawlerRequest request) {
        request = beforeClientExecution(request);
        return executeStartCrawler(request);
    }

    @SdkInternalApi
    final StartCrawlerResult executeStartCrawler(StartCrawlerRequest startCrawlerRequest) {

        ExecutionContext executionContext = createExecutionContext(startCrawlerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCrawlerRequest> request = null;
        Response<StartCrawlerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCrawlerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startCrawlerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCrawlerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartCrawlerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the schedule state of the specified crawler to <code>SCHEDULED</code>, unless the crawler is already
     * running or the schedule state is already <code>SCHEDULED</code>.
     * </p>
     * 
     * @param startCrawlerScheduleRequest
     * @return Result of the StartCrawlerSchedule operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws SchedulerRunningException
     *         The specified scheduler is already running.
     * @throws SchedulerTransitioningException
     *         The specified scheduler is transitioning.
     * @throws NoScheduleException
     *         There is no applicable schedule.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.StartCrawlerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartCrawlerSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartCrawlerScheduleResult startCrawlerSchedule(StartCrawlerScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeStartCrawlerSchedule(request);
    }

    @SdkInternalApi
    final StartCrawlerScheduleResult executeStartCrawlerSchedule(StartCrawlerScheduleRequest startCrawlerScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(startCrawlerScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCrawlerScheduleRequest> request = null;
        Response<StartCrawlerScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCrawlerScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startCrawlerScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCrawlerScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartCrawlerScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs a job.
     * </p>
     * 
     * @param startJobRunRequest
     * @return Result of the StartJobRun operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws ConcurrentRunsExceededException
     *         Too many jobs are being run concurrently.
     * @sample AWSGlue.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartJobRunResult startJobRun(StartJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeStartJobRun(request);
    }

    @SdkInternalApi
    final StartJobRunResult executeStartJobRun(StartJobRunRequest startJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(startJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartJobRunRequest> request = null;
        Response<StartJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartJobRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an existing trigger.
     * </p>
     * 
     * @param startTriggerRequest
     * @return Result of the StartTrigger operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws ConcurrentRunsExceededException
     *         Too many jobs are being run concurrently.
     * @sample AWSGlue.StartTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartTriggerResult startTrigger(StartTriggerRequest request) {
        request = beforeClientExecution(request);
        return executeStartTrigger(request);
    }

    @SdkInternalApi
    final StartTriggerResult executeStartTrigger(StartTriggerRequest startTriggerRequest) {

        ExecutionContext executionContext = createExecutionContext(startTriggerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTriggerRequest> request = null;
        Response<StartTriggerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTriggerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startTriggerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartTriggerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartTriggerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * If the specified crawler is running, stops the crawl.
     * </p>
     * 
     * @param stopCrawlerRequest
     * @return Result of the StopCrawler operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws CrawlerNotRunningException
     *         The specified crawler is not running.
     * @throws CrawlerStoppingException
     *         The specified crawler is stopping.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.StopCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopCrawlerResult stopCrawler(StopCrawlerRequest request) {
        request = beforeClientExecution(request);
        return executeStopCrawler(request);
    }

    @SdkInternalApi
    final StopCrawlerResult executeStopCrawler(StopCrawlerRequest stopCrawlerRequest) {

        ExecutionContext executionContext = createExecutionContext(stopCrawlerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopCrawlerRequest> request = null;
        Response<StopCrawlerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopCrawlerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopCrawlerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopCrawlerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopCrawlerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the schedule state of the specified crawler to <code>NOT_SCHEDULED</code>, but does not stop the crawler if
     * it is already running.
     * </p>
     * 
     * @param stopCrawlerScheduleRequest
     * @return Result of the StopCrawlerSchedule operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws SchedulerNotRunningException
     *         The specified scheduler is not running.
     * @throws SchedulerTransitioningException
     *         The specified scheduler is transitioning.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.StopCrawlerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopCrawlerSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopCrawlerScheduleResult stopCrawlerSchedule(StopCrawlerScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeStopCrawlerSchedule(request);
    }

    @SdkInternalApi
    final StopCrawlerScheduleResult executeStopCrawlerSchedule(StopCrawlerScheduleRequest stopCrawlerScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(stopCrawlerScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopCrawlerScheduleRequest> request = null;
        Response<StopCrawlerScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopCrawlerScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopCrawlerScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopCrawlerScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopCrawlerScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a specified trigger.
     * </p>
     * 
     * @param stopTriggerRequest
     * @return Result of the StopTrigger operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.StopTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopTriggerResult stopTrigger(StopTriggerRequest request) {
        request = beforeClientExecution(request);
        return executeStopTrigger(request);
    }

    @SdkInternalApi
    final StopTriggerResult executeStopTrigger(StopTriggerRequest stopTriggerRequest) {

        ExecutionContext executionContext = createExecutionContext(stopTriggerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTriggerRequest> request = null;
        Response<StopTriggerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTriggerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopTriggerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopTriggerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopTriggerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing classifier (either a <code>GrokClassifier</code> or an <code>XMLClassifier</code>).
     * </p>
     * 
     * @param updateClassifierRequest
     * @return Result of the UpdateClassifier operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws VersionMismatchException
     *         There was a version conflict.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.UpdateClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateClassifierResult updateClassifier(UpdateClassifierRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateClassifier(request);
    }

    @SdkInternalApi
    final UpdateClassifierResult executeUpdateClassifier(UpdateClassifierRequest updateClassifierRequest) {

        ExecutionContext executionContext = createExecutionContext(updateClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClassifierRequest> request = null;
        Response<UpdateClassifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClassifierRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateClassifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateClassifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateClassifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a connection definition in the Data Catalog.
     * </p>
     * 
     * @param updateConnectionRequest
     * @return Result of the UpdateConnection operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.UpdateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateConnection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateConnectionResult updateConnection(UpdateConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConnection(request);
    }

    @SdkInternalApi
    final UpdateConnectionResult executeUpdateConnection(UpdateConnectionRequest updateConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConnectionRequest> request = null;
        Response<UpdateConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a crawler. If a crawler is running, you must stop it using <code>StopCrawler</code> before updating it.
     * </p>
     * 
     * @param updateCrawlerRequest
     * @return Result of the UpdateCrawler operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws VersionMismatchException
     *         There was a version conflict.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws CrawlerRunningException
     *         The operation cannot be performed because the crawler is already running.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.UpdateCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateCrawlerResult updateCrawler(UpdateCrawlerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCrawler(request);
    }

    @SdkInternalApi
    final UpdateCrawlerResult executeUpdateCrawler(UpdateCrawlerRequest updateCrawlerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCrawlerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCrawlerRequest> request = null;
        Response<UpdateCrawlerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCrawlerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCrawlerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCrawlerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCrawlerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the schedule of a crawler using a <code>cron</code> expression.
     * </p>
     * 
     * @param updateCrawlerScheduleRequest
     * @return Result of the UpdateCrawlerSchedule operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws VersionMismatchException
     *         There was a version conflict.
     * @throws SchedulerTransitioningException
     *         The specified scheduler is transitioning.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.UpdateCrawlerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateCrawlerSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateCrawlerScheduleResult updateCrawlerSchedule(UpdateCrawlerScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCrawlerSchedule(request);
    }

    @SdkInternalApi
    final UpdateCrawlerScheduleResult executeUpdateCrawlerSchedule(UpdateCrawlerScheduleRequest updateCrawlerScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCrawlerScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCrawlerScheduleRequest> request = null;
        Response<UpdateCrawlerScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCrawlerScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCrawlerScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCrawlerScheduleResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateCrawlerScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing database definition in a Data Catalog.
     * </p>
     * 
     * @param updateDatabaseRequest
     * @return Result of the UpdateDatabase operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.UpdateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDatabaseResult updateDatabase(UpdateDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDatabase(request);
    }

    @SdkInternalApi
    final UpdateDatabaseResult executeUpdateDatabase(UpdateDatabaseRequest updateDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatabaseRequest> request = null;
        Response<UpdateDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a specified DevEndpoint.
     * </p>
     * 
     * @param updateDevEndpointRequest
     * @return Result of the UpdateDevEndpoint operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws ValidationException
     *         A value could not be validated.
     * @sample AWSGlue.UpdateDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDevEndpointResult updateDevEndpoint(UpdateDevEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDevEndpoint(request);
    }

    @SdkInternalApi
    final UpdateDevEndpointResult executeUpdateDevEndpoint(UpdateDevEndpointRequest updateDevEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDevEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDevEndpointRequest> request = null;
        Response<UpdateDevEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDevEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDevEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDevEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDevEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing job definition.
     * </p>
     * 
     * @param updateJobRequest
     * @return Result of the UpdateJob operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.UpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateJobResult updateJob(UpdateJobRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJob(request);
    }

    @SdkInternalApi
    final UpdateJobResult executeUpdateJob(UpdateJobRequest updateJobRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobRequest> request = null;
        Response<UpdateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a partition.
     * </p>
     * 
     * @param updatePartitionRequest
     * @return Result of the UpdatePartition operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.UpdatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePartitionResult updatePartition(UpdatePartitionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePartition(request);
    }

    @SdkInternalApi
    final UpdatePartitionResult executeUpdatePartition(UpdatePartitionRequest updatePartitionRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePartitionRequest> request = null;
        Response<UpdatePartitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePartitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePartitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePartitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePartitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a metadata table in the Data Catalog.
     * </p>
     * 
     * @param updateTableRequest
     * @return Result of the UpdateTable operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTableResult updateTable(UpdateTableRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTable(request);
    }

    @SdkInternalApi
    final UpdateTableResult executeUpdateTable(UpdateTableRequest updateTableRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTableRequest> request = null;
        Response<UpdateTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a trigger definition.
     * </p>
     * 
     * @param updateTriggerRequest
     * @return Result of the UpdateTrigger operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.UpdateTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTriggerResult updateTrigger(UpdateTriggerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTrigger(request);
    }

    @SdkInternalApi
    final UpdateTriggerResult executeUpdateTrigger(UpdateTriggerRequest updateTriggerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTriggerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTriggerRequest> request = null;
        Response<UpdateTriggerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTriggerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTriggerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTriggerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTriggerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing function definition in the Data Catalog.
     * </p>
     * 
     * @param updateUserDefinedFunctionRequest
     * @return Result of the UpdateUserDefinedFunction operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.UpdateUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateUserDefinedFunctionResult updateUserDefinedFunction(UpdateUserDefinedFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserDefinedFunction(request);
    }

    @SdkInternalApi
    final UpdateUserDefinedFunctionResult executeUpdateUserDefinedFunction(UpdateUserDefinedFunctionRequest updateUserDefinedFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserDefinedFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserDefinedFunctionRequest> request = null;
        Response<UpdateUserDefinedFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserDefinedFunctionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateUserDefinedFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserDefinedFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateUserDefinedFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
