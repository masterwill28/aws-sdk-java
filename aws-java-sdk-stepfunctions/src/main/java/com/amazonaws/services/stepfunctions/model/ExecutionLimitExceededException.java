/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.model;

import javax.annotation.Generated;

/**
 * <p>
 * The maximum number of running executions has been reached. Running executions must end or be stopped before a new
 * execution can be started.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionLimitExceededException extends com.amazonaws.services.stepfunctions.model.AWSStepFunctionsException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ExecutionLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ExecutionLimitExceededException(String message) {
        super(message);
    }

}
